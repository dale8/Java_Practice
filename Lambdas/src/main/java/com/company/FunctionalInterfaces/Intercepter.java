package com.company.FunctionalInterfaces;

import java.util.function.Consumer;
import java.util.function.Function;

@FunctionalInterface
public interface Intercepter<T, U> {
    Function<T, T> intercept(Function<T, T> function, Consumer<U> consumer);
}
