package GameCranes;

import java.util.Scanner;

public class Cranes {public static void main(String[] arg) {
	
	int a = enterNumber();
	
	int c = a / 3;
	int c1 = c % 2;
	
	if (c1 == 0) {
	int c2 = c / 2;
	int Peter = c2;
	int Kate = (c2 + c2) * 2;
	int Serg = c2;	
	System.out.print("Peter has made " + Peter + " cranes." + "\n" + "Kate has made " + Kate + " cranes." + "\n" + "Serg has made " + Serg + " cranes.");
	}
	
	else {enterNumber();}
}

private static int enterNumber() {
				
	System.out.println("Enter the number!");
	Scanner sc = new Scanner(System.in);
	int number = sc.nextInt();
	
	int b = number % 3;
			
	if ((number > 0)&&(b == 0)) return number;
	else {return enterNumber();}
}

}
