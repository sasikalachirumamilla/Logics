class StringToken
{

java.util.StringTokenizer s=new java.util.StringTokenizer("This is the StringTokenizer Methods");
java.util.StringTokenizer t=new java.util.StringTokenizer("Java");

void task()
{
while(s.hasMoreTokens())
{
System.out.println("1."+s.nextToken());
}

while(t.hasMoreTokens())
{
System.out.println("2."+t.nextToken());
}

/*
while(s.hasMoreElements())
{

System.out.println((String) s.nextElement());
}*/

System.out.println("3."+s.hasMoreElements());//return true or false
System.out.println("3.1."+t.hasMoreElements());//return true or false

System.out.println("4."+s.countTokens());
System.out.println("4.1."+t.countTokens());
}
public static void main(String[] args)
{
StringToken sk=new StringToken();
sk.task();
}
}