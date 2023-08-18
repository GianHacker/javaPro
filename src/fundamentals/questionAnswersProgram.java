package fundamentals;
import java.util.Scanner;

public class questionAnswersProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String userName = scanner.next();
		System.out.println(userName + " is a nice name.");
	
		System.out.println("\nHow old are you "+userName+" ?");
		int userAge = scanner.nextInt();
		System.out.println("Your name is "+userName+ " and you are "+userAge+ " years old.");
	}

}
