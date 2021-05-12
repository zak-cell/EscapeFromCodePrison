public class easyquestionsOne {
public static void main(String[] args) {
 
// Question 1 : Variables and Assingments

/* Declare 4 Variables as Double */

double a; 
double b;
double c;
double d;

 
/* Assign Values to the Variables Created Earlier */          
a = 55;
b = 12;
c = 21;
d = 10;

c = a; 
b = c;
b = d;
a = b;

System.out.println ( c % b);  
System.out.println ( a % d); 



public static void OptionOne() {
   System.out.print (c % b); =  5.0
   System.out.print (a % d); =  0.0

}

public static void OptionTwo() {
   System.out.print (c % b); =  3;
   System.out.print (a % d); =  1;
}

public static void OptionThree() {
    System.out.print (c % b); =  5.0
    System.out.print (a % d); =  1.0 
}

public static void OptionFour() {
   System.out.print (c % b); =  3
   System.out.print (a % d); =  0.0
}



// Answer :
//5.0 and 0.0 
 












}
}