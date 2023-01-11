package com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {

		addToListTest();
		addToListAtIndexTest();
		removeItemByIndexTest();

	}

	private static CustomList<Person> addNames() {
		CustomList<Person> myCustomList;
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
		myCustomList.add(new Person("Phil2"));
		myCustomList.add(new Person("Phil3"));
		myCustomList.add(new Person("Fred2"));
		myCustomList.add(new Person("Joe2"));
		return myCustomList;
	}

	private static void addToListTest() {
		CustomList<Person> myCustomList = addNames();

		System.out.println("Init Array Size: " + myCustomList.getSize());
		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println("index " + i + ": " + myCustomList.get(i));
		}
		System.out.println("New Array Size: " + myCustomList.getSize());

		// Tests IndexOutOfBoundsException
//		System.out.println(myCustomList.get(4));
		System.out.println("-------- End Test -------\n");
	}

	private static void addToListAtIndexTest() {
		CustomList<Person> myCustomList = addNames();

		System.out.println("Init Array Size: " + myCustomList.getSize());
		for (int i = 0; i < myCustomList.getSize(); i++) {
				System.out.println("index " + i + ": " + myCustomList.get(i));
		}

		myCustomList.add(1, new Person("King George"));
		myCustomList.add(5, new Person("Queen Hearts"));

		System.out.println("\nNew Array Size: " + myCustomList.getSize() + " after adding items to array:\n");

		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println("index " + i + ": " + myCustomList.get(i));
		}
		System.out.println("New Array Size: " + myCustomList.getSize());

		// Tests IndexOutOfBoundsException
//		System.out.println(myCustomList.get(4));
		System.out.println("-------- End Test -------\n");
	}

	private static void removeItemByIndexTest() {
		CustomList<Person> myCustomList = addNames();

		System.out.println("Init Array Size: " + myCustomList.getSize() + " Before Removing");
		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println("index " + i + ": " + myCustomList.get(i));
		}
		System.out.println("Init Array Size: " + myCustomList.getSize());
		myCustomList.remove(9);
		myCustomList.remove(7);
		System.out.println("\nNew Array Size: " + myCustomList.getSize() + " After removing items from array: \n");

		for (int i = 0; i < myCustomList.getSize(); i++) {
			if (myCustomList.get(i) != null) {
				System.out.println("index " + i + ": " + myCustomList.get(i));
			}
		}
		System.out.println("New Array Size: " + myCustomList.getSize());
		// Tests IndexOutOfBoundsException
//		System.out.println(myCustomList.get(4));
		System.out.println("-------- End Test -------\n");
	}

}
