package com.github.feryadialoi.tuplemapper;

public interface Tuple4Function<T1, T2, T3, T4, R> {
    R apply(T1 t1, T2 t2, T3 t3, T4 t4);
}
