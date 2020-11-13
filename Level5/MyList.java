package Redrock4.Level5;
import java.util.Iterator;
public class MyList<T> implements Iterator {
    private static Object [] obj=new Object[3];//初始化容量10
    private static int count=-1;
    @Override
    public boolean hasNext() {
        count++;
        if (count<obj.length&&count>=0){
            if (obj[count]!=null) return true;
            else return false;
        }
        else return false;
    }

    @Override
    public Object next() {
        if (count<obj.length){
            int i=count;
            if (count== obj.length-1) count=-2;
            return obj[i];
        }
        else return "erro";
    }
    public void remove(T t) {
        A:for(int i=0;i<obj.length;i++){
            if (obj[i].equals(t)){
                for (int j=i;j< obj.length-1;j++){
                    obj[j]=obj[j+1];
                    if (j== obj.length-2) obj[obj.length-1]=null;
                    break A;
                }
            }
        }
    }

    //MyList集合的方法
    public void add(T t){
        if (obj[obj.length-1]!=null){
            Object ob=new Object[obj.length];
            System.arraycopy(obj,0,ob,0,obj.length);
            obj=new Object[obj.length+1];
            System.arraycopy(ob,0,obj,0,obj.length-1);
            }
        for (int i=0;i<obj.length;i++)  {
            if (obj[i]==null) {
                obj[i]=t;break;
            }
        }
    }
}
