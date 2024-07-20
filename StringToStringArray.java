//11.Java String Program to Convert String to String Array

class StringToStringArray
{
java.util.Scanner sc=new java.util.Scanner(System.in);
String str;

void task()
{
System.out.println("Enter any String");
str=sc.nextLine();
String[] a=str.split(" ");
for(String a1:a)
{
System.out.println(a1);
}
}

public static void main(String...args)
{
StringToStringArray ss=new StringToStringArray();
ss.task();
}
}