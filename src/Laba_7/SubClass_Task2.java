package Laba_7;

public class SubClass_Task2 extends SuperClass_Task2 {
    int num;
    String str2;


    public SubClass_Task2(String str1, int num) {
        super(str1);
        this.num = num;
    }

    @Override
    public void setStr1WithAut() {
        System.out.println("Переопределенный метод без параметров в подклассе");
    }

    @Override
    public void setStr1(String str1) {
        System.out.println("Переопределенный метод с одним параметром в подклассе - "+ str1);
    }


//Перегрузка метода с целочисленным параметром
     public int setStr1(int num) {
         return num;
     }

//Перегрузка метода с целочисленным и текстовым параметром
    public String setStr1 (String str2, int num) {
        String name = "Строка - " + str2 + ", число - " + num;
        return name;
    }

}
