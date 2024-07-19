//5..Java String Program to Reverse a String
//reverse() is comes under StrinBuilder then create an object reference
//step 1--enter a  string
//step 2--using reverse() method , reverse the string
//step 3--print reversed string

class StringReverseLogic
{
java.util.Scanner sc=new java.util.Scanner(System.in);
String st;


void task()
{
System.out.println("Enter any String");
st=sc.next();
StringBuilder sb=new StringBuilder(st);
sb.reverse();
System.out.println(sb);
}

void task1()
{
System.out.println("Enter any String");
st=sc.next();
for (int i=st.length()-1;i>=0;i--)
{
System.out.print(st.charAt(i));
}
}

public static void main(String...args)
{
StringReverseLogic s=new StringReverseLogic();
s.task1();
}
}