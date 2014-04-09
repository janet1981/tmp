package yku;

public class HelloWorld 
{
	private String str="heeeeelo....";
	public String sayHello()
	{
		return str;
	}

	public static void 	main(String args [])throws Exception
	{
		System.out.println("The message input is");
		
		 java.io.BufferedReader act =new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

		 System.out.println(act.readLine());

		
		HelloWorld hello = new HelloWorld();
		System.out.println(hello.sayHello());
	}
}