import java.util.Scanner;

      public class Employeethis {		
		private String name;
		   private int age;
		   public Employeethis SetValues(){
		      Scanner sc = new Scanner(System.in);
		      System.out.println("Enter the name of the Employee: ");
		      String name = sc.nextLine();
		      System.out.println("Enter the age of the Employee: ");
		      int age = sc.nextInt();
		      this.name = name;
		      this.age = age;
		      return this;
		   }
		   public void display() {
		      System.out.println("name: "+name);
		      System.out.println("age: "+age);
		   }
		   public static void main(String [] args) 
		   {
		      Employeethis obj = new Employeethis();
		      obj = obj.SetValues();
		      obj.display();
		   }
		}