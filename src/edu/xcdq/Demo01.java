package edu.xcdq;

public class Demo01 {
    public static void  main (String [] args ){
        int divisor = 10 ;
        int dividend = 0 ;
        try{
            // 试着执行代码块的内容
            System.out.println(divisor / dividend );   //  ArithmeticException 算数异常
        }catch (Exception e ) {  // 捕获异常
            e.printStackTrace();
            System.out.println("程序捕获到了对应的异常");
        } finally {   // 不管怎样都会执行
            System.out.println("不管有没有出错，都会执行");
        }
        // System.out.println(divisor / dividend);

        System.out.println("拉拉啊啦啦啦拉拉。我是后续的内容");

    }
}
