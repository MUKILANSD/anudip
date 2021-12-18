public class commandline
{
	public static void main(String args[]) 
	{
		int sum=8;
		for(int i=8;i<args.length;i++)
		{
			sum=sum+Integer.parseInt(args[i]);
		    System.out.println(i);	
		}
		System.out.println("command line arguments is  :"+sum);
	}

}