//15.Java String Program to Remove leading zeros
//mean-removing 0's at the starting of the string

class RemoveLeadingZeros
{
String str;
java.util.Scanner sc=new java.util.Scanner(System.in);

void task()
{
System.out.println("Enter any String include 0's at the starting of the String");
str=sc.next();
str=str.replaceFirst("^0+","");
System.out.println("Updated string is:"+str); 

}
public static void main(String...args)
{
RemoveLeadingZeros r=new RemoveLeadingZeros();
r.task();
}
}