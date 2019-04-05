package junit_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import datastructures.list.CircularlyDynamicArrayList;
import datastructures.list.CircularlyList;



class CircularlyDynamicArrayListTest {
	
	//---TEST INSTANCES---//
	//EMPTY LIST
	CircularlyList<String> emptyList;
				
	//SMALL LIST (ONE ELEMENT)
	CircularlyList<String> smallList;
			
	//LARGE LIST (MORE THAN ONE ELEMENT)
	CircularlyList<String> largeList;
	

	@BeforeEach
	void setUp() throws Exception {
		
		emptyList = new CircularlyDynamicArrayList<String>();
		
		smallList = new CircularlyDynamicArrayList<String>();
		smallList.addFirst("HEBER");
		
		largeList = new CircularlyDynamicArrayList<String>();
		largeList.addFirst("HEBER");
		largeList.addFirst("SARA");
		largeList.addFirst("PAMELA");
		largeList.addFirst("RAQUEL");
		largeList.addFirst("SAMUEL");
		largeList.addFirst("JUNIOR");
		largeList.addFirst("ANA");
	}
	
	@Test
	void testRotate() {
		
		//EMPTY LIST
		assertEquals(emptyList.rotate(),false);
		
		//SMALL LIST (ONE ELEMENT)
		assertEquals(smallList.rotate(),true);
		assertEquals(smallList.getFirst(),"HEBER");
				
		//LARGE LIST (MORE THAN ONE ELEMENT)
		assertEquals(largeList.rotate(),true);
		assertEquals(largeList.getAt(0),"JUNIOR");
		assertEquals(largeList.getAt(1),"SAMUEL");
		assertEquals(largeList.getAt(2),"RAQUEL");
		assertEquals(largeList.getAt(3),"PAMELA");
		assertEquals(largeList.getAt(4),"SARA");
		assertEquals(largeList.getAt(5),"HEBER");
		assertEquals(largeList.getAt(6),"ANA");
	}

	@Test
	void testGetSize() {
		assertEquals(emptyList.getSize(), 0);
		assertEquals(smallList.getSize(), 1);
		assertEquals(largeList.getSize(), 7);
	}

	@Test
	void testAddFirst() {
		
		//emptyList
		emptyList.addFirst("addFirst");
		assertEquals(emptyList.getFirst(), "addFirst");
				
		//smallList
		smallList.addFirst("addFirst");
		assertEquals(smallList.getFirst(), "addFirst");
		
		//largeList
		smallList.addFirst("addFirst");
		assertEquals(smallList.getFirst(), "addFirst");

	}
	
	@Test
	void testAddLast() {
		
		//emptyList
		emptyList.addLast("addLast");
		assertEquals(emptyList.getLast(), "addLast");
				
		//smallList
		smallList.addLast("addLast");
		assertEquals(smallList.getLast(), "addLast");
		
		//largeList
		smallList.addLast("addLast");
		assertEquals(smallList.getLast(), "addLast");
	}

	@Test
	void testAddAt() {
		//emptyList
		try {
			emptyList.addAt("Out Of Range - down", -1);
			fail("Insertion out of Range");
		}catch (IndexOutOfBoundsException e) {
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}
		
		try {
			emptyList.addAt("Out Of Range - up", 1);
			fail("Insertion out of Range");
		}catch (IndexOutOfBoundsException e) {
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}
		
		boolean add1 = emptyList.addAt("Heber", 0);
		assertEquals(add1, true);
		assertEquals(emptyList.getAt(0), "Heber");
		
		boolean add2 = emptyList.addAt(null, 0);
		assertEquals(add2, false);
		assertEquals(emptyList.getAt(0), "Heber");
		
		//smallList
		try {
			smallList.addAt("Out Of Range - down", -1);
			fail("Insertion out of Range");
		}catch (IndexOutOfBoundsException e) {
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}
		
		try {
			smallList.addAt("Out Of Range - up", 2);
			fail("Insertion out of Range");
		}catch (IndexOutOfBoundsException e) {
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}
		
		boolean add3 = smallList.addAt("Heber", 0);
		assertEquals(add3, true);
		assertEquals(smallList.getAt(0), "Heber");
		
		boolean add4 = smallList.addAt(null, 0);
		assertEquals(add4, false);
		assertEquals(smallList.getAt(0), "Heber");
		
		//largeList
		try {
			largeList.addAt("Out Of Range - down", -1);
			fail("Insertion out of Range");
		}catch (IndexOutOfBoundsException e) {
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}
		
		try {
			largeList.addAt("Out Of Range - up", 8);
			fail("Insertion out of Range");
		}catch (IndexOutOfBoundsException e) {
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}
		
		boolean add5 = largeList.addAt("Heber", 0);
		assertEquals(add5, true);
		assertEquals(largeList.getAt(0), "Heber");
		
		boolean add6 = largeList.addAt(null, 0);
		assertEquals(add6, false);
		assertEquals(largeList.getAt(0), "Heber");
		
	}

