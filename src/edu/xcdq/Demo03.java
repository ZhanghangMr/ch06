package edu.xcdq;

public class Demo03 {
    public static void main(String[] args) {

    }

    // 1 可以单独声明异常 2 抛出异常的同时,必须声明异常
    public void setSex (String sex ) throws  Exception {  // 声明有可能异常
        if (!(sex.equals("男") || sex.equals("女"))){
            throw new Exception("性别既不是男也不是女");
        }
    }

}
