package Laba_7;

public class SuperClass_Task2 {
   private String str1;

    public void setStr1WithAut () {
        this.str1 = "Параметр отсутствует";
    }

   public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr1() {
        return str1;
    }

    public SuperClass_Task2(String str1) {
        this.str1 = str1;
    }

    final int stringLenght (){
        return str1.length();
    }

}
