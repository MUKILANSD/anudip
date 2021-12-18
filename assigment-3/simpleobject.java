class Simpleobject 
{
	private String word;
	Simpleobject() // constructor 
	{				  
	    System.out.println("Constructor is Called:");
	    word = "Dhanushkodi";
	}

	public static void main(String[] args) 
	{
	    Simpleobject obj = new Simpleobject();
	    System.out.println("The name is " + obj.word);

	}

}