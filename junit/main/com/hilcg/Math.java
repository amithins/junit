package com.hilcg;

/**
 * Created by Leo.Liu on 2015/4/1.
 */
public class Math {

    public int add( int a, int b){

        return a + b;
    }

    public long divison( int a, int b) {

        if ( 0 == b ) {
            throw new ArithmeticException("除数不能为零！");
        }

        return a / b;
    }
}
