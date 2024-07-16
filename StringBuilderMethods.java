public class StringBuilderMethods
{

String s1="Ramesh";
String s2="Rao";
int i=12345;
double j=10.0;
StringBuilder sb1;
StringBuilder sb2;


public StringBuilderMethods()
{
sb1=new StringBuilder(s1);
sb2=new StringBuilder(s2);
}

void task()
{
System.out.println("1."+sb1.append(sb2));
System.out.println("2."+sb2.append("Ramesh"));
System.out.println("3."+sb1.append('h'));
System.out.println("4."+sb2.append(true));
System.out.println("5."+sb2.append(i));

System.out.println("6."+sb1.delete(1, 2));
System.out.println("7."+sb1.deleteCharAt(0));

System.out.println("8."+sb1.replace(0, 3, "Rao"));

System.out.println("9."+sb1.insert(2, sb2));
System.out.println("10."+sb1.insert(0,'r'));
System.out.println("11."+sb1.insert(1, "Hai"));
System.out.println("12."+sb1.insert(1, i));

System.out.println("13."+sb1.reverse());
System.out.println("14."+sb1.repeat(1,2));
System.out.println("15."+sb1.toString());

//System.out.println("16."+sb1.insert(i,j));
System.out.println("17."+sb1.insert(4,'r'));
}


public static void main(String[]args)
{
StringBuilderMethods sb=new StringBuilderMethods();
sb.task();
}
}