package JAVA24;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input= "Apurva";
String reverse ="";
for (int i = input.length()-1;i>=0;i--)
{
	char op=input.charAt(i);
	reverse=reverse+op;
	
}
     System.out.println(reverse);
	}

}
