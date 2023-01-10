package com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {

		CustomList<Person> myCustomList = new CustomArrayList<>();

		// Add custom names here or choose the auto name generator below
		myCustomList.add(new Person("Frank"));
		myCustomList.add(new Person("Fred"));
		myCustomList.add(new Person("Joe"));

		// ATTN: CODERS CAMPUS REVIEWER: These variable and the addPeopleCustomList()
		// method is used to auto generate a bunch of names
		int autoNamesToGen = 12; // Tell me how many random names to generate.
		String autoFirstName = "Philip"; // Enter a random name to seed the generator.
		addPeopleCustomList(autoNamesToGen, autoFirstName, myCustomList);

		// Prints the entire array of first names excluding any null values.
		int i = 0;  // also used below to print last item in array
		for (i = 0; i < myCustomList.getSize() && myCustomList.get(i) != null; i++) {
			System.out.println("Index " + i + ": " + myCustomList.get(i).name);
		}

		// ATTN: CODERS CAMPUS REVIEWER: The code below is nice to have and not in the requirements.
		// Prints the name by index number OR the that last item in the array if out of bounds.
		int indexOfArrayToRetrive = 7;
		if (myCustomList.get(indexOfArrayToRetrive) != null) {
			System.out.println("The name at index " + indexOfArrayToRetrive + " is: "
					+ myCustomList.get(indexOfArrayToRetrive).name);
		} else {
			System.out.println("The last name in the array is: " + myCustomList.get(i - 1).name);
		}

		// Checks the size of the array
		System.out.println("The Array Size Is: " + myCustomList.getSize());
	}

	// this method is used to auto generate a number of names.
	private static void addPeopleCustomList(int numberOfNames, String autoFirstName, CustomList<Person> myCustomList) {
		for (int i = 0; i < numberOfNames; i++) {
			myCustomList.add(new Person(autoFirstName + " " + (i + 1)));

		}
	}

}
