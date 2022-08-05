import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	//prepare test data
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
	
	private ArrayList <Menu> monthlyMenuList;
	
	
	public C206_CaseStudyTest() {
		super();
		
	}
	
	@Before
	public void setUp() throws Exception {
		//Asian Menu
		ma1 = new Menu("August", "Fried Rice", 2.00);
		ma2 = new Menu("August", "Dumpling Noodle", 3.50);
		ma3 = new Menu("September", "Oyakodon", 3.00);
		ma4 = new Menu("September", "Curry Rice", 2.50);
		
		//Western Menu
		mw1 = new Menu("September", "Tomato Pasta ", 2.50);
		mw2 = new Menu("August", "Chicken Cutlet With Fries", 4.00);
		mw3 = new Menu("August", "Chicken Tortilla Wrap", 3.00);
		mw4 = new Menu("September", "Mac and Cheese", 2.80);
		
		//Vegetarian Menu
		mv1 = new Menu("August", "Teriyaki Tofu Rice ", 3.50);
		mv2 = new Menu("August", "Corn Sushi", 2.50);
		mv3 = new Menu("September", "Roasted Chickpea Wrap", 3.00);
		mv4 = new Menu ("September", "Pumpkin Soup", 2.00);
		
		//Drinks Menu
		d1 = new Menu("August", "Apple Juice", 1.80);
		d2 = new Menu("August", "Soymilk", 2.00);
		d3 = new Menu("September", "Ice Chocolate", 1.50);
		d4 = new Menu("September", "Green Tea", 1.20);
		
		//Fruits Menu
		f1= new Menu("August", "Watermelon", 1.20);
		f2 = new Menu("August", "Pineapple", 1.40);
		f3 = new Menu("September", "Grapes", 1.40);
		f4 = new Menu("September", "Papaya", 1.00);
		
		monthlyMenuList = new ArrayList<Menu>();
	}
	
	@Test
	public void testviewAllMenu() {
		
		//test if there is a valid menu arraylist
		assertNotNull("test if there is valid Menu arraylist", monthlyMenuList);
		
		//test if the list retrieved is empty
		String allMenu = C206_CaseStudy.retrieveAllMenu(monthlyMenuList);
		String testOutput = "";
		assertEquals("Check that ViewAllMenu", testOutput, allMenu);
		
		//test if the expected output string same
		allMenu = C206_CaseStudy.retrieveAllMenu(monthlyMenuList);

		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "August", "Fried Rice", 2.00 , "Yes" );
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "August", "Dumpling Noodle", 3.50, "Yes" );
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "September",  "Oyakodon", 3.00 , "Yes" );
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "September", "Curry Rice", 2.50 , "Yes" );
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "September", "Tomato Pasta", 2.50 , "Yes" );
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "August", "Chicken Cutlet With Fries", 4.00 , "Yes" );
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "August", "Chicken Tortilla Wrap", 3.00 , "Yes" );
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "September", "Mac and Cheese", 2.80 , "Yes" );
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "August", "Teriyaki Tofu Rice", 3.50 , "Yes" );
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "August", "Corn Sushi", 2.50 , "Yes" );
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "September", "Roasted Chickpea Wrap", 3.00 , "Yes" );
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "September", "Pumpkin Soup", 2.00 , "Yes" );
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "August", "Apple Juice", 1.80 , "Yes" );
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "August", "Soymilk", 2.00 , "Yes" );
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "September", "Ice Chocolate", 1.50 , "Yes" );
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "September", "Green Tea", 1.80 , "Yes" );
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "August", "Watermelon", 1.20 , "Yes" );
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "August", "Pineapple", 1.40 , "Yes" );
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "September", "Grapes", 1.40 , "Yes" );
		testOutput = String.format("%-20s %-40s %-20.2f %-10s\n", "September", "Papaya", 1.00 , "Yes" );
		
		assertEquals("Check that ViewAllMenu", testOutput, allMenu);
		
		
	}
		

	@Test
	public void testdeleteMenu() {

		//Test that list is not empty - boundary
		assertNotNull("test if there is valid Menu arraylist to delete from", monthlyMenuList);
	
		// Test that item is removed - normal
		monthlyMenuList.remove(ma1);
		assertEquals("Check if item is removed", 0, monthlyMenuList.size());
				
		//Item not available - error condition
		f1.setAvailable(false);
		boolean avail = C206_CaseStudy.doDeleteMenu(monthlyMenuList, "Watermelon");
		assertFalse("Test if item is available to delete", avail);	
		
		//Test that item not found in menu can be deleted - error condition
		avail = C206_CaseStudy.doDeleteMenu(monthlyMenuList, "Papaya");
		assertFalse("Test that non-existing item can be deleted", avail);


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
	}


}
