package tehtava;


import java.util.Scanner;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		
		Scanner scanner=new Scanner(System.in);
		
	do {
		
		System.out.println();
		System.out.println("*** BOTTLE DISPENSER ***");
		System.out.println("1) Add money to the machine");
		System.out.println("2) Buy a bottle");
		System.out.println("3) Take money out");
		System.out.println("4) List bottles in the dispenser");
		System.out.println("0) End");
		System.out.print("Your choice: ");
		choice=scanner.nextInt();
		if(choice==1) {
			BottleDispenser botDis= BottleDispenser.getInstance();
			botDis.addMoney();
		}
		else if(choice==2) {
			BottleDispenser botDis= BottleDispenser.getInstance();
			botDis.buyBottle();
		}
		else if(choice==3) {
			BottleDispenser botDis= BottleDispenser.getInstance();
			botDis.returnMoney();
		}
		else if(choice==4) {
			BottleDispenser botDis= BottleDispenser.getInstance();
			botDis.bottleMenu();
		}
		else if(choice==0) {
			break;
		}
		
	}while (true);
	scanner.close();
	
		
	}

}