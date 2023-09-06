import java.util.Scanner;
public class numHalf_Pyramid {
    public static void main(String args[]){
        Scanner Obj = new Scanner(System.in);
        System.out.print("Enter the Input(n):");
        int n = Obj.nextInt();
        /* <<<---Numberic Half Pyramid--->>> */
        //Outer Loop for rows
        for(int r=1;r<=n;r++){
            //Inner Loop for numbers
            for(int c=1;c<=r;c++){
                System.out.print(c);
            }
            System.out.println(); //line break
        }
    }
}
