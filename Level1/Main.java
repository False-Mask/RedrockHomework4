package Redrock4.Level1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Couple couple=new Couple();
        System.out.print("请输入需要累加的个数：");
        Scanner Sc=new Scanner(System.in);
        System.out.println("计算结果为："+couple.count(Sc.nextInt())+"\n");
        System.out.println("请依次输入斐波那契数列的 首项，第二项，要求的项数 如1 2 8");
        System.out.println("输出结果为："+couple.fb(Sc.nextInt(), Sc.nextInt(), Sc.nextInt()));
    }
}
