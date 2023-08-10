import java.util.Scanner;
public class Even {
    public static void main(String arg[]){
        System.out.println("Enter the number:");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        
        // int count=0;
        // for(int i=0;i<=n;i++){
        //     if(i%2==0){
        //             System.out.println(i);
        //         count++;
        //     }
        // }System.out.println("total count of even:"+count);

        int i=0;
        while(i<=n){
            if(i%2==0){
                System.out.println(i);
                // i++; <<--this do freeze the loop bcs while condition remains always true 
            } i++;  
        }

    }
        
    
}
