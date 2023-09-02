import java.util.Scanner;
public class hollow_Rhombus {
    public static void main(String args[]){
        Scanner Obj = new Scanner(System.in);
        System.out.print("Enter the Input(n):");
        int n = Obj.nextInt();
        for(int r=1;r<=n;r++){
            for(int s=1;s<=(n-r);s++){
                System.out.print(" ");
            }
            for(int c=1;c<=n;c++){
                if(c==1||c==n){
                    System.out.print("*");
                }else if(r==1||r==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
