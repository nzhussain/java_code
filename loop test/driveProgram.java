import java.util.Scanner;
public class driveProgram{
      public static void main(String args[]){
          System.out.println("Enter the 1st number:");
          Scanner obj= new Scanner(System.in);
        //   int input=obj.nextInt();
         System.out.println("Enter the marks:");
        //  int mark=obj.nextInt();
        
            
          
        
        //     switch(input){
        //         case 0:System.out.println("enter the 0 and 1:");
        //            input = obj.nextInt();
        //     case 1: 
        //           if(mark>=90){
        //             System.out.println("this is good"); 
        //           }
        //           else if(89>=mark&&mark>= 60){
        //             System.out.println("This is also Good");
        //           }else if((59 >= mark)&&(mark >= 0)){
        //              System.out.println("This is Good as well");
        //           }else{
        //             System.out.println(" ");
        //           }
        //     break;
            
        //   }
        
          
            // case 0: System.out.println("Stop & "+"Invalid");
            // break;
             
        int input;
        do{  
             System.out.println("Enter yes(1) for continiue & no(0) for stop:");
             input=obj.nextInt(); //1
            int mark=obj.nextInt(); //60
            if(mark>=90){
                     System.out.println("this is good"); 
            }else if(89>=mark&&mark>= 60){
                    System.out.println("This is also Good");
               }else if((59 >= mark)&&(mark >= 0)){
                      System.out.println("This is Good as well");
                 } 
                   else{
                    System.out.println("stop");
                   }
        }while(input==1);
        
      }
}
