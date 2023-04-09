import java.util.Scanner;
import java.lang.Math;

public class Egg_dropping_puzzle{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //calculating number of eggs
        int f = sc.nextInt();//calculating number of floors

       int d = binary(n,f);
       System.out.println(" The highest floor is "+d+" and it took "+Math.ceil(Math.log(f))+" drops");

      
       
    }
    public static boolean eggs(int n , int floor){
         
        return (n <= floor) ;
    }
    public static int binary(int n , int k){
      // binary search
      int drop = 0;
      int start = 0;
      int end = 1;
      while(start <= end){
         int mid = start+ (end-start)/2;
         if(eggs(n,mid))
           end = mid-1;
           else 
           start = mid+1;
           drop++;
      }
      return drop;
      }
}
