package edu.xcdq;

import java.awt.geom.Area;
import java.rmi.UnexpectedException;

public class Demo02 {
    public static void main(String[] args) {
        int [] a = new int[3];
        a[0] = (char)'1' ;
         a[1] = 0;     // ASCII 96
        a[2] = 1 ;

        try{
            System.out.println(a[0] / a[1] );
        }catch (NumberFormatException | ArithmeticException e ){
            System.out.println("数字格式或者算数异常");
        } /*catch (ArithmeticException e ){
            System.out.println("异常");
        }*/

    }
}
