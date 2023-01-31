import java.util.Scanner;

class SquareBuildings {
	int id;
	String name;
	int noOfFloors;

	public void insertData(int bid, String bname, int bnoOfFloors) {
		id = bid;
		name = bname;
		noOfFloors = bnoOfFloors;
	}

	public void displayData() {
		System.out.println("Name of Building id " + id + " is " + name + " which has " + noOfFloors + " floors");
	}
}

public class TaskOne {

	public static void main(String[] args) {

		int id;
		int fl;
		char ans;

		String buildingName;

		SquareBuildings s1 = new SquareBuildings();

		System.out.println("  ");
		System.out.println("Display Previous Records here");
		System.out.println("  ");

		s1.id = 1;
		s1.name = "iSquare1";
		s1.noOfFloors = 10;
		s1.displayData();
		s1.insertData(2, "gSquare7", 8);
		s1.displayData();

		ans = gaveanswer();

		if (ans == 'y') {
			System.out.println("Enter new Data Here");
			System.out.println("  ");

			Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(System.in);

			System.out.println("Enter id of Building");
			id = sc.nextInt();
			System.out.println("Enter name of Building");
			buildingName = sc1.nextLine();
			System.out.println("Enter Number of Floor Building have:");
			fl = sc.nextInt();

			s1.insertData(id, buildingName, fl);
			s1.displayData();

		} else if (ans == 'n') {
			System.out.println("End Of the program");

		} else {
			// char abc;
		}

	}

	public static char gaveanswer() {
		char tempans;
		System.out.println("Want to add new Data? (y or n): ");
		Scanner sc2 = new Scanner(System.in);
		tempans = sc2.next().charAt(0);
		return tempans;
	}
}