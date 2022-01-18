/**
 * TODO: Add your file header
 * Name:
 * ID:
 * Email:
 * Sources used: Put "None" if you did not have any external help
 * Some example of sources used would be Tutors, Zybooks, and Lecture Slides
 * 
 * 2-4 sentence file description here
 */

 //IMPORTANT: Do not change the headers!

import static org.junit.Assert.*;

import org.junit.*;

public class MyArrayListHiddenTester {

	/**
	 * This sets up the test fixture. JUnit invokes this method before
	 * every testXXX method. The @Before tag tells JUnit to run this method
	 * before each test */
	@Before
	public void setUp() throws Exception {
		listEmpty = new MyArrayList();
		listDefaultCap = new MyArrayList(DEFAULT_CAPACITY);
		listCustomCapacity = new MyArrayList(MY_CAPACITY);
		listWithNull = new MyArrayList(arr);
		listWithInt = new MyArrayList<Integer>(arrInts);
	}

	/** TODO
	 * Aims to test the capacity argument constructor when the input
	 * is not valid
	 */
	@Test
	public void testConstructorInvalidArg(){
		assertEquals("Check for invalid input for capacity arg constructor", 4, listCustomCapacity.size);
	}

	/**
	 * Aims to test the Array argument constructor when the input
	 * is null
	 */
	@Test
	public void testConstructorNullArg(){
		assertEquals("Check size for constructor with null argument", 10, listWithNull.size);
		assertEquals("Check capacity for constructor with null argument", 10, listWithNull.data.length);
	}

	/**
	 * Aims to test the append method when an element is added to a full list
	 * Check reflection on size and capacity
	 */
	@Test
	public void testAppendAtCapacity(){
		listCustomCapacity.add(8);
		listCustomCapacity.add(10);
		listCustomCapacity.add(4);
		listCustomCapacity.append(3);

		assertEquals("Check that append increments size", 4, listCustomCapacity.size);
		assertEquals("Check that capacity is updated", 6, listCustomCapacity.data.length);
		assertEquals("Check the correct element", 8, listCustomCapacity.data[0]);
		assertEquals("Check the correct element", 3, listCustomCapacity.data[3]);
	}

	/**
	 * Aims to test the prepend method when a null element is added
	 * Checks reflection on size and capacity
	 * Checks whether null was added successfully
	 */
	@Test
	public void testPrependNull(){
		listCustomCapacity.prepend(null);
		listWithInt.prepend(null);

		assertEquals("Check that item prepended empty list", null, listCustomCapacity.data[0]);
		assertEquals("Check list size after prepend empty list", 1, listCustomCapacity.size);
		assertEquals("Check that capacity unchanged empty list", 6, listCustomCapacity.data.length);
		
		assertEquals("Check that item prepended non-empty list", null, listWithInt.data[0]);
		assertEquals("Check list size after prepend non-empty list", 4, listWithInt.size);
		assertEquals("Check that capacity unchanged non-empty list", 6, listWithInt.data.length);
	}
	
	/**
	 * Aims to test the insert method when input index is out of bounds
	 */
	@Test
	public void testInsertOutOfBound(){
		
	}

	/**
	 * Insert multiple (eg. 1000) elements sequentially beyond capacity -
	 * Check reflection on size and capacity
	 * Hint: for loop could come in handy
	 */
	@Test
	public void testInsertMultiple(){
		
	}

	/**
	 * Aims to test the get method when input index is out of bound
	 */
	@Test
	public void testGetOutOfBound(){
		
	}

	/**
	 * Aims to test the set method when input index is out of bound
	 */
	@Test
	public void testSetOutOfBound(){
		
	}


	/**
	 * Aims to test the remove method when input index is out of bound
	 */
	@Test
	public void testRemoveOutOfBound(){
		
	}

	/**
	 * Aims to test the expandCapacity method when 
	 * requiredCapacity is strictly less than the current capacity
	 */
	@Test
	public void testExpandCapacitySmaller(){
	   
	}

	/** TODO
	 * Aims to test the expandCapacity method when 
	 * requiredCapacity is greater than double(2x) the current capacity
	 */
	@Test
	public void testExpandCapacityExplode(){
		// requiredCapacity hardcode
		int requiredCapacity = (listWithInt.data.size) * 2 + 1;
		
		listWithInt.expandCapacity(requiredCapacity);

		assertEquals("Test expandCapacity for more than double current capacity", requiredCapacity, listWithInt.data.length);
	}

}

