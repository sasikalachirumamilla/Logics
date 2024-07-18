//2.Java String Program to Insert a string into another string

class InsertLogic
{
StringBuilder sb1=new StringBuilder("Ramesh");
StringBuilder sb2=new StringBuilder("Rao");

void task()
{
sb1.insert(2,sb2);
System.out.println(sb1);
}

public static void main(String[]args)
{
InsertLogic i=new InsertLogic();
i.task();
}
}