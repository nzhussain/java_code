import java.util.Scanner;
public class primeORnot {
    public static void main(String args[]){
        // System.out.println("Enter the yes(1) or No(0):");
        Scanner obj = new Scanner(System.in);
        // int input=obj.nextInt();
        // System.out.println("enter the numbers:");
        // int n = obj.nextInt();
                
        // for(int i=1;i<=n;i++){
        //         int num=0;
        //         if(n%i==0){  
        //             count++;    
        //         }
        //  }if(count==2){
        //     System.out.println("prime");
        // }else{
        //     System.out.println("not prime");
        // }

         int input;
        do{    

                System.out.println("Enter the yes(1) or No(0):"); 
                input=obj.nextInt();
               
               System.out.println("enter the numbers:");
               int n = obj.nextInt();
               int count=0;
               for(int i=1;i<=n;i++){
                
                if(n%i==0){  
                    count++;    
                }
         }if(count==2){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
        }while(input==1);
        

    }

    
}
