package day09loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
String s="baba";
String r="";
for(int i=s.length()-1; i>0;i--) {
	r=s+r;
}
if (s.equals(r)) {
	System.out.println(s +" is a Palindrome");
}
else {
	System.out.println(s +" is not a Palindrome");
}


}}
