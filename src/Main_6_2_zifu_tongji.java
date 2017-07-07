import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Administrator on 2017/7/7.
 */
public class Main_6_2_zifu_tongji {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        while (in.hasNext()){
            String s=in.next();
            tongji(s);
        }
    }

    private static void tongji(String s){
        int n=s.length();
        int[] nums=new int[n];
        TreeMap<Character,Integer> map=new TreeMap<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c==' '||(c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9')){
                if(map.get(c)==null){
                    map.put(c,1);
                }else {
                    map.put(c,map.get(c)+1);
                }
            }
        }
        //ArrayList<Character> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(Character c:map.keySet()){
            set.add(map.get(c));
        }
        int[] ints=new int[set.size()];
        int li=0;
        for(Integer i:set){
            ints[li]=i;
            li++;
        }



        Arrays.sort(ints);

        StringBuilder sb=new StringBuilder();
        for(int i=ints.length-1;i>=0;i--){
            for(Character c:map.keySet()){
                if(map.get(c)==ints[i]){
                    sb.append(String.valueOf(c));
                }
            }
        }
        System.out.println(sb.toString());

    }
}
