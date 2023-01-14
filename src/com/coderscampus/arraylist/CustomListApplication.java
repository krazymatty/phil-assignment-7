package com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {

		CustomList<Person> list = addNames();
		printNames(list);

	}

	private static CustomList<Person> addNames() {
		CustomList<Person> myCustomList;
		myCustomList = new CustomArrayList<>();
		myCustomList.add(new Person("Frank"));
		myCustomList.add(new Person("Phil"));
		myCustomList.add(new Person("Fred"));
		myCustomList.add(new Person("Joe"));
		myCustomList.add(new Person("Billy"));
		myCustomList.add(new Person("Skyla"));
		myCustomList.add(new Person("Damion"));
		myCustomList.add(new Person("Darnell"));
		myCustomList.add(new Person("Parker"));
		myCustomList.add(new Person("Diaz"));
		
//		myCustomList.add(1, new Person("Charles"));
		
//		myCustomList.remove(8);
//		myCustomList.remove(7);
//		
//	
//		myCustomList.add(new Person("Maddox"));
//		myCustomList.add(new Person("Davin"));
//		myCustomList.remove(1);
//		myCustomList.remove(1);
//		myCustomList.remove(1);
//		myCustomList.remove(1);
//		myCustomList.remove(1);
//		myCustomList.remove(1);
//		myCustomList.remove(1);

		return myCustomList;
	}

	private static void printNames(CustomList<Person> myCustomList) {
		for (int i = 0; i < myCustomList.getSize(); i++) {
			System.out.println("index " + i + ": " + myCustomList.get(i));
		}
		System.out.println("Number of valid elements in array:" + myCustomList.getSize());
		System.out.println("Size of array:" + ((CustomArrayList<Person>) myCustomList).getArrSize());
	}

}
