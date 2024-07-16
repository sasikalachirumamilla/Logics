class StringMethods
{

String s1="Ramesh";
String s2="ShiftEduTech";
void task()
{
System.out.println("1."+s1.length());//length of the String
System.out.println("2."+s1.isEmpty());//returns bool value wheather the value is null or not
System.out.println("3."+s1.charAt(3));//returns the element in the string by refering index value
System.out.println("4."+s1.codePointAt(3));//returns unicode of that element
System.out.println("5."+s1.codePointBefore(3));//returns the Unicode value of the character before the specified index in a string.
System.out.println("6."+s1.codePointCount(0, 5));//returns the number of Unicode values found in a string.
System.out.println("7."+s1.offsetByCodePoints(0, 4));//returns an index in a string which is offset from another index by a specified number of code points.
System.out.println("8."+s1.equals(s2));//Checks if s1 is equal to s2
System.out.println("9."+s1.equalsIgnoreCase(s2));//Checks if s1 is equal to s2, ignoring case
System.out.println("10."+s1.compareTo(s2));//Compares s1 lexicographically to s2
System.out.println("11."+s1.compareToIgnoreCase(s2));//Compares s1 to s2, ignoring case
System.out.println("12."+s1.startsWith("R"));// Checks if s1 starts with "R"
System.out.println("12.1."+s1.startsWith("r"));//Checks if s1 starts with "r"
System.out.println("13."+s1.endsWith("R")); // Checks if s1 ends with "R"
System.out.println("13.1."+s1.endsWith("h")); // Checks if s1 ends with "h"
System.out.println("14."+s2.hashCode());// Returns the hash code of s2
System.out.println("15."+s2.indexOf(2));// Returns the index of the first occurrence of 'f' in s2
System.out.println("16."+s2.indexOf('f', 4)); // Returns the index of 'f' starting from index 4 in s2
System.out.println("17."+s2.lastIndexOf('t'));// Returns the last index of 't' in s2
System.out.println("18."+s2.lastIndexOf('t',4)); // Returns the last index of 't' before index 4 in s2
System.out.println("19."+s2.indexOf(2)); //Returns the index of the first occurrence of 2 in s2
System.out.println("20."+s2.lastIndexOf('t'));// Returns the last index of 't' in s2
System.out.println("21."+s2.substring(5));// Prints substring starting from index 5 to the end
System.out.println("22."+s2.substring(5,8));// Prints substring starting from index 5 up to, but not including, index 8
System.out.println("23."+s2.subSequence(3,4));// Prints subsequence from index 3 to index 4 (exclusive)
System.out.println("24."+s2.concat(s1));// Concatenates s1 to the end of s2
System.out.println("25."+s2.replace('S','s'));// Replaces all occurrences of 'S' with 's' in s2
System.out.println("26."+s2.matches(s1));// Checks if s2 matches the regular expression specified in s1
System.out.println("27."+s2.contains(s1));// Checks if s2 contains the substring s1
System.out.println("28."+s2.replaceFirst("Edu","Tech"));// Replaces the first occurrence of "Edu" with "Tech" in s2
System.out.println("29."+s2.replaceAll("Edu","Tech"));// Replaces all occurrences of "Edu" with "Tech" in s2
System.out.println("30."+s2.replace("Edu","Tech"));// Replaces all occurrences of "Edu" with "Tech" in s2
System.out.println("31."+s2.split("e"));// Splits s2 into an array of substrings using "e" as the delimiter
System.out.println("32."+s2.split("e",3));// Splits s2 into an array of substrings using "e" as the delimiter, maximum 3 substrings
System.out.println("33."+String.join("h", "h", s2));// Joins "h", "h", and s2 together into a single string with "h" as delimiter
System.out.println("34."+s2.toLowerCase()); // Converts s2 to lowercase
System.out.println("35."+s1.toLowerCase()); // Converts s1 to lowercase
System.out.println("36."+s2.toUpperCase()); // Converts s2 to uppercase
System.out.println("37."+s2.trim());//Removes leading and trailing whitespace from s2
System.out.println("38."+s2.toString());// Returns the string representation of s2
System.out.println("39."+s2.valueOf(true)); // Converts boolean value true to its string representation
System.out.println("40."+s2.valueOf('S'));// Converts character 'S' to its string representation
System.out.println("41."+s2.valueOf(3));// Converts integer 3 to its string representation
System.out.println("42."+s2.valueOf(10.3));// Converts double 10.3 to its string representation
System.out.println("43."+s2.intern());// Returns a canonical representation for the string s2
}
int task2()
{

char[] myArray={'0','1','2','3','4','5','6','7','8','9'};
s2.getChars(3, 7, myArray, 3);//copies characters from a string to a char array
System.out.println("44."+myArray);
return 0;

/*byte[] myArray1= s2.getBytes();
for(byte b: myArray1)
//converts a string into an array of bytes
System.out.println(b);
return 0;*/

}
public static void main(String[] args)
{
StringMethods sm=new StringMethods();
sm.task();
sm.task2();
}
}