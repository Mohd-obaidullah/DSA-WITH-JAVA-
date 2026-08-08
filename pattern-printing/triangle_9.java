import java.util.Scanner;

public class triangle_9 {
   public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int a = 1;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }

    }
}
