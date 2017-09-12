ximport java.util.Scanner;
import java.text.DecimalFormat;
/**
* CS180 - Homework 1
*
* @author Andrew Teck Kiat Lim, lim243@purdue.edu
*
* @version August 28 2017
*
*/
public class BusinessCard {

	public static void main(String[] args) {
		BusinessCard b = new BusinessCard(); /*Creating a class*/
		Scanner s = new Scanner(System.in);  /* Creating scanner*/
		DecimalFormat d = new DecimalFormat("#.00"); /*creating object for decimal points, "#.00" means always show 2 decimal places. */
		
		String name, major, email;  /*Naming strings*/
		int age;		/* Naming Integer */
		double GPA;		/* Naming Double */

		System.out.println("Enter your name: "); /*Prints */	
		name = s.nextLine();			/* Prompts the user "name", Line in capital letter */
			
		System.out.println("Enter your age: ");
		age = s.nextInt();			/* Prompts user "age", next Int for integers*/

		System.out.println("Enter your GPA: ");
		GPA = s.nextDouble();			/* Prompts "GPA"*/

		String x;				/* After using s.nextDouble, must create anoter string for prompt to work */
		x = s.nextLine();

		System.out.println("Enter your major: ");
		major = s.nextLine();
	
		System.out.println("Enter your email: ");
		email = s.nextLine();

		System.out.println("Name:  " + name);
		System.out.println("Age:   " + age);	
		System.out.println("GPA:   " + d.format(GPA));  /* object.format(variable), to get 2 decimal places*/
		System.out.println("Major: " + major);
		System.out.println("Email: " + email);
	}
}
   
