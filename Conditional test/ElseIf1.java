import java.util.Scanner;

public class ElseIf1 {
    public static void main(String args[]){
        double a,b;
        System.out.println("Enter the numbers:");
        Scanner obj = new Scanner(System.in);
        a=obj.nextDouble();
        b=obj.nextDouble();
        
        if(a>b){
            System.out.println("A is greater");
        }
        else if(a<b){
            System.out.println("A is lesser");
        }
        else if(a==b){
            System.out.println("A is equal to B");
        }
        else{
            System.out.println("Invalid");
        }
        
    }
}
