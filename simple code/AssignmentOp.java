                     /*<<<-----Assignment Operator------>>>*/
import java.util.Scanner;
public class AssignmentOp {
    public static void main(String args[]){
        System.out.println("Enter the numbers :");
        Scanner obj = new Scanner(System.in);
        
        int a = obj.nextInt(); //5
        int b = obj.nextInt(); //9
              // <<<--- Assignment operator is = and == :--->>>
        System.out.println(a=a); //means a=5 , a!=9
        System.out.println(a==b); // false-->means a!=b 

        System.out.println(a=b); //means a=5 & a=9 
        System.out.println(a==b); // true-->means a=b 
            /* <<<---Coumpound Assingment operator is += operator is used to add a value to a variable; */ 
        int c=5;
        c+=19;
        System.out.println(c);
         
        double d=10.4;
        System.out.println(d);
              d+=0.2;
        System.out.println(d);
        
        /* <<<---Coumpound Assingment operator is -= operator is used to subtract the value to a variable; */ 
         int e=15;
        System.out.println(e);
        e-=8;
        System.out.println(e);

        double k=4.2;
         System.out.println(k);
        k-=(float)3;
        System.out.println(k);

    }
}
