import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/6.
 * 输出A和B的最小公倍数
 */
public class Main_min_gongbeishu_6_8 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        System.out.println(m*n/get(m,n));

    }

    private static int  get(int m,int n){
        if(m<n){
            int temp=m;
            m=n;
            n=temp;
        }
        int k;
        while (n!=0){
            k=m%n;
            m=n;
            n=k;
        }
        return m;

    }
}
