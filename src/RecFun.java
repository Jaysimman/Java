public class RecFun {
    public static void main(String[] args) {
        natPrint(10);
    }
    public static void natPrint(int n){
        if (n == 1) {
            System.out.println(1);
        }else {
            System.out.println(n);
            natPrint(n - 1);
        }
    }
}
