import java.util.Scanner;

public class Stringequality {
	public static void main(String args[]) {
        String str1, str2;
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter 1st String:");
        str1 = scanner.nextLine();
 
        System.out.println("Enter 2nd String:k");
        str2 = scanner.nextLine();
       
        if (str1 == str2)
            System.out.print("Equal Strings");
        else
            System.out.print("Not Equal Strings");
    }
}
