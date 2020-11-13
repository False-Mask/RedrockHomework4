package Redrock4.Level5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyList<String>myList=new MyList<>();
        myList.add("hello world");
        myList.add("卧槽！！");
        myList.add("hh");
        myList.add("h");
        myList.remove("hh");
        while (myList.hasNext()){
            System.out.println(myList.next());
        }
        while (myList.hasNext()){
            System.out.println(myList.next());
        }
    }
}
