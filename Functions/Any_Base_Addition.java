import java.util.*;
public class Any_Base_Addition{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b = scn.nextInt();
        int ans = getSum(n1,n2,b);
        System.out.println(ans);
    }
    public static int getSum(int n1, int n2, int b){
        int sum = 0;
        int carry = 0;
        int tp = 1;
        while(n1>0||n2>0||carry>0){
            int d1 = n1%10;
            n1=n1/10;
            int d2 = n2%10;
            n2=n2/10;
            int d = d1+d2+carry;
            carry=d/b;
            d=d%b;
            sum += d*tp;
            tp*=10;
        }
        return sum;
    }
}