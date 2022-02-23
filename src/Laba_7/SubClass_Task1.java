package Laba_7;

public class SubClass_Task1 extends SuperClass_Task1{
    private String str2;
    private String str3;

    SubClass_Task1 (String str1){
        super(str1);
    }

    SubClass_Task1 (String str2, String str3) {
        super(str2);
        this.str3 = str3;
    }

    @Override
    public String toString (){
        String subClassName;
        if (str3 == null) {
        subClassName = getClass().getName() + " " + getStr1();
        }
        else {
            subClassName = getClass().getName() + " " + getStr1() + str3;
        }
        return subClassName;

    }


}
