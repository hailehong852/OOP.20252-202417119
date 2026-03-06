package array;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter n: ");
       int n = sc.nextInt();
       int[] num = new int[n];
       int sum = 0;
       System.out.println("Enter elements:");
       for (int i = 0; i<n; i++){
            num[i] = sc.nextInt();
            sum += num[i];
       }
       for (int i = 0; i<n-1; i++){
           for (int j = 1; j<n-i-1; j++){
               if (num[j] > num[j+1]){
                   int a = num[j];
                   num[j] = num[j+1];
                   num[j+1] = a;
               }
           }
       }
       for (int i = 0; i<n ; i++){
           System.out.print(num[i] + " ");
       }
       System.out.println();
       System.out.println("Sum: " + sum);
       System.out.println("Average: " + (double)sum/n);
       sc.close();
    }
}
