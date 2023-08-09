    //    <<<---Implicit TypeCasting --->>>
public class typeCasting {
     public static void main(String args[]){
        int a = 20; // 4byte
        double b = a; // 8byte
        System.out.println(b);
        
        short x=10; //2byte
        int y=a;  //4byte
        System.out.println(y);

        byte s=5; //1byte
        short p=s; //2byte
        System.out.println(p);

        long k=2;
        char m=k;
        System.out.println(m);
        
        // <<<--Explicit typeCasting -->>>
        
        // double a=15.4; //8byte
        // int b=(int)a; //4byte
        // System.out.println(b);
        
        // int x=5;
        // short y=(short)x;
        // System.out.println(y);

     }
}
