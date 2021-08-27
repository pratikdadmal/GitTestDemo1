package JunitTest;

public class App {
	
	public String show()
	{
		System.out.println("This is First Simple Junit Test");
		return "message";
	}
	
	public int add(int a, int b)
	{
		int c = a+b;
		return c;
	}
	
	public String doGet(String user, String pass)
	{
		String username = user;
		String password = pass;
		System.out.println(username+" "+password);
		if(username.equals("pratik"))
		{
			System.out.println("Login Done");
			
		}
		else if(username!="pratik")
		{
			System.out.println("Login Failed");
			
		}
		return username;
	}
	
}
