import java.util.Scanner;
public class L4_8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введите слово: ");
		String Letter1 = in.nextLine();
		System.out.print("Введите код: ");
		int key = in.nextInt();
		
		char oldText [] = Letter1.toCharArray();
		long simbols [] = new long[oldText.length];
		char newText [] = new char[oldText.length];
		
		for(int i=0; i<oldText.length; i++) {
			simbols[i] = oldText[i] + key;
			newText[i] = (char)simbols[i];
		}
		
		String Letter2;
		Letter2 = new String (newText);
		
		System.out.println("Новое слово: " + Letter2);
		
		System.out.print("Нужно декодировать ? (y/n): ");
		//Scanner scan = new Scanner(System.in);
		String ans = in.next();
		
		switch(ans) {
		case "y":{
			char oldText2 [] = Letter2.toCharArray();
			long simbols2 [] = new long[newText.length];
			char newText2 [] = new char[newText.length];
			
			for(int j=0; j<newText.length; j++) {
				simbols2[j] = oldText2[j] - key;
				newText2[j] = (char)simbols2[j];
			}
			
			String Letter3;
			Letter3 = new String (newText2);
			
			System.out.println("Начальное слово: " + Letter3);
			break;
		}
		case "n":{
			System.out.println("До свидания!");
			break;
		}
		default:{
		System.out.println("Недопустимый символ");
		}
		}
	}
}