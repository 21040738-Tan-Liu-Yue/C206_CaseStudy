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
	
	private ArrayList <Menu> menuList;
	
	public C206_CaseStudyTest() {
		
	}
	@Before
	public void setUp() throws Exception {
		//Asian Menu
		ma1 = new Menu("Fried Rice", 2.00);
		ma2 = new Menu("Dumpling Noodle", 3.50);
		ma3 = new Menu("Oyakodon", 3.00);
		ma4 = new Menu("Curry Rice", 2.50);
		
		//Western Menu
		mw1 = new Menu("Tomato Pasta ", 2.50);
		mw2 = new Menu("Chicken Cutlet With Fries", 4.00);
		mw3 = new Menu("Chicken Tortilla Wrap", 3.00);
		mw4 = new Menu("Mac and Cheese", 2.80);
		
		//Vegetarian Menu
		mv1 = new Menu("Teriyaki Tofu Rice ", 3.50);
		mv2 = new Menu("Corn Sushi", 2.50);
		mv3 = new Menu("Roasted Chickpea Wrap", 3.00);
		mv4 = new Menu ("Pumpkin Soup", 2.00);
		
		//Drinks Menu
		d1 = new Menu("Apple Juice", 1.80);
		d2 = new Menu("Soymilk", 2.00);
		d3 = new Menu("Ice Chocolate", 1.50);
		d4 = new Menu("Green Tea", 1.20);
		
		//Fruits Menu
		f1= new Menu("Watermelon", 1.20);
		f2 = new Menu("Pineapple", 1.40);
		f3 = new Menu("Grapes", 1.40);
		f4 = new Menu("Papaya", 1.00);
		
		menuList = new ArrayList<Menu>();
	}
	
	@Test
	public void testviewAllMenu() {
		
		//test if the list retrieved is empty
		String allMenu = C206_CaseStudy.retrieveAllMenu(menuList);
		String testOutput = "";
		assertEquals("Check that ViewAllMenu", testOutput, allMenu);
		
		//test if the expected output string same
		allMenu = C206_CaseStudy.retrieveAllMenu(menuList);

		testOutput = String.format("%-40s %-20.2f %-10s\n", "Fried Rice", "2.00" , "Yes" );
		testOutput = String.format("%-40s %-20.2f %-10s\n", "Dumpling Noodle", "3.50", "Yes" );
		testOutput = String.format("%-40s %-20.2f %-10s\n", "Oyakodon", "3.00" , "Yes" );
		testOutput = String.format("%-40s %-20.2f %-10s\n", "Fried Rice", "2.00" , "Yes" );
		testOutput = String.format("%-40s %-20.2f %-10s\n", "Fried Rice", "2.00" , "Yes" );
		testOutput = String.format("%-40s %-20.2f %-10s\n", "Fried Rice", "2.00" , "Yes" );
		testOutput = String.format("%-40s %-20.2f %-10s\n", "Fried Rice", "2.00" , "Yes" );
		testOutput = String.format("%-40s %-20.2f %-10s\n", "Fried Rice", "2.00" , "Yes" );
		testOutput = String.format("%-40s %-20.2f %-10s\n", "Fried Rice", "2.00" , "Yes" );
		testOutput = String.format("%-40s %-20.2f %-10s\n", "Fried Rice", "2.00" , "Yes" );
		testOutput = String.format("%-40s %-20.2f %-10s\n", "Fried Rice", "2.00" , "Yes" );
		testOutput = String.format("%-40s %-20.2f %-10s\n", "Fried Rice", "2.00" , "Yes" );
		
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
	}

	@Test
	public void c206_test() {
		
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

}
