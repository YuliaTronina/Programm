package Lab_5;

public class CharInput{
   private char char1;

   public int getChar1() {
        return (int) char1;
    }

    public void setChar1(char char1) {
        this.char1 = char1;
    }

    public String OutChar (){
        return (char1 + " " + (int) char1);
    }

}
