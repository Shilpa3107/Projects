import java.util.*;
public class Sort {
    
    public static int largest(int[] data, int n) {
        if (n < 1 || n > data.length) {
            throw new IllegalArgumentException("Invalid value for n");
        }
        
        for (int i = 0; i < n; i++) {
            int mi = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > data[mi]) {
                    mi = j;
                }
            }
            // Swap the largest element with the current element
            int temp = data[i];
            data[i] = data[mi];
            data[mi] = temp;
        }
        
        return data[n - 1];
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of m");
        int m = sc.nextInt();
        int a[] = new int[m];
        System.out.println("Which position's largest element you want?");
        int n = sc.nextInt();
        System.out.println("Enter array elements");
        for(int i = 0;i<m;i++){
            a[i] = sc.nextInt();
        }
        int l = largest(a, n);
        System.out.println("The "+n+"th largest number is: " +l );
    }
}
