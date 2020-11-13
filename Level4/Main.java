package Redrock4.Level4;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) throws IllegalAccessException {
        Scanner Sc = new Scanner(System.in);Class girlfriend = null;GirlFriend Girl = null;Object ChangeValue = null;
        try {
            girlfriend = Class.forName("Redrock4.Level4.GirlFriend");
            Girl = (GirlFriend) girlfriend.newInstance();//对象到手 /狗头保命
        } catch (ClassNotFoundException e) {
        } catch (IllegalAccessException e) {
        } catch (InstantiationException e) {
        }
        Method[] methods = girlfriend.getDeclaredMethods();
        Field[] fields = girlfriend.getDeclaredFields();
        System.out.println("恭喜您抢到一个" + Girl.getClass());
        System.out.println("以下为你女朋友”参数“：");
        for (Field field : fields) {
            try {
                field.setAccessible(true);
                System.out.println(field.getType()+":   "+field.getName() + "=" + field.get(Girl));
            } catch (IllegalAccessException e) {
            }
        }
        System.out.println();
        for (; ; ) {//要求用户自己输入所需属性的名称 系统循环修改并要求再次输入
            System.out.print("请输入您要修该的属性名:(输入-1选择退出)");
            String change = Sc.next();
            for (Field field : fields) {
                if (change.equals(field.getName())) {
                    System.out.println("请问您先把他改成什么呢？");
                    if (field.getType().toString().equals("class java.lang.String")) {
                        ChangeValue = Sc.next();
                    }
                    if (field.getType().toString().equals("int")) {
                        ChangeValue = Sc.nextInt();
                    }
                    if (field.getType().toString().equals("double")) {
                        ChangeValue = Sc.nextDouble();
                    }
                    if (field.getType().toString().equals("boolean")) {
                        ChangeValue = Sc.nextBoolean();
                    }
                    try {
                        System.out.println(field.getType());
                        field.set(Girl, ChangeValue);
                        System.out.println(field.get(Girl));
                    } catch (IllegalAccessException e) {
                    }
                }
            }
            if (change.equals("-1")) break;//判断跳出循环
            Main main=new Main();
            main.Print(fields,Girl);
        }
        for (Method method:methods){//关于用户选择的方法
            System.out.println("以下为你女朋友会干的事情："+method.getName());
        }
        System.out.println("\n"+"选吧（嘿嘿/狗头/狗头）");
        String Do=Sc.next();
        for (Method method:methods){
            if (Do.toString().equals(method.getName())){
                try {
                    method.setAccessible(true);
                    method.invoke(new GirlFriend());
                } catch (InvocationTargetException e) {
                }
            }
        }
    }



    public void Print(Field [] field,GirlFriend Girl){//打印列表
        System.out.println("\n"+"修改后：");
        for (Field field1:field){
            try {
                System.out.println(field1.getName()+"="+field1.get(Girl));
            } catch (IllegalAccessException e) {}
        }
    }
}
