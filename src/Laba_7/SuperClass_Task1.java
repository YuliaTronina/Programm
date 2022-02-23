package Laba_7;

public class SuperClass_Task1 {
    private String str1;

    SuperClass_Task1 (String str1){
        this.str1 = str1;
    }

    SuperClass_Task1 (){

    }

    public String getStr1() {
        return str1;
    }

    @Override
    public String toString (){
        return getClass().getName() + " " + str1;
    }

}
