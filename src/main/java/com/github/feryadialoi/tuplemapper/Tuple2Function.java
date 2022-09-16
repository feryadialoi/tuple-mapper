package com.github.feryadialoi.tuplemapper;

public interface Tuple2Function<T1, T2, R> {
    R apply(T1 t1, T2 t2);
}
