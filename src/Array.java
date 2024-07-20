import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int n;
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number of array do you want to store: ");
        n=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of arr["+i+"] : ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
