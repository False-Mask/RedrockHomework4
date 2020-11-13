package Redrock4.Level3;

import static java.lang.Math.pow;

public class Calculate {
    public double calculator(String x){
        int x1=0,x3=0;char x2 = 0;
        double result = 0;
        String []y=x.split("\\s+");
        if (y.length==3  &&  y[1].length()==1){
            try{
                x1=Integer.valueOf(y[0]);
                x2=y[1].charAt(0);
                x3=Integer.valueOf(y[2]);
            }catch (NumberFormatException e){
                System.out.println("你™怎么输入的，我不干了");
                return 0;
            }
        }
        switch (x2){
            case '+' : result= Addition(x1,x3); break;
            case '-' : result= Subtraction(x1,x3); break;
            case '*' : result= Multication(x1,x3); break;
            case '/' : result= Divison(x1,x3); break;
            case '^' : result= Pow(x1,x3);break;
            default: break;
        }
        System.out.printf("结果为%.2f",result);
        return 0;
    }
    public double Addition(double x,double y){
        return x+y;
    }
    public double Subtraction(double x,double y){
        return x-y;
    }
    public double Multication(double x,double y){
        return x*y;
    }
    public double Divison(double x,double y){
        return  x/y;
    }
    public double Pow(double x,double y){
        return pow(x,y);
    }
}
