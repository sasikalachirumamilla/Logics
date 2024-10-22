import java.util.Scanner;
class pallin
{
String str1,str2;
Scanner sc=new Scanner(System.in);

void task()
{
System.out.println("Enter any String");
str1=sc.next();

StringBuilder sb=new StringBuilder(str1);
sb.reverse();
str2=sb.toString();

if(str1.equals(str2))
{
System.out.println("Pallindrome");
}
else{
System.out.println("nat palindrome");
}
}
public static void main(String...args)
{
pallin p=new pallin();
p.task();
}
}