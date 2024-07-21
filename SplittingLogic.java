//13.Java String Program to Splitting into a number of sub-strings

class SplittingLogic
{
java.util.Scanner sc=new java.util.Scanner(System.in);
String str;

void task()
{
System.out.println("Enter a String");
str=sc.nextLine();
String[] a = str.split(" "); 
for(String substr:a)
{
System.out.println(substr);
}

}
public static void main(String...args)
{
SplittingLogic sl=new SplittingLogic();
sl.task();
}
}