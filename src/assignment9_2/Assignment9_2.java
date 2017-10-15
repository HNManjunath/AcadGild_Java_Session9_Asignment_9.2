package assignment9_2;

/**
 * @author MANJUNATH
 * This class will get elements from 2 sets from the user and perform union operation and display the result.
 * set1 accepts data from user, then set 2 accepts similar data with additional data. set2 elements will be added to set1 to perform union operation.
 * behavior of the set is not to accepts duplicate elements. while adding set2 elements to set1 duplicate elements will be ignored.
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Assignment9_2 {

	private static Scanner sc; // declare scanner class object

	// Main method starts
	public static void main(String[] args) {

		Set<String> set1 = new HashSet<String>(); // create set1 object
		Set<String> set2 = new HashSet<String>(); // create set2 object
		sc = new Scanner(System.in); // scanner class object to accept input from user.
		String set1Elements = "";
		String set2Elements = "";
		int input = 0;
		
		while (true) {
			System.out.println("Enter 1:insert set1 elements\t2:Insert set2 elements\t3:Display set Elements\t4:Exit");
			input = sc.nextInt(); // accepts input from user to insert/display the set elements
			
			if (input == 1) {
				System.out.println("Enter set 1 Elements:");
				sc.nextLine();
				set1Elements = sc.nextLine(); // get the user input element for set1
				set1.add(set1Elements); // adds user input elements to set1
			} 
			else if (input == 2) {
				System.out.println("Enter set 2 Elements:");
				sc.nextLine();
				set2Elements = sc.nextLine(); // get the user input element for set2
				set2.add(set2Elements); // adds user input elements to set2
			} 
			else if (input == 3) {
				System.out.println("Set1 Elements are:\n" + set1); // display the user input of set1 elements
				System.out.println("Set2 Elemets are:\n" + set2); // display the user input of set2 elements
				System.out.println("\nUnion of Set1 and Set2 elements are:");
				set1.addAll(set2); // adds set2 input elements to set1
				System.out.println(set1); // display union of set1 and set2 elements
			} 
			else if (input == 4) {
				System.exit(0); // adds user input elements to set1
			} 
			else {
				System.out.println("Enter valid options");
			}

		}
	}
}
