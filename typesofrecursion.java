// //ACTIVITY 1
// import java.util.Scanner;
// public class typesofrecursion{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter an integer n: ");
//         int n=sc.nextInt();
//         System.out.println("enter the power: ");
//         int p=sc.nextInt();
//         int result=exponent(n, p);
//         System.out.println("final result: "+result);
//     }
//     public static int exponent(int n, int p){
//         if(p==0){
//             return 1;
//         }
//         int pow2=exponent(n, p/2);
//         int pow=pow2*pow2;
//         if(p%2==1){
//             pow=pow*n;
//         }
//         return pow;
//     }
// }

//ACTIVITY 2
import java.util.Scanner;
public class typesofrecursion{
    //initialize variables for fibbonacci series
    static int n1=0;
    static int n2=1;
    static int n3=0;
    //make series
    static void fibbonacci(int count){
        if((count-2)>0){
            //set n3 equal to the sum of the 2 previous terms
            n3=n1+n2;
            //update the terms
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
            fibbonacci(count-1);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("how many elements of the fibbonacci series would you like to print: ");
        int count=sc.nextInt();
        System.out.print("0 1");
        fibbonacci(count);
    }
}