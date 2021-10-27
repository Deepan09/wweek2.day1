package week2.day2;

public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Welcome";   //string created using declare. memory is same as it is same value
String s2="Welcome";
String s3=new String();  //string created using class new keyword. memory new even same value
s3="Welcome";


// == operator compares memory
//equals() operator compares content
 if (s1==s2) {
	System.out.println("memory is same");
}
if (s2==s3) {
	System.out.println("memory is same");
} else {
System.out.println("memory is different");
}  
if (s1.equals(s3)) {
	System.out.println("same");
}	

	}
}
