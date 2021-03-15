package tehtava;

import java.util.ArrayList;

public class BottleDispenser {
	
	private static BottleDispenser BottleDispenser = null;
	public static BottleDispenser getInstance() {
		if (BottleDispenser==null) {
			BottleDispenser=new BottleDispenser();
		}
		return BottleDispenser;
	}

    private int bottles,i=0;
    private float money;
    
    Bottle bottleinf = new Bottle();
    private BottleDispenser() {
        bottles = 5;
        money = 0;
        ArrayList<String> bottleslist = new ArrayList<>();
        bottleslist.add(bottleinf.getName());
        
        
    }
    public void bottleMenu() {
    	for (int i=1;i<=bottles;i++) {
    		System.out.println(i+". Name: "+bottleinf.getName()+"\n"+"\t"+"Size: "+bottleinf.getSize()+"\t"+"Price: "+bottleinf.getPrice());
    	}
    }
    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    public void buyBottle() {
        if (money <= bottleinf.getPrice()){
        	System.out.println("Add money first!");
        }
        else if (money >= bottleinf.getPrice()) {
            bottles -= 1;
            money -=1 ;
            System.out.println("KACHUNK! "+bottleinf.getName()+" came out of the dispenser!");
        }
        else if (bottles==0) {
        	System.out.println("Loppu.");
        }
    }
    public void returnMoney() {
    	if (money == 0) {
    		System.out.println("Klink klink!! All money gone!");
    	}
    	else if (money >= 0) {
    		System.out.println("Klink klink. Money came out!");
    	}
    }

}
