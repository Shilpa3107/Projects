import java.util.*;
public class pattern1 {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter value of n");
       int n = sc.nextInt();
       int a[][] = new int[n][n];
       int num = 11;
       for(int i =0;i<n;i++){
        a[0][i] = num;
         num++;
       }
       
       for(int i = 1;i<n;i++){
        for(int j = 0;j<n;j++){
          a[i][j] = a[i-1][(j+1)%n];
        }
       }
       for(int i =0;i<n;i++){
        for(int j = 0;j<n;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
       }
    
    }
}
