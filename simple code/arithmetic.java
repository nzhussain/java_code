//<<<--Arithmetic Calculation-->>>

import java.util.Scanner;
public class arithmetic {
    public static void main(String args[]){
        
        Scanner obj = new Scanner(System.in);
        System.out.print("enter value of a : ");
        double a=obj.nextDouble();
        System.out.print("enter value of b : ");
        double b=obj.nextDouble();
         
        System.out.println("Addition = "+(a+b));
        System.out.println("Subtraction = "+(a-b));
        System.out.println("Multiplication = "+(a*b));
        System.out.println("Divition = "+(a/b));
        System.out.println("Modulation = "+(a%b));
        

    }
}
