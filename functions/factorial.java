import java.util.Scanner;
public class factorial {
    public static void calculateFactorial(int n){
        int factorial = 1;
        if(n<0){
            System.out.println("invalid");
           return ;
        }for(int i=n;i>=1;i--){
          factorial = factorial*i;
          //System.out.print("factorial:"+factorial);
        }
        System.out.print("factorial:"+factorial);
        return;
    }
    public static void main(String args[]){
        Scanner Obj = new Scanner(System.in);
        int n = Obj.nextInt();
        calculateFactorial(n);
    }
}
