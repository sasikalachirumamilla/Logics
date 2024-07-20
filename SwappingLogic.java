//12.Java String Program to Swapping Pair of Characters

//import java.util.Arrays;
class SwappingLogic
{
java.util.Scanner sc=new java.util.Scanner(System.in);
String str;

void task()
{
System.out.println("Enter any String");
str=sc.nextLine();
str = str.replace(" ", "");
char[] a=str.toCharArray();

for(int i=0;i<=a.length-1;i+=2)
{
char temp = a[i];
a[i] = a[i + 1];
a[i + 1] = temp;
}
String newString = new String(a);
System.out.println(newString);
}

public static void main(String...args)
{
SwappingLogic sl=new SwappingLogic();
sl.task();
}
}