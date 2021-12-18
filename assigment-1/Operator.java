
public class Operator {

   public static void main(String[] args) {
          int a = 5, b = 7;
          
          System.out.println("Increment and Decreament operator(s):");
          // increment operator
          System.out.println(a++);
            // decrement operator
          System.out.println(a--);
     
          
          // bitwise Complement operator
          System.out.println("Bitwise Complement operator..");
          int result = ~ a;
          System.out.println("Result : " + result);
          
          
          // arithmetic operator
          System.out.println("Arithmetic operator..");
          // addition operator
          System.out.println("x + y = " + (a + b));
          // subtraction operator
          System.out.println("x - y = " + (a - b));
            // multiplication operator
          System.out.println("x * y = " + (a * b));
          // division operator
          System.out.println("x / y = " + (a / b));
            // modulo operator
          System.out.println("x % y = " + (a % b));
          
          
          //  Relational Operator
          System.out.println("Relational operator..");
          // == operator
          System.out.println(a == b);  
          // != operator
          System.out.println(a != b);  
          // > operator
          System.out.println(a > b);  
          // < operator
          System.out.println(a < b);  
          // >= operator
          System.out.println(a >= b);  
          // <= operator
          System.out.println(a <= b);  
          
          
          // Bitwise Operator
          System.out.println("Bitwise operator..");
          // bitwise and          
          System.out.println("a&b = " + (a & b));   
          // bitwise or
          System.out.println("a|b = " + (a | b));   
          // bitwise xor
          System.out.println("a^b = " + (a ^ b));
          
          
          // Conditional Operator
          System.out.println("Conditional operator..");
          // Performing ternary operation
          result = (a > b) ? (a + b) : (a - b);
          System.out.println("Result = " + result);
          
      }
}