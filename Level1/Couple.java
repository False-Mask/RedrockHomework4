package Redrock4.Level1;
public class Couple {
    public int count(int number){//实现连加的功能
        if (number==0) return 0;
        else return number+count(number-1);
    }
    public int fb(int a1,int a2,int n){
        for (int i=1;i<n;i++){
            int x=a1;
            a1=a2;
            a2=x+a2;
        }
        return a1;
    }

}
