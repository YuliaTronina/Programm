package Report;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        scan.useDelimiter("'");

        while (scan.hasNext()) {
            System.out.println(scan.next());
        }

        scan.close();
    }
}
