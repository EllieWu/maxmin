import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int a,b,c;
       int max,min;
       a=in.nextInt();
       b=in.nextInt();
       c=in.nextInt();
       max=a;
       if(b>max)
           max=b;
       if(c>max)
           max=c;
       System.out.print(max);
       min=a;
        if(b<min)
            min=b;
        if(c<min)
            min=c;
        System.out.print(min);








    }
}