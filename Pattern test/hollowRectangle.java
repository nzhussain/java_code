import java.util.Scanner;

public class hollowRectangle {
    public static void main(String args[]){
        System.out.println("Enter the numbers of row:");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        
        System.out.println("Enter the numbers of coloum:");
        int m = obj.nextInt();
         //#Outer Loop
        for(int row=1;row<=n;row++){
            //#Inner Loop
            for(int coloum=1;coloum<=m;coloum++){
                //#cells Or Bounderies of star
                if(row==1  ||row==n){
                 System.out.print("*");
                }else if(coloum==1||coloum==m){
                    System.out.print("*");
                }
                /* else if(row==2 && coloum==m){    {# not read this lines
                    System.out.print("*");               because this is happend on                                              upper line
                }else if(row==3 && coloum==m){             upper lines
                    System.out.print("*");               }
                }  */                                   
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
         /*  //#Outer Loop
        for(int i=1;i<=n;i++){
            //#Inner Loop
            for(int j=1;j<=m;j++){
                //Cells or Borders star
                if(i==1||j==1||i==n||j==m){
                    System.out.println("*");
                }else{
                    System.out.print(" ");
                } 
                System.out.println();
            }
        } */
    }
}
