package Laba_8;


class ArrayOneD {
    static int k = 0;
    static int i = 0;
    static int [] arrayOneD;
    static int size = 0;

    public static int [] arrayOneDCreate(int...array) {
        if (array.length == 0 || array == null) {
            System.out.println("Не введено ни одного значения");
            return arrayOneD = new int[1];
        }

        else {
            while (size == 0) {
                size = array.length;
                arrayOneD = new int[size];
            }

            arrayOneD[i] = array[i];


            if (i < size - 1) {
                i++;
                arrayOneDCreate(array);
            }
            return arrayOneD;
        }
    }

     public static void arrayOneDPrint (int [] array){
        System.out.print(array [k]+ "  ");
        if (k<array.length-1){
            k++;
            arrayOneDPrint(array);
        }
     }

    public static void main(String[] args) {
    int [] array = arrayOneDCreate(1,2,3,5,6,7,8,5);
    arrayOneDPrint(array);
   }

}
