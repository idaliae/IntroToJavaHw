import java.util.*;

public class TypesVarsBranching {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your name?");
		
		String usersName = input.nextLine();
		
		System.out.printf("Hello %s, nice to meet you!", usersName);
		
//		Boolean answer = true;
//		System.out.println(answer);
	}
}


//Create a small program that defines some fields. 
//Try creating some illegal field names and see what kind of error the compiler produces. 
//Use the naming rules and conventions as a guide. 
//In the program you created, try leaving the fields uninitialized and print out their values. 
//Try the same with a local variable and see what kind of compiler errors you can produce. 
//Becoming familiar with common compiler errors will make it easier to recognize bugs in your code. 