package Redrock4.Level2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("请输入学生人数");
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        StudentManagementSystem s=new StudentManagementSystem(n);
        s.InitSystem();
        s.GetField();
        s.Print();
    }
}
