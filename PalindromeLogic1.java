//3..Java String program to check whether a string is a Palindrome

class PalindromeLogic1
{
java.util.Scanner sc=new java.util.Scanner(System.in);
String n;

void task()
{
System.out.println("Enter any number/String");
n=sc.next();
java.lang.StringBuilder sb=new java.lang.StringBuilder(n);

sb.reverse();
String rev=sb.toString();

if(n.equals(rev))
{
System.out.println("It is a pallindrome");
}
else
{
System.out.println("It is not a pallindrome");
}
}//method closing

public static void main(String[]args)
{
PalindromeLogic1 p=new PalindromeLogic1();
p.task();


}
}
