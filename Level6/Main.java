package Redrock4.Level6;

public class Main {
    public static void main(String[] args) {
        MyLinke<String> myLinke=new MyLinke<>();
        myLinke.add("a");
        myLinke.add("b");
        myLinke.add("c");
        myLinke.add("d");
        myLinke.add("e");
        myLinke.remove("c");
        myLinke.set("a","hello world");
        while (myLinke.hasNext()){
            System.out.println(myLinke.next());
        }while (myLinke.hasNext()){
            System.out.println(myLinke.next());
        }
    }
}
