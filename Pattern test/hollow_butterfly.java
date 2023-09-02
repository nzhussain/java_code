import java.util.Scanner;
public class hollow_butterfly {
    public static void main(String args[]){
        Scanner Obj = new Scanner(System.in);
        System.out.print("Enter the Input(n):");
        int n = Obj.nextInt();
        /* <<<---hollow_butterfly--->>> */
        //Outer Loop for Upper rows
        for(int r=1;r<=n;r++){
            //Inner Loop for left stars
            for(int c=1;c<=r;c++){
                if(c==1||c==r){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //Inner loop for space
            for(int s=1;s<=((2*n)-(2*r));s++){
                System.out.print(" ");
            }
            //Inner Loop for Right stars
            for(int c2=1;c2<=r;c2++){
                if(c2==1||c2==r){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(); //Line breaks
        }
        //Outer Loop for Down left rows
        for(int r=n;r>=1;r--){
            //Inner Loop for Down left stars
            for(int c=1;c<=r;c++){
                if(c==1||c==r){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }   
            //Inner Loop for Down space
            for(int s=1;s<=((2*n)-(2*r));s++){
                System.out.print(" ");
            }
            //Inner Loop for Down Right stars
            for(int c2=1;c2<=r;c2++){
                if(c2==1||c2==r){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();//lines breaks
        }
    }
}
