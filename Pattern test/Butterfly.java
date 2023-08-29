import java.util.Scanner;
public class Butterfly {
    public static void main(String args[]){
        Scanner Obj = new Scanner(System.in);
        System.out.print("Enter the Input(n):");
        int n = Obj.nextInt();
        /* <<<---Butterfly Pattern--->>> */
        //Outer Loop or row Up
        for(int r=1;r<=n;r++){
            //Inner Loop for #Up left star
            for(int c=1;c<=r;c++){
                System.out.print("*");
            }
            //Inner Loop for #Up space
            for(int s=1;s<=(2*n-2*r);s++){
                System.out.print(" ");
            }
            //Inner Loop for #Up right stars
            for(int d=1;d<=r;d++){
                System.out.print("*");
            }
            System.out.println(); //line break
        }
        //Outer Loop for row down 
        for(int r=n;r>=1;r--){
            //Inner Loop for #Down left stars
            for(int c2=1;c2<=r;c2++){
                System.out.print("*");
            }
            //Inner Loop for #Down space
            for(int s2=1;s2<=(2*n-2*r);s2++){
                System.out.print(" ");
            }
            //Inner Loop for #Down right stars
            for(int d2=1;d2<=r;d2++){
                System.out.print("*");
            }
            
            System.out.println(); //break the line
        }
    }
}
