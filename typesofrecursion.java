//ACTIVITY 1
import java.util.Scanner;
public class typesofrecursion{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an integer n: ");
        int n=sc.nextInt();
        System.out.println("enter the power: ");
        int p=sc.nextInt();
        int result=exponent(n, p);
        System.out.println("final result: "+result);
    }
    public static int exponent(int n, int p){
        if(p==0){
            return 1;
        }
        int pow2=exponent(n, p/2);
        int pow=pow2*pow2;
        if(p%2==1){
            pow=pow*n;
        }
        return pow;
    }
}