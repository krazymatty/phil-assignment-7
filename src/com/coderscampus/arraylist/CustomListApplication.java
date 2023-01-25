package com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {

		addToListTest();
		addToListAtIndexTest();
		removeItemByIndexTest();

	}

	private static CustomArrayList<Person> addNames() {
		CustomArrayList<Person> myCustomList;
		myCustomList = new CustomArrayList<>();
		myCustomList.add(new Person("Frank")); 
		myCustomList.add(new Person("Phil"));
		myCustomList.add(new Person("Fred"));
		myCustomList.add(new Person("Joe"));
		myCustomList.add(new Person("Frank1"));
		myCustomList.add(new Person("Phil1"));
		myCustomList.add(new Person("Fred1"));
		myCustomList.add(new Person("Joe1"));
		myCustomList.add(new Person("Frank2"));
		myCustomList.add(new Person("Phil2"));  // 10th item
		
//		myCustomList.add(new Person("Phil3"));
//		myCustomList.remove(5);
//		myCustomList.remove(5);
		
		return myCustomList;
	}

	private static void addToListTest() {
		CustomArrayList<Person> myCustomList = addNames();
		System.out.println("Init List Size: " + myCustomList.getSize());
		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println("index " + i + ": " + myCustomList.get(i));
		}
		System.out.println("New List Size: " + myCustomList.getSize());
		System.out.println("New Array Size: " + myCustomList.getArrSize());
		System.out.println("-------- End Test -------\n");
	}

	private static void addToListAtIndexTest() {
		CustomArrayList<Person> myCustomList = addNames();

		System.out.println("Init List Size: " + myCustomList.getSize());
		for (int i = 0; i < myCustomList.getSize(); i++) {
				System.out.println("index " + i + ": " + myCustomList.get(i));
		}

		myCustomList.add(1, new Person("King George"));
		myCustomList.add(5, new Person("Queen Hearts"));

		System.out.println("\nNew List Size: " + myCustomList.getSize() + " after adding items to array:\n");

		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println("index " + i + ": " + myCustomList.get(i));
		}
		System.out.println("New List Size: " + myCustomList.getSize());
		System.out.println("New Array Size: " + myCustomList.getArrSize());
		System.out.println("-------- End Test -------\n");
	}

	private static void removeItemByIndexTest() {
		CustomArrayList<Person> myCustomList = addNames();

		System.out.println("Init List Size: " + myCustomList.getSize() + " Before Removing");
		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println("index " + i + ": " + myCustomList.get(i));
		}
		System.out.println("Init List Size: " + myCustomList.getSize());
		System.out.println("New Array Size: " + myCustomList.getArrSize());
		myCustomList.remove(8);
		myCustomList.remove(7);
		System.out.println("\nNew List Size: " + myCustomList.getSize() + " After removing items from array:");
		System.out.println("New Array Size: " + myCustomList.getArrSize() + "\n");
		
		for (int i = 0; i < myCustomList.getSize(); i++) {
			if (myCustomList.get(i) != null) {
				System.out.println("index " + i + ": " + myCustomList.get(i));
			}
		}
		System.out.println("New List Size: " + myCustomList.getSize());
		System.out.println("New Array Size: " + myCustomList.getArrSize());
		System.out.println("-------- End Test -------\n");
	}

}
