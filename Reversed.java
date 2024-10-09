import java.util.Scanner;
class Reversed
{
String s;
Scanner sc=new Scanner(System.in);

void task()
{
System.out.println("Enter any String");
s=sc.next();
StringBuilder sb=new StringBuilder(s);
sb.reverse();
System.out.println(sb.toString());

}
public static void main(String...args)
{
Reversed r=new Reversed();
r.task();

}

}