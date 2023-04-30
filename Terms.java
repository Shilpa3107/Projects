import java.util.*;
public class Terms{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter value of n");
int n = sc.nextInt();
int a[] = new int[n];
for(int i = 0;i<n;i++){
a[i] = sc.nextInt();
}
int sum = 0;
for(int i = 0;i<n;i++){
sum= sum+a[i];
}
double avg = 0.0;
avg = sum/n;
System.out.println("Sum of terms = "+sum);
System.out.println("Average of terms = "+avg);
}
}