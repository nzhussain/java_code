 // <<--Relational Operator;
import java.util.Scanner;

public class relationalOp {
    public static void main(String args[]){
        System.out.println("enter the numbers :");
        Scanner obj= new Scanner (System.in);

        float a= obj.nextFloat();
        float b= obj.nextFloat();
       
        System.out.println("true/false :"+(a<b));
        System.out.println("true/false :"+(a>b));
        System.out.println("true/false :"+(a<=b));
        System.out.println("true/false :"+(a>=b));
        System.out.println("true/false :"+(a==b));
        System.out.println("true/false :"+(a!=b));
        // System.out.println("true/false :"+(a=b)); <<-- (=) this operator give the assign the value;
    }
    
}
