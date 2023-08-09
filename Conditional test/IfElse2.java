import java.util.Scanner;

    public class IfElse2{

    public static void main(String[] args) {
        int a;
        System.out.println("Enter the number:");
        Scanner obj = new Scanner(System.in);
        a=obj.nextInt();

        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
