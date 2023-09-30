import java.util.Scanner;
public class printNum {
    public static int printNumberSum(int a,int b,int c){
        int sum = a+b+c;
        System.out.print("Sum:"+sum);
        return sum;
    }
    public static void main(String args[]){
        Scanner Obj = new Scanner(System.in);
        int a = Obj.nextInt();
        int b = Obj.nextInt();
        int c = Obj.nextInt();
        printNumberSum(a, b,c);
    }
    
}
