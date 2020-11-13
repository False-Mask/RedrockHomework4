package Redrock4.Level6;
import java.util.Iterator;
public class MyLinke<T> extends MYLIST implements Iterator {
    public  static int count=0;  //记录链表的链接个数
    static int a=1;//辅助完成hasnext方法
    static MYLIST head=null;
    static MYLIST pp=null;
    public MyLinke(){
        if (head==null){
            head=new MYLIST();
            count++;//统计节点数
        }
    }
    public void add(T t){
        MYLIST pr=head;
        while (pr.next!=null) pr=pr.next;
        pr.obj=t;
        pr.next=new MYLIST();//创建节点保证链表的空间足够
        count++;//统计节点数
    }
    public void remove(T t){
        MYLIST pr=head;
        if (pr.obj.equals(t)) head=head.next;
        while(!pr.next.obj.equals(t)){
            pr=pr.next;
        }
        pr.next=pr.next.next;
    }
    public void set(T t,T Set){
        MYLIST pr=head;
        while (pr.next!=null){
            if (pr.obj.equals(t)) pr.obj=Set;
            else  pr=pr.next;
        }
    }

    @Override
    public boolean hasNext() {
        if (pp==null) {
            pp=head;
            return true;
        }else {
            pp=pp.next;
            if (pp!=null) {
                if (a==1&&pp.next.next==null){
                    a--;
                    return true;
                }
                else if (a!=1){
                    a=1;
                    pp=null;
                    return false;
                }
            }
        }
        return true;
    }
    @Override
    public Object next() {
        if (pp!=null) return pp.obj;
        return 0;
    }
}
