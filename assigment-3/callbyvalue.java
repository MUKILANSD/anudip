public class val {
		    int a = 24;
		    void modify(int a) 
		    { 
		       a = a + 2800; 
		      System.out.println("Value of a after modification: " +a); 
		    } 
		public static void main(String[] args) 
		{ 
		    val t = new val(); 
		     t.modify(t.a); 
		    System.out.println("Original value of a: " +t.a); 
		 } 
		}