package JAVA24;

public class throw_throws {

	public static void main(String[] args) throws ArithmeticException, InterruptedException
	{
		// TODO Auto-generated method stub
		int age= 10;
		Thread.sleep(2000);
if (age>=18)
{
	System.out.println("welcome to the google");
}

else
	throw new ArithmeticException("person is young");
	}

}
