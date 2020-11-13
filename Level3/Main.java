package Redrock4.Level3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("请输入运算的表达式:");
        Calculate calculate=new Calculate();
        calculate.calculator(Sc.nextLine());
    }
}
