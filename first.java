import java.util.Scanner;
public class first {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = in.nextInt();
        System.out.println("Input b: ");
        int b = in.nextInt();
        System.out.println("Input m: ");
        int m = in.nextInt();
        System.out.println("Input n: ");
        int n = in.nextInt();
        float res = 0;
        int c = 2;
        if ((a <= 2 && n >= 2) || a > n || b > m){
            System.out.println("Your numbers are not suitable for the formula");
        }
        else{
            for (int i = a; i <= n; i++) {
                for (int j = b; j <= m; j++) {
                    res += (float)(i - j) / (i - c);
                }
            }
            System.out.println("Your result = " +res);
        }
        in.close();

    }
}
