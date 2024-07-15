class EvenLengthWord
{
String sentence;
java.util.Scanner sc=new java.util.Scanner(System.in);


void task()
{
System.out.println("Enter any Sentence");
sentence=sc.nextLine();

String[] words=sentence.split("\\s+");
boolean FoundEvenWord=true;
for (String word:words)
{
if ((word.length())%2==0)
{
System.out.println("Even length String is "+word);

}
}
if (FoundEvenWord=false)
System.out.println("There is no Even length type of Strings");
}

public static void main(String[] args)
{
EvenLengthWord elw=new EvenLengthWord();
elw.task();
}
}