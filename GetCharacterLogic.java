//10.Java String Program to Get a Character From the Given String

class GetCharacterLogic
{
java.util.Scanner sc=new java.util.Scanner(System.in);
int i;
String s;

void task()
{
System.out.println("Enter any String");
s=sc.next();
System.out.println("Enter index value");
i=sc.nextInt();

try{
s.indexOf(i);
System.out.println(s.charAt(i));
}
catch(Exception e)
{
System.out.println("out of Memory! check properly");
//System.out.println(e);
}
}

public static void main(String...args)
{
GetCharacterLogic g=new GetCharacterLogic();
g.task();
}
}