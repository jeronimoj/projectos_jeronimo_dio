import java.util.Scanner;
public class Xadres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c,d;


        while(true){
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            if(a == 0 && c == 0 && b == 0 && d == 0) break; //condição de parada
            if( (a==b) && (c==d))
                System.out.println("0");
            else if( (a==b) || (c==d) ||  Math.abs(c - d) == Math.abs(a - b))
                System.out.println("1");
            else
                System.out.println("2");
        }
        sc.close();
    }
}


