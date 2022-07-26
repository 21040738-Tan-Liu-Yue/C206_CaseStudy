
import java.util.ArrayList;

public class C206_CaseStudy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// administrator account

		ArrayList<userAccount> accountList = new ArrayList<userAccount>() ;
		accountList.add(new userAccount("team_3", "98team322")) ;

		// parent account
		accountList.add(new userAccount("parent678", "parent8891"));

		// student account
		accountList.add(new userAccount("student123", "9574student1"));

		// create monthly menu
		ArrayList<Menu> monthlyMenuList = new ArrayList<Menu>();

		// create lunchbox
		ArrayList<LunchBox> lunchBoxList = new ArrayList<LunchBox>();

		// Asian Menu
		monthlyMenuList.add(new Menu("August", "Fried Rice", 2.00));
		monthlyMenuList.add(new Menu("August", "Dumpling Noodle", 3.50));
		monthlyMenuList.add(new Menu("September", "Oyakodon", 3.00));

		// Western Menu
		monthlyMenuList.add(new Menu("September", "Tomato Pasta ", 2.50));
		monthlyMenuList.add(new Menu("August", "Chicken Cutlet With Fries", 4.00));
		monthlyMenuList.add(new Menu("August", "Chicken Tortilla Wrap", 3.00));

		// Vegetarian Menu
		monthlyMenuList.add(new Menu("August", "Teriyaki Tofu Rice ", 3.50));
		monthlyMenuList.add(new Menu("August", "Corn Sushi", 2.50));
		monthlyMenuList.add(new Menu("September", "Roasted Chickpea Wrap", 3.00));

		// Drinks Menu
		monthlyMenuList.add(new Menu("August", "Apple Juice", 1.80));
		monthlyMenuList.add(new Menu("August", "Soymilk", 2.00));
		monthlyMenuList.add(new Menu("September", "Ice Chocolate", 1.50));

		// Fruits Menu
		monthlyMenuList.add(new Menu("August", "Watermelon", 1.20));
		monthlyMenuList.add(new Menu("August", "Pineapple", 1.40));
		monthlyMenuList.add(new Menu("September", "Grapes", 1.40));

		// order bill
		ArrayList<orderBill> orderBillList = new ArrayList<orderBill>();

		orderBillList.add(new orderBill(123, "1-AUG-2021", "Fried Rice", "Apple Juice", "Watermelon", 5.00));
		orderBillList.add(new orderBill(124, "1-AUG-2021", "Tomato Pasta", "Soymilk", "Pineapple", 5.90));
		orderBillList.add(new orderBill(125, "1-AUG-2021", "Corn Sushi", "Soymilk", "Grapes", 5.90));
		orderBillList.add(new orderBill(126, "1-AUG-2021", "Teriyaki Tofu Rice", "Apple Juice", "Grapes", 6.70));
		orderBillList.add(new orderBill(127, "1-AUG-2021", "Fried Rice", "Ice Chocolate", "Watermelon", 4.70));

		//MENU BANK
		 ArrayList<MenuBank> MenubankList = new ArrayList<MenuBank>();
		  MenubankList.add(new MenuBank("Fried Rice", 2.00));

		// lunch box

		lunchBoxList.add(new LunchBox(124, "1-AUG-2021", "Fried Rice", "Apple Juice", "Watermelon"));
		lunchBoxList.add(new LunchBox(123, "24-JULY-2021", "Kimchi Fried Rice", "Orange Juice", "Apple"));
		lunchBoxList.add(new LunchBox(125, "6-DEC-2021", "Bolognese", "Mango Juice", "Orange"));
		int option = 0;

		while (option != 16) {

			C206_CaseStudy.adminmenu();

			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				C206_CaseStudy.viewAllMenu(monthlyMenuList);

			} else if (option == 2) {
				Menu addMonthlyMenu = doCreateMenu();
				C206_CaseStudy.createMontlyMenu(monthlyMenuList, addMonthlyMenu);
				System.out.println("Monthly Menu Successfully Added!");

			} else if (option == 3) {
				C206_CaseStudy.deleteMenu(monthlyMenuList);

				// USER ACCOUNT
			} else if (option == 4) {
				C206_CaseStudy.viewAllAccount(accountList);
			} else if (option == 5) {
				userAccount acc = inputaccount();
				C206_CaseStudy.deleteacc(accountList, acc);
			} else if (option == 6) {
				userAccount acc = inputaccount();
				C206_CaseStudy.addacc(accountList, acc);
				System.out.println("Account added");

				// ORDER BILL
			} else if (option == 7) {
				C206_CaseStudy.viewAllorderbill(orderBillList);
			} else if (option == 8) {
				orderBill ob = inputorderBills();
				C206_CaseStudy.addorderBill(orderBillList, ob);
				System.out.println("Order bill added!");
			} else if (option == 9) {
				C206_CaseStudy.deleteOrderBill(orderBillList);
				System.out.println("Order bill deleted!");

				// MENU BANK
			} else if (option == 10) {

				C206_CaseStudy.viewAllMenubank(MenubankList);
			} else if (option == 11) {

				C206_CaseStudy.deleteAllMenubank(MenubankList);
				System.out.println("Menu bank deleted!");
			} else if (option == 12) {
				MenuBank mb = inputMenubank();
				C206_CaseStudy.addMenubank(MenubankList, mb);
				System.out.println("Menu bank added!");
			} else if (option == 13) {
				C206_CaseStudy.viewAllLunchbox(lunchBoxList);
			} else if (option == 14) {
				LunchBox lunchbox = inputAccount();
				C206_CaseStudy.addlunchbox(lunchBoxList, lunchbox);
				System.out.println("Account added");
			} else if (option == 15) {
				C206_CaseStudy.deleteLunchBox(lunchBoxList);
			} else if (option == 16) {
				System.out.println("Thank you! Goodbye");
			} else {
				System.out.println("Invalid option");
			}
		}
	}

	public static void adminmenu() {
		Helper.line(80, "-");
		System.out.println("LUNCH BOX MENU");
		Helper.line(80, "-");
		System.out.println("1. Display Monthly Menu");
		System.out.println("2. Create Monthly Menu");
		System.out.println("3. Delete Monthly menu");
		// User Account
		System.out.println("4. Display Account");
		System.out.println("5. Delete account");
		System.out.println("6. Add account");

		// order bill
		System.out.println("7. Display Order bill");
		System.out.println("8. Add Order bill");
		System.out.println("9. Delete Order bill");

		// MENU BANK
		System.out.println("10. Display Menu bank");
		System.out.println("11. Add Menu bank");
		System.out.println("12. Delete Menu bank");
		System.out.println("13. Quit");

		// lunch box
		System.out.println("13. Display Lunch box");
		System.out.println("14. Add Lunch box");
		System.out.println("15. Delete Lunch box");
	}

	// MONTHLY MENU
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	public static String availability(boolean availablity) {
		String available;
		if (availablity == true) {
			available = "Yes";
		} else {
			available = "No" ;
		}
		return available;
	}

	public static String retrieveAllMenu(ArrayList<Menu> monthlyMenuList)  {
		String output = "";
		for (int i = 0; i < monthlyMenuList.size(); i++) {
			Menu menulist = monthlyMenuList.get(i);
			output += String.format("%-20s %-40s %-20.2f %-10s\n", menulist.getMonth(), menulist.getDescription(),
					menulist.getCost(), C206_CaseStudy.availability(menulist.getisAvailable()));
		}
		return (output);
	}

	private static void viewAllMenu(ArrayList<Menu> monthlyMenuList) {
		Helper.line(80, "-");
		System.out.println("VIEW MONTHLY MENU");
		Helper.line(80, "-");

		String output = String.format("%-20s %-40s %-20s %-10s\n", "MONTH", "DESCRIPTION", "COST", "AVAILABILITY");
		output += retrieveAllMenu(monthlyMenuList);

		System.out.println(output);
	}

	public static Menu doCreateMenu() {
		String month = Helper.readString("Enter month > ");
		String description = Helper.readString("Enter description of monthly menu > ");
		double price = Helper.readDouble("Enter monthly menu price > ");

		Menu addMonthlyMenu = new Menu(month, description, price);
		return addMonthlyMenu;

	}

	public static void createMontlyMenu(ArrayList<Menu> monthlyMenuList, Menu addMonthlyMenu) {

		monthlyMenuList.add(addMonthlyMenu);

	}

	public static boolean doDeleteMenu(ArrayList<Menu> monthlyMenuList, String description) {
		boolean menuFound = false;

		for (int i = 0; i < monthlyMenuList.size(); i++) {
			if (description.equalsIgnoreCase(monthlyMenuList.get(i).getDescription())
					&& monthlyMenuList.get(i).getisAvailable() == true) {

				monthlyMenuList.remove(i);
				menuFound = true;
			}
		}

		return menuFound;

	}

	public static void deleteMenu(ArrayList<Menu> monthlyMenuList) {
		Helper.line(80, "-");
		System.out.println("DELETE MONTHLY MENU");
		Helper.line(80, "-");

		String description = Helper.readString("Enter menu description to delete > ");

		Boolean menuFound = doDeleteMenu(monthlyMenuList, description);

		if (menuFound == false) {
			System.out.println("Menu description given not found!");
		} else {
			System.out.println("Deleted successfully!");
		}
	}

	public static String retrieveAllacc(ArrayList<userAccount> accountList) {
		String output = "";

		for (int i = 0; i < accountList.size(); i++) {
			userAccount accountlist = accountList.get(i);
			output += String.format("%-40s %-20s\n", accountlist.getUsername(), accountlist.getPassword());
		}

		return (output);
	}

	// USER ACCOUNT
	private static void viewAllAccount(ArrayList<userAccount> accountList) {
		Helper.line(80, "-");
		System.out.println("VIEW Accounts");
		Helper.line(80, "-");

		String output = String.format("%-40s %-20s\n", "USERNAME", "PASSWORD");
		output += retrieveAllacc(accountList);

		System.out.println(output);

	}

	public static userAccount inputaccount() {
		String username = Helper.readString("Enter username > ");
		String password = Helper.readString("Enter password > ");

		userAccount acc = new userAccount(username, password);

		return acc;

	}

	public static void addacc(ArrayList<userAccount> accountList, userAccount acc) {

		accountList.add(acc);

	}

	public static void deleteacc(ArrayList<userAccount> accountList, userAccount acc) {
		boolean accFound = false;

		for (int i = 0; i < accountList.size(); i++) {
			if (acc.getUsername().equals(accountList.get(i).getUsername())) {
				accFound = true;
				if (accFound == false) {
					System.out.println("Username not found");
				} else {
					accountList.remove(i);
					System.out.println("Account deleted");
				}
				accountList.remove(acc);

			}
		}

	}

	public static String retrieveorderBills(ArrayList<orderBill> orderBillList) {

		String output = "";

		for (int i = 0; i < orderBillList.size(); i++) {
			orderBill orderBilllist = orderBillList.get(i);
			output += String.format("%-10d %-30s %-20s %-15s %-40s %-20.2f\n", orderBilllist.getID(),
					orderBilllist.getDate(), orderBilllist.getMeal(), orderBilllist.getDrink(),
					orderBilllist.getFruit(), orderBilllist.getAmount());
		}

		return (output);
	}

	private static void viewAllorderbill(ArrayList<orderBill> orderBillList) {
		Helper.line(80, "-");
		System.out.println("VIEW ORDER BILL");
		Helper.line(80, "-");

		String output = String.format("%-10s %-30s %-20s %-15s %-40s %-20s\n", "ORDER ID", "DATE", "MEAL", "DRINK",
				"FRUIT", "AMOUNT");
		output += retrieveorderBills(orderBillList);

		System.out.println(output);
	}

	public static orderBill inputorderBills() {
		Helper.line(80, "-");
		System.out.println("ADD ORDER BILL");
		Helper.line(80, "-");

		int id = Helper.readInt("Enter id > ");
		String date = Helper.readString("Enter date > ");
		String meal = Helper.readString("Enter meal > ");
		String drink = Helper.readString("Enter drink > ");
		String fruit = Helper.readString("Enter fruit > ");
		double amount = Helper.readDouble("Enter amount > ");

		orderBill ob = new orderBill(id, date, meal, drink, fruit, amount);
		return ob;
	}

	public static void addorderBill(ArrayList<orderBill> orderBillList, orderBill ob) {
		orderBillList.add(ob);
	}

	public static boolean doDeleteOrderBill(ArrayList<orderBill> orderBillList, int id) {
		boolean isDeleted = false;

		for (int i = 0; i < orderBillList.size(); i++) {
			int obID = orderBillList.get(i).getID();
			if (id == obID) {
				isDeleted = true;
			}

		}
		return isDeleted;
	}

	public static void deleteOrderBill(ArrayList<orderBill> orderBillList) {
		Helper.line(80, "-");
		System.out.println("DELETE ORDER BILL");
		Helper.line(80, "-");

		boolean orderBillFound = false;
		int orderBillDelete = Helper.readInt("Enter order id to delete > ");

		for (int i = 0; i < orderBillList.size(); i++) {
			if (orderBillDelete == orderBillList.get(i).getID()) {
				orderBillFound = true;
				if (orderBillFound == false) {
					System.out.println("Menu description given not found!");
				} else {
					orderBillList.remove(i);
					System.out.println("Deleted successfully!");
				}
			}
		}
	}

	// MENU BANK
	public static String retrieveAllMenubank(ArrayList<MenuBank> MenubankList) {
		String output = "";

		for (int i = 0; i < MenubankList.size(); i++) {
			MenuBank menubanklist = MenubankList.get(i);
			output += String.format("%-40s %-20.2f %-10s\n", menubanklist.getDescription(), menubanklist.getCost(),
					C206_CaseStudy.availability(menubanklist.getisAvailable()));
		}

		return (output);
	}

	private static void viewAllMenubank(ArrayList<MenuBank> MenubankList) {
		Helper.line(80, "-");
		System.out.println("MENU BANK");
		Helper.line(80, "-");

		String output = String.format("%-40s %-20s %-10s\n", "DESCRIPTION", "COST", "AVAILABILITY");
		output += retrieveAllMenubank(MenubankList);

		System.out.println(output);
	}

	private static MenuBank inputMenubank() {
		Helper.line(80, "-");
		System.out.println("ADD MONTHLY MENU");
		Helper.line(80, "-");

		String description = Helper.readString("Enter description > ");
		double amount = Helper.readDouble("Enter amount > ");

		MenuBank mb = new MenuBank(description, amount);
		return mb;
	}

	public static void addMenubank(ArrayList<MenuBank> MenubankList, MenuBank mb) {
		MenubankList.add(mb);
	}

	public static boolean doDeleteMenubank(ArrayList<MenuBank> MenubankList, String description) {
		boolean isDeleted = false;

		for (int i = 0; i < MenubankList.size(); i++) {
			String mbdes = MenubankList.get(i).getDescription();
			if (mbdes.equalsIgnoreCase(description)) {
				isDeleted = true;
			}

		}
		return isDeleted;
	}

	public static void deleteAllMenubank(ArrayList<MenuBank> MenubankList) {
		Helper.line(80, "-");
		System.out.println("DELETE MONTHLY MENU");
		Helper.line(80, "-");

		boolean menuFound = false;
		String menuDelete = Helper.readString("Enter menu description to delete > ");

		for (int i = 0; i < MenubankList.size(); i++) {
			if (menuDelete.equalsIgnoreCase(MenubankList.get(i).getDescription())
					&& MenubankList.get(i).getisAvailable() == true) {
				menuFound = true;

				if (menuFound == false) {
					System.out.println("Menu description given not found!");
				} else {
					MenubankList.remove(i);
					System.out.println("Deleted successfully!");
				}
			}
		}

	}

	public static String retrieveLunchboxOrder(ArrayList<LunchBox> lunchBoxList) {
		// TODO Auto-generated method stub
		String output = "";

		for (int i = 0; i < lunchBoxList.size(); i++) {
			LunchBox lunchboxList = lunchBoxList.get(i);
			output += String.format("%-40d %-20s %-20s %-20s %-40s\n", lunchboxList.getId(), lunchboxList.getDate(),
					lunchboxList.getMeal(), lunchboxList.getDrink(), lunchboxList.getFruit());
		}

		return (output);
	}

	private static void viewAllLunchbox(ArrayList<LunchBox> lunchBoxList) {
		Helper.line(80, "-");
		System.out.println("VIEW LUNCH BOX");
		Helper.line(80, "-");

		String output = String.format("%-40s %-20s %-20s %-20s %-40s\n", "ID", "DATE", "MEAL", "DRINK", "FRUIT");
		output += retrieveLunchboxOrder(lunchBoxList);

		System.out.println(output);

	}

	public static boolean doDeleteLunchBox(ArrayList<LunchBox> lunchBoxList, int id) {
		boolean isDeleted = false;

		for (int i = 0; i < lunchBoxList.size(); i++) {
			int lbID = lunchBoxList.get(i).getId();
			if (id == lbID) {
				isDeleted = true;
			}

		}
		return isDeleted;
	}

	public static void deleteLunchBox(ArrayList<LunchBox> lunchBoxList) {
		Helper.line(80, "-");
		System.out.println("DELETE luncbox id");
		Helper.line(80, "-");

		boolean lunchBoxFound = false;
		int lunchBoxDelete = Helper.readInt("Enter lunchbox id to delete > ");

		for (int i = 0; i < lunchBoxList.size(); i++) {
			if (lunchBoxDelete == lunchBoxList.get(i).getId()) {
				lunchBoxFound = true;

				if (lunchBoxFound == false) {
					System.out.println("Menu description given not found!");
				} else {
					lunchBoxList.remove(i);
					System.out.println("Deleted successfully!");
				}
			}

		}
	}

	public static LunchBox inputAccount() {
		int id = Helper.readInt("Enter id > ");
		String date = Helper.readString("Enter date > ");
		String meal = Helper.readString("Enter meal > ");
		String drink = Helper.readString("Enter drink > ");
		String fruit = Helper.readString("Enter fruit > ");
		LunchBox acc = new LunchBox(id, date, meal, drink, fruit);

		return acc;

	}

	public static void addlunchbox(ArrayList<LunchBox> lunchboxList, LunchBox lunchbox) {

		lunchboxList.add(lunchbox);

	}

}
