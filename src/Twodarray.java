import java.util.Scanner;

public class Twodarray {
    public static void main(String[] args) {
        int n,m;
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number of row do you want to store: ");
        n=sc.nextInt();
        System.out.print("Enter the number of column do you want to store: ");
        m= sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Enter the value of arr[" + i + "] and arr["+j+"] : ");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
//                System.out.printf("%d,%d",i,j);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
