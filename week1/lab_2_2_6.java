
import java.util.Scanner;

public class lab_2_2_6 {
    public static void main(String[] args){
        lab_2_2_6 s = new lab_2_2_6();
        s.linear_equa();
        s.sys_linear_equa();
        s.second_degree_equa();
    }
    Scanner input  = new Scanner(System.in);
    public void linear_equa(){
        System.out.print("Input a: ");
        double a = input.nextDouble();
        System.out.print("Input b: ");
        double b = input.nextDouble();
        if(a == 0){
            if(b == 0) System.out.println("Infinite solution");
            else System.out.println("No solution");
        }
        System.out.println("Solution x = "+ ( - b / a) );
    }
    public void sys_linear_equa(){
        System.out.print("Input a1, bf, re:");
        double af = input.nextDouble();
        double bf = input.nextDouble();
        double re = input.nextDouble();
        System.out.print("Input aff, bff, ref:");
        double aff = input.nextDouble();
        double bff = input.nextDouble();
        double ref = input.nextDouble();
        double d = (af * bff) - (aff * bf);
        double dx = (re * bff) - (ref * bf);
        double dy = (af * ref) - (aff * re);
        if( (d == 0) && ( dx == 0 ) && ( dy == dx) ) System.out.println("Infinitely solution");
        else if( (d == 0) && (( dx != 0 ) || ( dy != 0)) ) System.out.println("No solution");
        else{
        System.out.println("x1 = " + (dx / d));
        System.out.println("x2 = " + (dy / d));
        }
    }
    public void second_degree_equa(){
        System.out.println("input a,b,c : ");
        double a;
        do{ 
        a = input.nextDouble();
        }while( a == 0); 
        double b = input.nextDouble();
        double c = input.nextDouble();
        double delta  = (b * b) - ( 4 * a * c);
        if( delta == 0) System.out.println("Solution x :" + (- b / (2 * a)));
        else if( delta > 0){
             System.out.println("Solution x1: " + ((- b + Math.sqrt(delta)) / (2 * a)));
             System.out.println("Solution x2: " + ((- b - Math.sqrt(delta)) / (2 * a)));
        }
        else System.out.println("No solution");
    }
}

