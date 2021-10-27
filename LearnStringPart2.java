package week2.day2;

public class LearnStringPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str ="Happy Independence Day";
//use substring operator for getting desired string from whole
String substring = str.substring(6);
System.out.println("the substring is " +substring);
String substring2 = str.substring(0, 5);               //first index inclusive
System.out.println("substring is " +substring2);              //last index exclusive
 //replace operator for replacing char in a given string

String replace = str.replace('p', 'P');
System.out.println("the replaced string is : " +replace);


//replace integers and non integers

String strng ="testleaf14565";
String replaceNonInt = strng.replaceAll("\\D", "");    // use \\D to eliminate letters
System.out.println(replaceNonInt);

String replaceInt = strng.replaceAll("\\d", "");
System.out.println(replaceInt);                           //RegEx is regular expression

 int parseInt = Integer.parseInt(replaceNonInt);
 int c= 10 + parseInt;
 System.out.println(c);
 
	}

}

