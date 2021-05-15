import java.util.Scanner;
public class Main
{
	public static void main(String [] args )
	{
	Scanner input = new Scanner(System.in);
	//initialization and declaration
	int burger = 0, pizza = 0, pasta = 0, snacks = 0, drinks = 0;
    double payment = 0, change = 0, total = 0;
	int quantity =0;
	char mainMenu;
	String displayMenu;
	String fName;
	boolean isOrderComplete = false;
	//BURGER MENU
	double RegularBurger = 50, CheeseBurger = 75, BaconwithCheeseBurger =110, HamandCheeseBurger = 120;
	//PIZZA MENU
	double HamandCheesePizza = 110, HawaiianPizza = 160, AllCheesePizza = 190, PepperoniPizza = 150;
	//PASTA MENU
	double Carbonara = 100, AglioOglio = 180, Fettuccini = 170, TunaPasta = 100;
	//SNACKS MENU
	double Fries = 70, Mojos = 100, Cookies = 50, OnionRings = 50;
	//DRINKS MENU
	double MineralWater = 20, Softdrink = 50, Milkshake = 70, Juice = 30;
	
	while (!isOrderComplete) {
	    System.out.println("WELCOME TO KAI'S BUDGET FRIENDLY RESTAURANT ");
        System.out.println("********** MAIN MENU ******* ");
        System.out.println("Choose your order: ");
        System.out.println("1. Burger ");
        System.out.println("2. Pizza ");
        System.out.println("3. Pasta ");
        System.out.println("4. Snacks ");
        System.out.println("5. drinks ");
        System.out.println("6. Exit");
        System.out.print("Input (ENTER 0 TO PAY YOUR ORDER, 6 TO EXIT): ");
        mainMenu = input.next().charAt(0);
        
	switch(mainMenu) {
	case '1' :
    	input.nextLine();
    	System.out.println("1 Regular Burger ");
    	System.out.println("2 Cheese Burger ");
    	System.out.println("3 Bacon with Cheese Burger ");
    	System.out.println("4 Ham and Cheese Burger ");
    	System.out.println("");
    	System.out.print("\t\t\tSelect Order--->> ");
    	displayMenu = input.nextLine();
	if (displayMenu.equals("1") && displayMenu.equals("2") && displayMenu.equals("3") && displayMenu.equals("4") && displayMenu.equals("5") && displayMenu.equals("X")) {
    	System.out.println("Invalid Option");
        break;
    }
	else {
		System.out.print("QUANTITY: ");
    		quantity = input.nextInt();
        	if (displayMenu.equals("1")) {
        		fName = "Regular Burger ";
        		total += RegularBurger * quantity;
        	}
        	else if (displayMenu.equals("2")) {
        		fName = "Cheese Burger ";
        		total += (CheeseBurger * quantity);
        	}
        	else if (displayMenu.equals("3")) {
        		fName = "Bacon with Cheese Burger ";
        		total += BaconwithCheeseBurger * quantity;
        	}
        	else if (displayMenu.equals("4")) {
        		fName = "Ham and Cheese Burger ";
        		total += HamandCheeseBurger * quantity;
        	}
        	break;
        }
	case '2':
    	input.nextLine();
    	System.out.println("1 Ham and Cheese Pizza ");
    	System.out.println("2 Hawaiian Pizza ");
    	System.out.println("3 All cheese Pizza ");
    	System.out.println("4 Pepperoni Pizza ");
    	System.out.println("");
    	System.out.print("\t\t\tSelect Order --->> ");
    	displayMenu = input.nextLine();
	if (displayMenu.equals("1") && displayMenu.equals("2") && displayMenu.equals("3") && displayMenu.equals("4") && displayMenu.equals("5") && displayMenu.equals("X")) {
	    System.out.println("Invalid Option");
        break;
	}
	else {
    	System.out.print("QUANTITY: ");
    	quantity = input.nextInt();
        	if (displayMenu.equals("1")) {
        		fName = "Ham and Cheese Pizza ";
        		total += HamandCheesePizza * quantity;
        	}
        	else if (displayMenu.equals("2")) {
        		fName = "Hawaiian Pizza ";
        		total += HawaiianPizza * quantity;
        	}
        	else if (displayMenu.equals("3")) {
        		fName = "All cheese Pizza ";
        		total += (AllCheesePizza * quantity);
        	}
        	else if (displayMenu.equals("4")) {
        		fName = "Pepperoni Pizza ";
        		total += PepperoniPizza  * quantity;
        	}
        	break;
    	}
	case '3':
    	input.nextLine();
    	System.out.println("1 Carbonara Pasta ");
    	System.out.println("2 Aglio Oglio Pasta ");
    	System.out.println("3 Fettuccini Pasta ");
    	System.out.println("4 Tuna Pasta ");
    	System.out.println("");
    	System.out.print("\t\t\tSelect Order --->> ");
    	displayMenu = input.nextLine();
    if (displayMenu.equals("1") && displayMenu.equals("2") && displayMenu.equals("3") && displayMenu.equals("4") && displayMenu.equals("5") && displayMenu.equals("X")) {
    	System.out.println("Invalid Option");
        break;
	}
	else {
		System.out.print("QUANTITY: ");
		quantity = input.nextInt();
        	if (displayMenu.equals("1")) {
        		fName = "Carbonara Pasta ";
        		total += Carbonara * quantity;
        	}
        	else if (displayMenu.equals("2")) {
        		fName = "Aglio Oglio Pasta ";
        		total += AglioOglio * quantity;
        	}
        	else if (displayMenu.equals("3")) {
        		fName = "Fettuccini Pasta ";
        		total += Fettuccini * quantity;
        	}
        	else if (displayMenu.equals("4")) {
        		fName = "Tuna Pasta ";
        		total += TunaPasta * quantity;
        	}
        	break;
        }
	case '4':
    	input.nextLine();
    	System.out.println("1 Fries ");
    	System.out.println("2 Mojos ");
    	System.out.println("3 Cookies ");
    	System.out.println("4 Onion rings ");
    	System.out.println("");
    	System.out.print("\t\t\tSelect Order --->> ");
	    displayMenu = input.nextLine();
    if (displayMenu.equals("1") && displayMenu.equals("2") && displayMenu.equals("3") && displayMenu.equals("4") && displayMenu.equals("5") && displayMenu.equals("X")) {
        System.out.println("Invalid Option");
        break;
	}
	else {
		System.out.print("QUANTITY: ");
		quantity = input.nextInt();
        	if (displayMenu.equals("1")) {
        		fName = "Fries ";
        		total += Fries * quantity;
        	}
        	else if (displayMenu.equals("2")) {
        		fName = "Mojos ";
        		total += Mojos* quantity;
        	}
        	else if (displayMenu.equals("3")) {
        		fName = "Cookies ";
        		total += Cookies * quantity;
        	}
        	else if (displayMenu.equals("4")) {
        		fName = "Onion rings ";
        		total += OnionRings * quantity;
        	}
        	break;
        }
	case '5':
    	input.nextLine();
    	System.out.println("1 Mineral Water ");
    	System.out.println("2 Softdrinks ");
    	System.out.println("3 Milkshake ");
    	System.out.println("4 Juice");
    	System.out.println("");
    	System.out.print("\t\t\tSelect Order --->> ");
	    displayMenu = input.nextLine();
    if (displayMenu.equals("1") && displayMenu.equals("2") && displayMenu.equals("3") && displayMenu.equals("4") && displayMenu.equals("5") && displayMenu.equals("X")) {
	    System.out.println("Invalid Option");
        break;
	}
	else {
		System.out.print("QUANTITY: ");
		quantity = input.nextInt();
        	if (displayMenu.equals("1")) {
        		fName = "Mineral Water ";
        		total += MineralWater * quantity;
        	}
        	else if (displayMenu.equals("2")) {
        		fName = "Softdrinks ";
        		total += Softdrink * quantity;
        	}
        	else if (displayMenu.equals("3")) {
        		fName = "Milkshake ";
        		total += Milkshake * quantity;
        	}
        	else if (displayMenu.equals("4")) {
        		fName = "Juice ";
        		total += Juice * quantity;
        		break;
        	}
	}
	case '6':
	    System.out.println("Thank you, come again!");
	    System.exit(1);
	    
	case '0':
	 if (total > 0) { 
                    System.out.println("Total amount = " + "P" + total);
                    System.out.print("Your Payment: ");
                    payment = input.nextInt();
                        if(total <= payment) {
                        change = payment - total;
                        System.out.println("Your change is " + "P" + change + " please come again!");
                        System.out.println("");
                		System.out.println("\tThank You for visiting KAI's Budget friendly Restaurant and Please Come Again!\n");
                        }
                        else
                        System.out.println("Insufficient Funds");
                    }
        
                    else
                    { 	System.out.println("You did not order anything.");
                    }
                 isOrderComplete = true;
                 break;
                
            }
        }
    }    
}