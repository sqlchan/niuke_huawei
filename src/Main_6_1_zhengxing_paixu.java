import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/7.
 * 一般错在输出格式上
 */
public class Main_6_1_zhengxing_paixu {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int[] ints=new int[n];
            for(int i=0;i<n;i++){
                ints[i]=in.nextInt();
            }
            int is=in.nextInt();
            sortIntegerArray(ints,is);
        }


    }

    private static void sortIntegerArray(int[] ints, int is){
        Arrays.sort(ints);
        if(is>0){
            for(int i=ints.length-1;i>=0;i--){
                System.out.print(ints[i]);
                if(i!=0)System.out.print(" ");
            }
            System.out.println();
        }else if(is==0){
            for(int i=0;i<ints.length;i++){
                System.out.print(ints[i]);
                if(i!=ints.length-1)System.out.print(" ");
            }
            System.out.println();
        }
    }

}
