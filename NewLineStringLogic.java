//6..Java String Program to Print a New Line in String

class NewLineStringLogic
{
java.util.Scanner s= new java.util.Scanner(System.in);
String str;

void task()
{
System.out.println("Enter any String");
str=s.next();
for (int i = 0; i < str.length(); i++) 
{
System.out.println(str.charAt(i));
}
}
public static void main(String...args)
{
NewLineStringLogic n=new NewLineStringLogic();
n.task();
}
}