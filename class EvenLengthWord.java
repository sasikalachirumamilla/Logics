class EvenLengthWord
{
String s;
java.util.Scanner sc=new java.util.Scanner(System.in);


void task()
{
System.out.println("Enter any Sentence");
s=sc.next();
if (s%2==0)
System.out.println("Even length Strings are "+s)
else
System.out.println("There is no even length type Strings");

}


public static void main(String[] args)
{
EvenLengthWord elw=new EvenLengthWord();
elw.task();
}
}