import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/7.
 */
public class Main_6_3_Redraiment_zoufa {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            int n=in.nextInt();
            int[] nums=new int[n];
            for(int i=0;i<n;i++){
                nums[i]=in.nextInt();
            }
            sortmy(nums);
        }
    }

    private static void sortmy(int [] nums){
        int n=nums.length;
        int[] dp=new int[n];
        for(int i=0;i<n;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        Arrays.sort(dp);
        System.out.println(dp[n-1]);
    }
}
