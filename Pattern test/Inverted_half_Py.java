import java.util.Scanner;
public class Inverted_half_Py {
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the input(n):");
        int n = obj.nextInt();
        /* <<<---Inverted_half_Pyramid--->>> */
        //Outer Loop(row)
        for(int r=n;r>=1;r--){
            //Inner Loop(coloum)
            for(int c=1;c<=r;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
