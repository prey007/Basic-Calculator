package work;
import java.util.Scanner;
public class caluclator
{
   public static void main(String[] args) {
       System.out.println("welcome to your basic calculator with operations of add,multiply,divide,subtract,sqrt,"+
               "finding remainder,power product of a number  ");

       Scanner sc= new Scanner(System.in);
       System.out.println("enter first number: ");

       float no_1= sc.nextFloat();
       System.out.println("enter operation: ");
       char op= sc.next().charAt(0);


           if (op=='√') {
               System.out.println("your result is: " + Math.sqrt(no_1));
           }
           else{
               System.out.println("enter second number: ");
               float no_2= sc.nextFloat();


           if (op == '+') {
               System.out.println("your result is: " + (no_1 + no_2));
           } else if (op == '-') {
               System.out.println("your result is: " + (no_1 - no_2));
           } else if (op == '/') {
                if( no_2!=0) {
                   System.out.println("your result is : " + (no_1 / no_2));
               }
                else{
                    System.out.println("Undetermine value ");
                }
           } else if (op == 'x') {
               System.out.println("your result is : " + (no_1 * no_2));
           } else if (op == '%') {
               System.out.println("your result is : " + (no_1 % no_2));
           } else if (op == '^') {
               System.out.println("your result is: " +Math.pow(no_1, no_2));
           }
           else {

               System.out.println("enter appropriate operator");
           }


       }

       }

    }

