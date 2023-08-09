import java.util.Scanner;

public class whileLoop {
    public static void main(String args[]){
        System.out.println("Enter the number:");
        Scanner obj=new Scanner(System.in);
        double n = obj.nextDouble();
        
        int i=1;
        while(i<=10){
            System.out.println(n*i);
            i++;
        }

    }
}
