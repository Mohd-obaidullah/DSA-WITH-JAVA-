import java.util.Scanner;
 public class small {
   public  static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num of n:");
        int n = sc.nextInt();
        for(int i = 0 ; i<=n; i++){
            for(int j = 0; j<=n; j++){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
    }
 }