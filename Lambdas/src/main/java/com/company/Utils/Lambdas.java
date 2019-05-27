package com.company.Utils;

import com.company.FunctionalInterfaces.Compositor;
import com.company.FunctionalInterfaces.Intercepter;
import com.company.FunctionalInterfaces.PentaryOperator;
import com.company.FunctionalInterfaces.TernaryOperator;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;
import java.util.regex.Pattern;

public class Lambdas {
    public static Consumer<String> welcome(){
        return System.out::println;
    }

    public static Consumer<String> welcomeUser(){
        return n -> System.out.println("Hello, " + n);
    }

    public static Function<Consumer<String>, Consumer<String>> niceDay() {
        return cons -> name -> {
            cons.accept(name);
            System.out.println("Have a nice day");
        };
    }

    public static Supplier<LocalTime> getTime(){
        return LocalTime::now;
    }

    public static Predicate<String> isEmail(){
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w{2,5}", Pattern.CASE_INSENSITIVE);
        return x -> pattern.matcher(x).matches();
    }

    public static Function<Predicate<String>, Predicate<String>> isMore10CharEm(){
        return x -> z -> x.test(z) && z.length() >= 10;
    }

    public static Supplier<Predicate<Integer>> isFibonacci(){
        return () -> {
            ArrayList<Integer> fibiList = new ArrayList<>();
            fibiList.add(0);
            fibiList.add(1);

            return number -> {
                while (number > fibiList.get(fibiList.size() - 1)){
                    fibiList.add(fibiList.get(fibiList.size() - 1) + fibiList.get(fibiList.size() - 2));
                    System.out.println("calculating");
                }
                return fibiList.contains(number);
            };
        };
    }

    public  static BinaryOperator<Integer> sumInts(){
        return Integer::sum;
    }

    public static Function<BinaryOperator<Integer>, BiFunction<Integer, Integer, Integer>> squareSum(){
        return binOp -> binOp.andThen(x -> x * x);
    }

    public static TernaryOperator<Integer> sumThreeNums(){
        return (x, y, z) -> x + y + z;
    }

    public static UnaryOperator<Integer> squareNum(){
        return x -> x * x;
    }

    public static BiFunction<UnaryOperator<Integer>, Integer, Integer> preIncrement(){
        return (unOp, integ) -> unOp.apply(integ + 1);
    }

    public static Function<UnaryOperator<Integer>, UnaryOperator<Integer>> preInc(){
        return unOp -> x -> unOp.apply(x + 1);
    }

    public static Function<
            BiFunction<UnaryOperator<Integer>, Integer, Integer>,
            BiFunction<UnaryOperator<Integer>, Integer, Integer>
            > postDecrement(){
        return biFunc -> biFunc.andThen(x -> x - 1);
    }

    public static Function<
            Function<UnaryOperator<Integer>, UnaryOperator<Integer>>,
            Function<UnaryOperator<Integer>, Function<Integer, Integer>>
            > postDec(){
        return func -> unOp -> func.apply(unOp).andThen(x -> x - 1);
    }

    public static UnaryOperator<Integer> solveEquation(){
        return x -> x*x + 3*x - 1;
    }

    public static Function<UnaryOperator<Integer>, UnaryOperator<Integer>> solveComplEq(){
        return unOp -> x -> {
            int z = unOp.apply(x);
            return  z*z + 3*z - 1;
        };
    }

    public static PentaryOperator<Integer> sumOfCubedFive(){
        return (x, y, z, u, v) ->
                (int)Math.pow(x, 3)
                        + (int)Math.pow(y, 3)
                        + (int)Math.pow(z, 3)
                        + (int)Math.pow(u, 3)
                        + (int)Math.pow(v, 3);
    }

    public static Function<Integer, UnaryOperator<Integer>> power(){
        return power -> value -> (int) Math.pow(value, power);
    }

    public static Compositor<Integer> getDerivative(){
        return (x, y) -> z -> y.compose(x).apply(z);
    }

    public static Function<List<Integer>, Function<Integer, Integer>> getPolinom (){
        return list -> {
            if (list.size() > 1){
                return xValue ->{
                    int res = 0;
                    for (int i = list.size()-1; i >= 0; i--){
                        int y = list.get(i);
                        for (int z = 0; z < list.size()-1 - i; z++){
                            y = y * xValue;
                        }
                        res += y;
                    }
                    return res;
                };
            } else {
                return x -> list.get(0);
            }
        };
    }

    public static Function<Supplier<Double>, Double> cacheRand(){
        Map<Integer, Double> cache = new HashMap<>();
        return supplier -> cache.computeIfAbsent(supplier.hashCode(), x -> supplier.get());
    }

    public static Function<Supplier<Integer>, Integer> catchErr(){
        return supplier -> {
            while (true){
                try {
                    return supplier.get();
                }catch (RuntimeException e){
                    System.out.println(e.getMessage());
                }
            }
        };
    }

    public static Intercepter<Integer, String> writeLog(){
        return (func, cons) -> x -> {
            cons.accept("before: " + x);
            int y = func.apply(x);
            cons.accept("after: " + y);
            return y;
        };
    }

    public static Function<Integer, Supplier<Integer>> countFromX(){
        return x -> {
            Counter counter = new Counter(x);
            return () -> counter.counterVal++;
        };
    }
}
