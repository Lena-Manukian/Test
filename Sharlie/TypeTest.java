import java.math.*;
import java.util.*;

public class TypeTest {

	public static  void main(String[] args) {
		
		float f = 2f;//(float) Math.pow(2, 31);

//float
System.out.println(f-1.1+1);       //1.9
System.out.println(f-1.1);         //0.8999999999999999

//identifier
System.out.println(Character.isJavaIdentifierPart('@')); //false

f= 15/2f; 

System.out.println(f%2); //return mistaken value
//sin(PI) = 0
double d = StrictMath.sin(StrictMath.PI);
System.out.print("sin(PI) ~= 0:  ");
System.out.println(d); 

int n = 1234567896;
float f2 = n; 
System.out.println(f2);// lose precision:  1.23456794E9


//convert

int n3=(int)Math.round(11323.45);//round returns long,because of it's need to use cast
float f3 = 1234.12f;
double d3 = 17895.089;
long l3 = 134345675;

//will be converted into float
System.out.print("will be converted into float: ");
System.out.println(n3 + f3);
///will be converted into double
System.out.print("will be converted into double: ");
System.out.println(d3 + f3);
//will be converted into long
System.out.print("will be converted into double: ");
System.out.println(d3 + l3);
System.out.print("will be converted into float: ");
System.out.println(f3 + l3);

//System.out.println("Java\u2122");


String s4 = "hello", s3 = "hello";

//if s3 is from other file (for example) then s3 != s4
System.out.println(s3 == s4); //true, 
System.out.println(s3 =="hello"); //true,
System.out.println("Hello".equalsIgnoreCase("hello"));

System.out.println( s3.codePointCount(0, s3.length()));

System.out.println( "A".codePointAt(0));// 65


	}

}
