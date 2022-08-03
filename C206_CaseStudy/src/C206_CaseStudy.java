import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//administrator account
		
		ArrayList<userAccount> accountList = new ArrayList<userAccount>();
		accountList.add(new userAccount("team_3", "98team322"));
				
		//parent account
		accountList.add(new userAccount("parent678", "parent8891"));
				
		//student account
		accountList.add(new userAccount("student123", "9574student1"));
			
				
			//create monthly menu
			ArrayList<Menu> monthlyMenuList = new ArrayList<Menu>();

				
			//Asian Menu
			monthlyMenuList.add(new Menu("Fried Rice", 2.00));
			monthlyMenuList.add(new Menu("Dumpling Noodle", 3.50));
			monthlyMenuList.add(new Menu("Oyakodon", 3.00));
			
			//Western Menu
			monthlyMenuList.add(new Menu("Tomato Pasta ", 2.50));
			monthlyMenuList.add(new Menu("Chicken Cutlet With Fries", 4.00));
			monthlyMenuList.add(new Menu("Chicken Tortilla Wrap", 3.00));
				
			//Vegetarian Menu
			monthlyMenuList.add(new Menu("Teriyaki Tofu Rice ", 3.50));
			monthlyMenuList.add(new Menu("Corn Sushi", 2.50));
			monthlyMenuList.add(new Menu("Roasted Chickpea Wrap", 3.00));
				
			//Drinks Menu
			monthlyMenuList.add(new Menu("Apple Juice", 1.80));
			monthlyMenuList.add(new Menu("Soymilk", 2.00));
			monthlyMenuList.add(new Menu("Ice Chocolate", 1.50));
				
			//Fruits Menu
			monthlyMenuList.add(new Menu("Watermelon", 1.20));
			monthlyMenuList.add(new Menu("Pineapple", 1.40));
			monthlyMenuList.add(new Menu("Grapes", 1.40));
		

				
			int option = 0;	
			
			while (option != 3) {
					
				C206_CaseStudy.mainMenu();
					
				option = Helper.readInt("Enter an option > ");
					
				if (option == 1) {
					C206_CaseStudy.viewAllMenu(monthlyMenuList);
						
				} else if (option == 2) { 
					C206_CaseStudy.deleteMenu(monthlyMenuList);
						
				} else if (option == 3) {
					System.out.println("Thank you! Goodbye");
						
				} else {
					System.out.println("Invalid option");
				}
			}
		}
}



		public static void mainMenu() {
			Helper.line(80, "-");
			System.out.println("WELCOME TO LUNCHBOX ORDER");
			Helper.line(80, "-");
			System.out.println("1. Log in");
			System.out.println("2. Display Monthly Menu");
			System.out.println("2. Quit");
		}
				
		public static void adminmenu() {
			Helper.line(80, "-");	
			System.out.println("MONTHLY MENU");
			Helper.line(80, "-");	
			System.out.println("1. Display Monthly Menu");
			System.out.println("2. Delete monthly menu");
			System.out.println("3. Quit");
		}
			
		public static String availability(boolean availablity) {
			String available; 
			if (availablity == true) {
					available = "Yes";
			} else {
				available = "No";
			}
			return available;
		}
			
		public static String retrieveAllMenu(ArrayList<Menu> monthlyMenuList) {
			String output = "";
			
				
			for (int i = 0; i < monthlyMenuList.size(); i++) {
				Menu menulist = monthlyMenuList.get(i);
				output+= String.format("%-40s %-20.2f %-10s\n", menulist.getDescription(), menulist.getCost(), C206_CaseStudy.availability(menulist.getisAvailable()));
			}
				
			return(output);
		}	
			
		private static void viewAllMenu(ArrayList<Menu> monthlyMenuList) {
			Helper.line(80, "-");
			System.out.println("VIEW MONTHLY MENU");
			Helper.line(80, "-");
				
			String output = String.format("%-40s %-20s %-10s\n", "DESCRIPTION", "COST", "AVAILABILITY");
			output+= retrieveAllMenu(monthlyMenuList);
				
			System.out.println(output);
	
}	
	
		public static void deleteMenu(ArrayList<Menu> monthlyMenuList) {
			Helper.line(80, "-");
			System.out.println("DELETE MONTHLY MENU");
			Helper.line(80, "-");
				
			boolean menuFound = false;
			String menuDelete = Helper.readString("Enter menu description to delete > ");
				
			for (int i = 0; i < monthlyMenuList.size(); i++) {
				if (menuDelete.equalsIgnoreCase(monthlyMenuList.get(i).getDescription())
							&& monthlyMenuList.get(i).getisAvailable() == true) {
							menuFound = true;
						
						if (menuFound == false) {
							System.out.println("Menu description given not found!");
						} else {
							monthlyMenuList.remove(i);
							System.out.println("Deleted successfully!");
						}
					}		
				}
		
			}
}
