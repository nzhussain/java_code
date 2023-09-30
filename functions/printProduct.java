import  java.util.Scanner;
public class printProduct {
    public static double calculateProduct(int a,int b,int c,float d){
        double product = a*b*c*d;
        System.out.print("product:"+product);
        return product;
    }
    public static void main(String args[]){
        Scanner Obj = new Scanner(System.in);
        int a = Obj.nextInt();
        int b = Obj.nextInt();
        int c = Obj.nextInt();
        float d = Obj.nextFloat();
       
        calculateProduct(a,b,c,(float)d);
        
    }
}
