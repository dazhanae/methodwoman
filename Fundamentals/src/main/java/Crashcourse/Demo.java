package Crashcourse;

public class Demo {

    public String nickName;

    public Demo(String nickName){
        this.nickName = nickName;

    }

 public String welcomeMethod(String yourNameHere){
        return "Your name is : "+  yourNameHere + this.nickName;
 }
    }
