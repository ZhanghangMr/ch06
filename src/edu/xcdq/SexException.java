package edu.xcdq;

import java.rmi.ServerException;
/*
* 1 需要继承自Exception
* 2 需要重复无参构造方法
* 3 需要复写 message 参数的构造方法
*
* */
public class SexException extends  Exception {
    public SexException(){

    }
    public  SexException(String message){
        super(message);
        System.out.println("性别异常");
    }
}
