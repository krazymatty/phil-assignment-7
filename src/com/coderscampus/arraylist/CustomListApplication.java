package com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {

		addToListTest();
		addToListAtIndexTest();
		removeItemByIndexTest();

	}

	private static void removeItemByIndexTest() {
		CustomList<Person> myCustomList;
		myCustomList = new CustomArrayList<>();
		// Add names to list
		myCustomList.add(new Person("Frank"));
		myCustomList.add(new Person("Phil"));
		myCustomList.add(new Person("Fred"));
		myCustomList.add(new Person("Joe"));
		System.out.println("-------- Start Test: .remove(2);");
		System.out.println("Init Array: Frank, Phil, Fred, & Joe");
		for (int i = 0; i < 4; i++) {
			System.out.println("index " + i + ": " + myCustomList.get(i));
		}
		System.out.println("Init Array Size: " + myCustomList.getSize());
		myCustomList.remove(2);
		System.out.println("\nNew Array after removing Fred from index 2: \n");

		for (int i = 0; i < 4; i++) {
			if (myCustomList.get(i) != null) {
				System.out.println("index " + i + ": " + myCustomList.get(i));
			}
		}
		System.out.println("New Array Size: " + myCustomList.getSize());
		// Tests IndexOutOfBoundsException
//		System.out.println(myCustomList.get(4));
		System.out.println("-------- End Test -------\n");
	}

	private static void addToListAtIndexTest() {
		CustomList<Person> myCustomList;
		myCustomList = new CustomArrayList<>();
		// Add names to list
		myCustomList.add(new Person("Frank"));
		myCustomList.add(new Person("Fred"));
		myCustomList.add(new Person("Joe"));
		System.out.println("-------- Start Test: .add(int index, T item);");
		System.out.println("Init Array: Frank, Fred, & Joe");
		for (int i = 0; i < 3; i++) {
			if (myCustomList.get(i) != null) {
				System.out.println("index " + i + ": " + myCustomList.get(i));
			}
		}
		System.out.println("Init Array Size: " + myCustomList.getSize());
		myCustomList.add(1, new Person("Phil"));
		System.out.println("\nNew Array after adding Phil at index 1:\n");

		for (int i = 0; i < 4; i++) {
			System.out.println("index " + i + ": " + myCustomList.get(i));
		}
		System.out.println("New Array Size: " + myCustomList.getSize());
		// Tests IndexOutOfBoundsException
//		System.out.println(myCustomList.get(4));
		System.out.println("-------- End Test -------\n");
	}

	private static void addToListTest() {
		CustomList<Person> myCustomList;
		myCustomList = new CustomArrayList<>();
		// Add names to list
		myCustomList = new CustomArrayList<>();
		myCustomList.add(new Person("Frank"));
		myCustomList.add(new Person("Fred"));
		myCustomList.add(new Person("Joe"));
		System.out.println("-------- Start Test .add();");
		System.out.println("Init Array created by .add();");
		for (int i = 0; i < 3; i++) {
			System.out.println("index " + i + ": " + myCustomList.get(i));
		}
		// Tests IndexOutOfBoundsException
//		System.out.println(myCustomList.get(4));
		System.out.println("-------- End Test -------\n");
	}

}
