import java.util.Scanner;
public class Rotate_half_Py{
    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the input(n):");
        int n = obj.nextInt();
        /* <<<---180-Rotate_half_Pyramid--->>> */
        //Outer Loop(row)
        for(int r=1;r<=n;r++){
            //Inner Loop for Space
           for(int s=1;s<=(n-r);s++){
            System.out.print(" ");
           }
           //Inner Loop for star
           for(int c=1;c<=r;c++){
            System.out.print("*");
           }
           System.out.println();
        }
    }
}
