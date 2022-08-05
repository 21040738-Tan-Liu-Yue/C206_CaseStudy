import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	// prepare test data
	private Menu ma1;
	private Menu ma2;
	private Menu ma3;
	private Menu ma4;
	private Menu mw1;
	private Menu mw2;
	private Menu mw3;
	private Menu mw4;
	private Menu mv1;
	private Menu mv2;
	private Menu mv3;
	private Menu mv4;
	private Menu d1;
	private Menu d2;
	private Menu d3;
	private Menu d4;
	private Menu f1;
	private Menu f2;
	private Menu f3;
	private Menu f4;

	// User Account
	private userAccount AC1;
	private userAccount AC2;
	private userAccount AC3;
	private ArrayList<userAccount> accountList;
	private ArrayList<Menu> monthlyMenuList;

	// ORDER BILL
	private orderBill ob6;
	private orderBill ob7;
	private orderBill ob8;
	private ArrayList<orderBill> orderBillList;

	//MENU BANK
	private MenuBank mb1;
	  private MenuBank mb2;
	  private MenuBank mb3;
	  
	  private ArrayList <MenuBank> MenubankList;
	public C206_CaseStudyTest() {

	}

	@Before
	public void setUp() throws Exception {
		// Asian Menu
		ma1 = new Menu("August", "Fried Rice", 2.00);
		ma2 = new Menu("August", "Dumpling Noodle", 3.50);
		ma3 = new Menu("September", "Oyakodon", 3.00);
		ma4 = new Menu("September", "Curry Rice", 2.50);

		// Western Menu
		mw1 = new Menu("September", "Tomato Pasta ", 2.50);
		mw2 = new Menu("August", "Chicken Cutlet With Fries", 4.00);
		mw3 = new Menu("August", "Chicken Tortilla Wrap", 3.00);
		mw4 = new Menu("September", "Mac and Cheese", 2.80);

		// Vegetarian Menu
		mv1 = new Menu("August", "Teriyaki Tofu Rice ", 3.50);
		mv2 = new Menu("August", "Corn Sushi", 2.50);
		mv3 = new Menu("September", "Roasted Chickpea Wrap", 3.00);
		mv4 = new Menu("September", "Pumpkin Soup", 2.00);

		// Drinks Menu
		d1 = new Menu("August", "Apple Juice", 1.80);
		d2 = new Menu("August", "Soymilk", 2.00);
		d3 = new Menu("September", "Ice Chocolate", 1.50);
		d4 = new Menu("September", "Green Tea", 1.20);

		// Fruits Menu
		f1 = new Menu("August", "Watermelon", 1.20);
		f2 = new Menu("August", "Pineapple", 1.40);
		f3 = new Menu("September", "Grapes", 1.40);
		f4 = new Menu("September", "Papaya", 1.00);

		monthlyMenuList = new ArrayList<Menu>();

		// order bill test data
		ob6 = new orderBill(130, "1-AUG-2021", "Fried Rice", "Apple Juice", "Watermelon", 5.00);
		ob7 = new orderBill(131, "1-AUG-2021", "Tomato Pasta", "Soymilk", "Pineapple", 5.90);
		ob8 = new orderBill(132, "1-AUG-2021", "Corn Sushi", "Soymilk", "Grapes", 5.90);

		orderBillList = new ArrayList<orderBill>();

		// USER ACCOUNT
		AC1 = new userAccount("team_3", "98team322");
		AC2 = new userAccount("parent678", "parent8891");
		AC3 = new userAccount("student123", "9574student1");
		accountList = new ArrayList<userAccount>();
		
		
		//MENU BANK
	    mb1 = new MenuBank("Fried Rice", 2.00);
	    mb2 = new MenuBank("Corn Sushi", 2.50);
	    mb3 = new MenuBank("Pumpkin Soup", 2.00);
	}

	// MONHTLY MENU
	@Test
	public void testviewAllMenu() {

		// test if there is a valid menu arraylist
		assertNotNull("test if there is valid Menu arraylist", monthlyMenuList);

		// test if the list retrieved is empty
		String allMenu = C206_CaseStudy.retrieveAllMenu(monthlyMenuList);
		String testOutput = "";
		assertEquals("Check that ViewAllMenu", testOutput, allMenu);

		// test if the expected output string same
		allMenu = C206_CaseStudy.retrieveAllMenu(monthlyMenuList);

		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "August", "Fried Rice", 2.00, "Yes");
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "August", "Dumpling Noodle", 3.50, "Yes");
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "September", "Oyakodon", 3.00, "Yes");
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "September", "Curry Rice", 2.50, "Yes");
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "September", "Tomato Pasta", 2.50, "Yes");
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "August", "Chicken Cutlet With Fries", 4.00, "Yes");
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "August", "Chicken Tortilla Wrap", 3.00, "Yes");
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "September", "Mac and Cheese", 2.80, "Yes");
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "August", "Teriyaki Tofu Rice", 3.50, "Yes");
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "August", "Corn Sushi", 2.50, "Yes");
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "September", "Roasted Chickpea Wrap", 3.00, "Yes");
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "September", "Pumpkin Soup", 2.00, "Yes");
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "August", "Apple Juice", 1.80, "Yes");
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "August", "Soymilk", 2.00, "Yes");
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "September", "Ice Chocolate", 1.50, "Yes");
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "September", "Green Tea", 1.80, "Yes");
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "August", "Watermelon", 1.20, "Yes");
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "August", "Pineapple", 1.40, "Yes");
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "September", "Grapes", 1.40, "Yes");
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "September", "Papaya", 1.00, "Yes");

		assertEquals("Check that ViewAllMenu", testOutput, allMenu);

	}

	@Test
	public void doAddMonthlyMenu() {
		// boundary
		assertNotNull("test if there is valid mnonhtly menu ", monthlyMenuList);

		// Test that menu can be added in an empty arraylist - Normal
		C206_CaseStudy.createMontlyMenu(monthlyMenuList, mv1);
		C206_CaseStudy.createMontlyMenu(monthlyMenuList, mw3);
		assertEquals("Test if that Monthly Menu arraylist size is 2", 2, monthlyMenuList.size());
		// Test if item added is is the same
		assertSame("Test that the Menu added is the same as 2nd item of the list?", mw3, monthlyMenuList.get(1));

	}

	@Test
	public void testdeleteMenu() {

		// Test that list is not empty - boundary
		assertNotNull("test if there is valid Menu arraylist to delete from", monthlyMenuList);

		// Test that item is removed - normal
		monthlyMenuList.remove(ma1);
		assertEquals("Check if item is removed", 0, monthlyMenuList.size());

		// Item not available - error condition
		f1.setAvailable(false);
		boolean avail = C206_CaseStudy.doDeleteMenu(monthlyMenuList, "Watermelon");
		assertFalse("Test if item is available to delete", avail);

		// Test that item not found in menu can be deleted - error condition
		avail = C206_CaseStudy.doDeleteMenu(monthlyMenuList, "Papaya");
		assertFalse("Test that non-existing item can be deleted", avail);

	}

	// USER ACCOUNT
	@Test
	public void testAddaccount() {

		assertNotNull("Test if there is valid account list to add to", accountList);
		// Test that given an empty list, after adding 1 career, size of list is 1 and
		// item in list is same as career added?
		C206_CaseStudy.addacc(accountList, AC1);
		assertSame("Test 1st account in list is same as account added", AC1, accountList.get(0));
		assertEquals("Test that account List equals 1", 1, accountList.size());
		// Test that given academic cluster list has 1 item, after adding 1 more
		// academic cluster, size of list is 2 and 2nd cluster same as cluster added?
		C206_CaseStudy.addacc(accountList, AC2);
		assertSame("Test 2st account in list is same as account added", AC2, accountList.get(1));
		assertEquals("Test that account List equals 2", 2, accountList.size());

	}

	@Test
	public void testviewAllaccount() {
		// fail("Not yet implemented");
		// Test account list is not null but empty - boundary
		assertNotNull("Test if there is valid account arraylist to retrieve item from", accountList);

		// test if the list of account retrieved from the SourceCentre is empty -
		// boundary
		String allacc = C206_CaseStudy.retrieveAllacc(accountList);
		String testOutput = "";
		assertEquals("Test that the retrieved accountlist is empty?", testOutput, allacc);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		// - normal
		C206_CaseStudy.addacc(accountList, AC1);
		C206_CaseStudy.addacc(accountList, AC2);
		assertEquals("Test that account arraylist size is 2", 2, accountList.size());

		// test if the expected output string same as the list of account retrieved from
		// the SourceCentre
		allacc = C206_CaseStudy.retrieveAllacc(accountList);
		testOutput = String.format("%-40s %-20s\n", "team_3", "98team322");
		testOutput += String.format("%-40s %-20s\n", "parent678", "parent8891");
		assertEquals("Test that ViewAllaccountlist", testOutput, allacc);
	}

	@Test
	public void testDeleteacc() {
		// career list is not null, so that there is a list to delete from
		assertNotNull("Test if there is valid academic cluster Information list to delete from", accountList);
		// Test that given a list with 1 account in it, after deleting 1 account, the
		// size of list is 0 and the item is no longer in the list
		String allacc = C206_CaseStudy.retrieveAllacc(accountList);
		String testOutput = "";
		assertEquals("Test that the retrieved accountlist is empty?", testOutput, allacc);

		C206_CaseStudy.addacc(accountList, AC1);
		C206_CaseStudy.deleteacc(accountList, AC1);

		assertEquals("test that the account list equals 0", 0, accountList.size());
		// Test that given a list with 2 account in it, after deleting 1st account, the
		// size of list is 1 and the item is no longer in the list
		C206_CaseStudy.addacc(accountList, AC1);
		C206_CaseStudy.addacc(accountList, AC2);
		C206_CaseStudy.deleteacc(accountList, AC2);
		assertSame("Test that the academic cluster deleted is no longer in the list", AC1, accountList.get(0));
		assertEquals("test that the academic cluster list equals 1", 1, accountList.size());
	}

	@Test
	public void testAddOrderBill() {
		// orderbill list is not null, can add order bill
		assertNotNull("Test if there is valid Order bill arraylist to add to", orderBillList);

		// add 1st order bill, size of the list 1
		// the item just added is as same as the first item of the list
		C206_CaseStudy.addorderBill(orderBillList, ob6);
		assertEquals("Test that order bill arraylist is 1", 1, orderBillList.size());
		assertSame("Test that order bill is added", ob6, orderBillList.get(0));
		// add 2nd order bill, test the size of list is 2
		// the item added is as same as the second item of the list
		C206_CaseStudy.addorderBill(orderBillList, ob7);
		assertEquals("Test that order bill arraylist is 2", 2, orderBillList.size());
		assertSame("Test that order bill is added", ob7, orderBillList.get(1));

		// add 3rd order bill, test the size of list is 3
		// the item added is same as the third item of the list
		C206_CaseStudy.addorderBill(orderBillList, ob8);
		assertEquals("Test that order bill arraylist is 3", 3, orderBillList.size());
		assertSame("Test that order bill is added", ob8, orderBillList.get(2));

	}

	@Test
	public void testRetrieveAllorderBill() {
		// test if orderbill list is not null but empty
		assertNotNull("Test if there is valid order bill arraylist to retrieve item", orderBillList);

		// test if the list of order bill retrieved is empty
		String allOrderBill = C206_CaseStudy.retrieveorderBills(orderBillList);
		String testOutput = "";
		assertEquals("Check that viewAllorderbill", testOutput, allOrderBill);

		// added 3 item and test if the size is 3
		C206_CaseStudy.addorderBill(orderBillList, ob6);
		C206_CaseStudy.addorderBill(orderBillList, ob7);
		C206_CaseStudy.addorderBill(orderBillList, ob8);
		assertEquals("Test that orderBill arraylist size is 3", 3, orderBillList.size());

		// test if the expected output is the same as the list from C206_CaseStudy
		allOrderBill = C206_CaseStudy.retrieveorderBills(orderBillList);
		testOutput = String.format("%-10d %-30s %-20s %-15s %-40s %-20.2f\n", 130, "1-AUG-2021", "Fried Rice",
				"Apple Juice", "Watermelon", 5.00);
		testOutput += String.format("%-10d %-30s %-20s %-15s %-40s %-20.2f\n", 131, "1-AUG-2021", "Tomato Pasta",
				"Soymilk", "Pineapple", 5.90);
		testOutput += String.format("%-10d %-30s %-20s %-15s %-40s %-20.2f\n", 132, "1-AUG-2021", "Corn Sushi",
				"Soymilk", "Grapes", 5.90);

		assertEquals("Test that viewAllorderbill", testOutput, allOrderBill);

	}

	@Test
	public void testDeleteOrderBill() {
		assertNotNull("Test if there is valid order bill arraylist to delete from", orderBillList);
		C206_CaseStudy.addorderBill(orderBillList, ob6);

		// error
		Boolean isDeleted = C206_CaseStudy.doDeleteOrderBill(orderBillList, 133);
		assertFalse("Test if non-existing order bill is deleted", isDeleted);

		// normal
		C206_CaseStudy.addorderBill(orderBillList, ob7);
		isDeleted = C206_CaseStudy.doDeleteOrderBill(orderBillList, 131);
		assertTrue("Test if order bill is deleted", isDeleted);

	}
	
	public void addMenubank() {
	      // menu bank list is not null, can add menu bank
	      assertNotNull("Test if there is valid menubank arraylist to add to", MenubankList);
	      
	      // add 1st menubank, size of the list 1
	      // the item just added is as same as the first item of the list
	      C206_CaseStudy.addMenubank(MenubankList, mb1);
	      assertEquals("Test that menu bank arraylist is 1", 1, MenubankList.size());
	      assertSame("Test that menu bank is added", mb1, MenubankList.get(0));
	      
	      // add 2nd menu bank, test the size of list is 2
	      // the item added is as same as the second item of the list
	      C206_CaseStudy.addMenubank(MenubankList, mb2);
	      assertEquals("Test that menu bank arraylist is 2", 2, MenubankList.size());
	      assertSame("Test that menu bank is added", mb2, MenubankList.get(1));
	      
	      // add 3rd menu bank, test the size of list is 3
	      // the item added is same as the third item of the list
	      C206_CaseStudy.addMenubank(MenubankList, mb3);
	      assertEquals("Test that menu bank arraylist is 3", 3, MenubankList.size());
	      assertSame("Test that menu bank is added", mb3, MenubankList.get(2));
	      
	     }
	@Test
    public void testRetrieveAllmenubank() {
     // test if menu bank list is not null but empty
     assertNotNull("Test if there is valid menu bank arraylist to retrieve item", MenubankList);
     
     // test if the list of menu bank retrieved is empty
     String allMenubank = C206_CaseStudy.retrieveAllMenubank(MenubankList);
     String testOutput = "";
     assertEquals("Check that viewAllmenubank", testOutput, allMenubank);
     
     // added 3 item and test if the size is 3
     C206_CaseStudy.addMenubank(MenubankList, mb1);
     C206_CaseStudy.addMenubank(MenubankList, mb2);
     C206_CaseStudy.addMenubank(MenubankList, mb3);
     assertEquals("Test that menu bank arraylist size is 3", 3, MenubankList.size());
     
     // test if the expected output is the same as the list from C206_CaseStudy
     allMenubank = C206_CaseStudy.retrieveAllMenubank(MenubankList);
     testOutput = String.format("%-40s %-20.2f %-10s\n", "Fried Rice", 2.00, "YES");
     testOutput += String.format("%-40s %-20.2f %-10s\n", "Corn Sushi", 2.50, "YES");
     testOutput += String.format("%-40s %-20.2f %-10s\n", "Pumpkin Soup", 2.00, "YES");
   
     assertEquals("Test that viewAllmenubank", testOutput, allMenubank);
	     
	}
	
	 @Test
     public void deleteAllMenubank() {
      assertNotNull("Test if there is valid menu bank arraylist to delete from", MenubankList);
      C206_CaseStudy.addMenubank(MenubankList, mb1);
      
      // error 
      Boolean isDeleted = C206_CaseStudy.doDeleteMenubank(MenubankList, "Tomato Pasta");
      assertFalse("Test if non-existing menu bank is deleted", isDeleted);
      
      // normal
      C206_CaseStudy.addMenubank(MenubankList, mb2);
      isDeleted = C206_CaseStudy.doDeleteMenubank(MenubankList, "Fried Rice");
      assertTrue("Test if menubank is deleted", isDeleted);
	 }
	@After
	public void tearDown() throws Exception {
		ma1 = null;
		ma2 = null;
		ma3 = null;
		mv1 = null;
		mv2 = null;
		mv3 = null;
		mw1 = null;
		mw2 = null;
		mw3 = null;
		d1 = null;
		d2 = null;
		d3 = null;
		f1 = null;
		f2 = null;
		f3 = null;
		monthlyMenuList = null;

		// ACCOUNT USER
		AC1 = null;
		AC2 = null;
		AC3 = null;
		accountList = null;

		// ORDER BILL
		ob6 = null;
		ob7 = null;
		ob8 = null;
		orderBillList = null;
		
		//MENU BANK
	    mb1 = null;
	    mb2 = null;
	    mb3 = null;
	    MenubankList = null;
	}

}
