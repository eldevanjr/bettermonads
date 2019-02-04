package com.infokaw.monads;


public interface TryMapFunction<T, R> {
    R apply(T t) throws Throwable;
}
