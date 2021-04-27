package edu.xcdq;

public class Demo04 {
    /*
    * 调用者的异常类型要比调用的异常类型 “大" Exception >= SexException
    * */
    public static void main(String[] args) throws SexException{
        setSex("变形人");
    }
    public static void setSex(String sex) throws SexException{
        if (!(sex.equals("男") || sex.equals("女"))){
            throw new SexException("性别既不是男也不是女");
        }
    }
}
