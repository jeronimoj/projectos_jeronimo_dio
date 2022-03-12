import java.util.Scanner;
public class Numpares {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int N;

        N = leitor.nextInt();

        for(int i =  1; i<= N; i++){
            if(i%2 == 0 && N>0){
                System.out.println(i);
            }
        }
}
}
