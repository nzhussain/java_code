import java.util.Scanner;
public class Num_half_Pyramid {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the input(n):");
        int n = obj.nextInt();
        /* <<<---Numeric half_Pyramid--->>>> */
        //Outer Loop(row)
        for(int r=1;r<=n;r++){
            //Inner Loop(coloum)
            for(int c=1;c<=r;c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
