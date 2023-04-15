import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       double a =sc.nextInt();
       double b=sc.nextInt();
       double c =sc.nextInt();
       double p = (a+b+c)/2;
       double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
       System.out.println(S);

    }
}
