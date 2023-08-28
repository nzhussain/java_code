import java.util.Scanner;
public class Palindromic_py {
    public static void main(String args[]){
        Scanner Obj = new Scanner(System.in);
        System.out.println("Enter the Input(n):");
        int n = Obj.nextInt();
        /* <<<---Palindromic Pyramid--->>> */
        //Outer Loop
        for(int r=1;r<=n;r++){
            //Inner Loop for space
           for(int s=1;s<=(n-r);s++){
            System.out.print(" ");
           }
           //Inner Loop for descending order
           for(int c=r;c>=1;c--){
            System.out.print(c);
           }
           //Inner Loop for ascending order
           for(int d=2;d<=r;d++){
            System.out.print(d);
           }
           System.out.println();
        }

    }   
}