	@Test
	void testGetFirst() {
		
		//emptyList
		try {
			String s = emptyList.getFirst();
		}catch (IndexOutOfBoundsException e) {
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}

		
		//smallList
		assertEquals(smallList.getFirst(), "HEBER");
		
		
		//largeList
		assertEquals(largeList.getFirst(), "ANA");
	}

	@Test
	void testGetLast() {
		//TODO system warning
		//emptyList
		try {
			String s = emptyList.getLast();
			System.out.println(s);
		}catch (IndexOutOfBoundsException e) {
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}

		//smallList
		assertEquals(smallList.getLast(), "HEBER");
				
		//largeList
		assertEquals(largeList.getLast(), "HEBER");
	}

	@Test
	void testGetAt() {

		//emptyList
		try {
			String str1 = emptyList.getAt(0);
			fail("getAt empty list!");
		}catch (IndexOutOfBoundsException e){
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}

		try {
			String str2 = smallList.getAt(-1);
			fail("Out Of Bounds - DOWN");
		}catch (IndexOutOfBoundsException e){
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}

		try {
			String str3 = smallList.getAt(1);
			fail("Out Of Bounds - UP");
		}catch (IndexOutOfBoundsException e){
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}

		
		//smallList
		try {
			String str4 = smallList.getAt(-1);
			fail("Out Of Bounds - DOWN");
		}catch (IndexOutOfBoundsException e){
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}

		try {
			String str5 = smallList.getAt(1);
			fail("Out Of Bounds - UP");
		}catch (IndexOutOfBoundsException e){
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}
		
		assertEquals (smallList.getAt(0), "HEBER");
		
		
		//largeList
		try {
			String str4 = largeList.getAt(-1);
			fail("Out Of Bounds - DOWN");
		}catch (IndexOutOfBoundsException e){
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}

		try {
			String str5 = largeList.getAt(7);
			fail("NOK - Out Of Bounds - UP");
		}catch (IndexOutOfBoundsException e){
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}
		
		assertEquals (largeList.getAt(0), "ANA");
		assertEquals (largeList.getAt(6), "HEBER");

	}
	
	@Test
	void testRemoveFirst() {
		//emptyList
		try {
			emptyList.removeFirst();
			fail("Remove at empty list");
		}catch (IndexOutOfBoundsException e){
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}
		
		//smallList
		String result = smallList.removeFirst();
		assertEquals(result, "HEBER");
		assertEquals(smallList.getSize(), 0);
		
		//largeList
		String result2 = largeList.removeFirst();
		assertEquals(result2, "ANA");
		assertEquals(largeList.getSize(), 6);
		
		String result3 = largeList.removeFirst();
		assertEquals(result3, "JUNIOR");
		assertEquals(largeList.getSize(), 5);
		
	}

	@Test
	void testRemoveLast() {

		//emptyList
		try {
			emptyList.removeLast();
			fail("Remove at empty list");
		}catch (IndexOutOfBoundsException e){
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}
		
		//smallList
		String result = smallList.removeLast();
		assertEquals(result, "HEBER");
		assertEquals(smallList.getSize(), 0);
		
		//largeList
		String result2 = largeList.removeLast();
		assertEquals(result2, "HEBER");
		assertEquals(largeList.getSize(), 6);
		
		String result3 = largeList.removeLast();
		assertEquals(result3, "SARA");
		assertEquals(largeList.getSize(), 5);

	}

	@Test
	void testRemoveAt() {
		
		//emptyList
		try {
			emptyList.removeAt(0);
			fail("Remove at empty list");
		}catch (IndexOutOfBoundsException e){
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}
		
		try {
			emptyList.removeAt(-1);
			fail("Remove out of bounds - DOWN");
		}catch (IndexOutOfBoundsException e){
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}
		
		try {
			emptyList.removeAt(1);
			fail("Remove out of bounds - UP");
		}catch (IndexOutOfBoundsException e){
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}
		
		
		//smallList
		try {
			smallList.removeAt(-1);
			fail("Remove out of bounds - DOWN");
		}catch (IndexOutOfBoundsException e){
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}
		
		try {
			smallList.removeAt(1);
			fail("Remove out of bounds - UP");
		}catch (IndexOutOfBoundsException e){
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}
		
		smallList.removeAt(0);
		try {
			String s = smallList.getAt(0);
			fail("Must be now a empty list");
		}catch (IndexOutOfBoundsException e){
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}
		
		assertEquals(smallList.getSize(), 0);
		
		//largeList
		try {
			largeList.removeAt(-1);
			fail("Remove out of bounds - DOWN");
		}catch (IndexOutOfBoundsException e){
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}
		
		try {
			largeList.removeAt(7);
			fail("Remove out of bounds - UP");
		}catch (IndexOutOfBoundsException e){
			System.out.println("OK - Catch Exception :"+e.getMessage());
		}
		
		largeList.removeAt(3);
		assertEquals(largeList.getSize(), 6);
		String removed = largeList.getAt(3);
		assertEquals(removed , "PAMELA");
		
	}

	@Test
	void testDoubleLinkedList() {
		
		//emptylist
		emptyList.printElements();
		
		//smallList
		smallList.printElements();
		
		//largeList
		largeList.printElements();
	}
}