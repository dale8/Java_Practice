package com.company.FunctionalInterfaces;

import java.util.function.Function;

@FunctionalInterface
public interface Compositor <T>{

    Function<T, T> compose(Function<T, T> f1, Function<T, T> f2);
}
