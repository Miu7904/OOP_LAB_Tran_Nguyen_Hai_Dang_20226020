
import java.util.Scanner;
public class n_stars {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for( int i = 1 ; i <= n; i ++){
            for( int j = i ; j < n; j ++) System.out.print(" ");
            for( int j = 0 ; j < ((2 * (i - 1)) + 1); j ++) System.out.print("*");
            System.out.println();
        }
        input.close();
    }
}
