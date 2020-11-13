package Redrock4.Level2;
import java.util.Scanner;
public class StudentManagementSystem{
    StudentManagementSystem(int n){
        this.n=n;
        name=new String [n];
        Sex=new String[n];
        id=new String[n];
    }
    static int n;
    static String [] subject=new String[9];
    private int [][]value;
    private String name[];
    private String Sex[];
    private String id[];
    int count=0;
    public void InitSystem(){
        System.out.println("\n"+"请输入学科：");
        Scanner Sc=new Scanner(System.in);
        for (int i=0;;i++){
            if (i== subject.length){
                String x[]=new String[subject.length];
                System.arraycopy(subject,0,x,0,x.length);
                subject=new String[x.length+1];
                System.arraycopy(x,0,subject,0,x.length);
            }
            subject[i]=Sc.next();
            if (subject[i].equals("1")) {
                count=i;
                break;
            }
        }
    }
    public void GetField(){
        for (int i=0;i<n;i++) {
            value= new int[n][count];
            Scanner Sc = new Scanner(System.in);
            System.out.println("请输入学生的姓名：");
            name [i]= Sc.next();
            System.out.println("请输入" + name[i] + "的学号：");
            id[i] = Sc.next();
            System.out.println("请输入" + name[i] + "的性别：");
            Sex[i] = Sc.next();
            for (int j = 0; j < count; j++) {
                System.out.println("请输入学生的第" + (j + 1) + "个学科" + subject[j] + "的得分：");
                value[i][j] = Sc.nextInt();
            }
        }
    }
    public void Print(){
        int x[];double y[];
        for (int j=0;j<n;j++) {
            System.out.println("姓名:" + name[j] + "\t学号:" + id[j] + "\n性别:" + Sex[j]);
            System.out.print("学科：");
            for (int i = 0; i < count; i++) System.out.print(subject[i] + "\t");
            System.out.println();
            System.out.print("得分：");
            for (int i = 0; i < count; i++) System.out.print(value[j][i] + "\t");
        }
        x=Findmax();
        System.out.println("最高分依次是：");
        for (int i=0;i<count;i++){
            System.out.println(subject[i]+":"+x[i]);
        }
        y=Calcu();
        System.out.println("平均分依次是：");
        for (int i=0;i<count;i++){
            System.out.println(subject[i]+":"+y[i]);
        }
    }
    public int[] Findmax(){
        int [] p=new int [count];
        int max=0;
        for (int i=0;i<count;i++){
                for (int j=0;j<n;j++){
                    max=value[0][i];
                    if (value[j][i]>max) max=value[j][i];
                }
             p[i]=max;
        }
        return p;
    }
    public double[] Calcu(){
        double sum=0;
        double []x=new double [count];
        for (int i=0;i<count;i++){
            for (int j=0;j<n;j++){
                sum=0;
                sum+=value[j][i];
            }
            x[i]=sum/=(double)count;
        }
        return x;
    }
}