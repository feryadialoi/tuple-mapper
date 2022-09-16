package com.github.feryadialoi.tuplemapper;

import reactor.util.function.Tuple2;
import reactor.util.function.Tuple3;
import reactor.util.function.Tuple4;
import reactor.util.function.Tuple5;
import reactor.util.function.Tuple6;
import reactor.util.function.Tuple7;
import reactor.util.function.Tuple8;

import java.util.function.Function;

public class TupleMapper {
    public static <T1, T2, R> R map(Tuple2<T1, T2> tuple2, Tuple2Function<T1, T2, R> tuple2Function) {
        return tuple2Function.apply(tuple2.getT1(), tuple2.getT2());
    }

    public static <T1, T2, T3, R> R map(Tuple3<T1, T2, T3> tuple3, Tuple3Function<T1, T2, T3, R> tuple3Function) {
        return tuple3Function.apply(tuple3.getT1(), tuple3.getT2(), tuple3.getT3());
    }

    public static <T1, T2, T3, T4, R> R map(Tuple4<T1, T2, T3, T4> tuple4, Tuple4Function<T1, T2, T3, T4, R> tuple4Function) {
        return tuple4Function.apply(tuple4.getT1(), tuple4.getT2(), tuple4.getT3(), tuple4.getT4());
    }

    public static <T1, T2, T3, T4, T5, R> R map(Tuple5<T1, T2, T3, T4, T5> tuple5, Tuple5Function<T1, T2, T3, T4, T5, R> tuple5Function) {
        return tuple5Function.apply(tuple5.getT1(), tuple5.getT2(), tuple5.getT3(), tuple5.getT4(), tuple5.getT5());
    }

    public static <T1, T2, T3, T4, T5, T6, R> R map(Tuple6<T1, T2, T3, T4, T5, T6> tuple6, Tuple6Function<T1, T2, T3, T4, T5, T6, R> tuple6Function) {
        return tuple6Function.apply(tuple6.getT1(), tuple6.getT2(), tuple6.getT3(), tuple6.getT4(), tuple6.getT5(), tuple6.getT6());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> R map(Tuple7<T1, T2, T3, T4, T5, T6, T7> tuple7, Tuple7Function<T1, T2, T3, T4, T5, T6, T7, R> tuple7Function) {
        return tuple7Function.apply(tuple7.getT1(), tuple7.getT2(), tuple7.getT3(), tuple7.getT4(), tuple7.getT5(), tuple7.getT6(), tuple7.getT7());
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> R map(Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> tuple8, Tuple8Function<T1, T2, T3, T4, T5, T6, T7, T8, R> tuple8Function) {
        return tuple8Function.apply(tuple8.getT1(), tuple8.getT2(), tuple8.getT3(), tuple8.getT4(), tuple8.getT5(), tuple8.getT6(), tuple8.getT7(), tuple8.getT8());
    }

    // Function<Tuple, TupleFunction>
    public static <T1, T2, R> Function<Tuple2<T1, T2>, R> map(Tuple2Function<T1, T2, R> tuple2Function) {
        return tuple2 -> TupleMapper.map(tuple2, tuple2Function);
    }

    public static <T1, T2, T3, R> Function<Tuple3<T1, T2, T3>, R> map(Tuple3Function<T1, T2, T3, R> tuple3Function) {
        return tuple3 -> TupleMapper.map(tuple3, tuple3Function);
    }

    public static <T1, T2, T3, T4, R> Function<Tuple4<T1, T2, T3, T4>, R> map(Tuple4Function<T1, T2, T3, T4, R> tuple4Function) {
        return tuple4 -> TupleMapper.map(tuple4, tuple4Function);
    }

    public static <T1, T2, T3, T4, T5, R> Function<Tuple5<T1, T2, T3, T4, T5>, R> map(Tuple5Function<T1, T2, T3, T4, T5, R> tuple5Function) {
        return tuple5 -> TupleMapper.map(tuple5, tuple5Function);
    }

    public static <T1, T2, T3, T4, T5, T6, R> Function<Tuple6<T1, T2, T3, T4, T5, T6>, R> map(Tuple6Function<T1, T2, T3, T4, T5, T6, R> tuple6Function) {
        return tuple6 -> TupleMapper.map(tuple6, tuple6Function);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> Function<Tuple7<T1, T2, T3, T4, T5, T6, T7>, R> map(Tuple7Function<T1, T2, T3, T4, T5, T6, T7, R> tuple7Function) {
        return tuple7 -> TupleMapper.map(tuple7, tuple7Function);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Function<Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>, R> map(Tuple8Function<T1, T2, T3, T4, T5, T6, T7, T8, R> tuple8Function) {
        return tuple8 -> TupleMapper.map(tuple8, tuple8Function);
    }
}
