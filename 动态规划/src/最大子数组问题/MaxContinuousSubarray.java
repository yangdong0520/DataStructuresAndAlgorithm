package 最大子数组问题;

import java.util.Arrays;

/**
 * @Author 杨栋
 * @Date 2020/10/17 19:43
 */


// 最大子数组问题
public class MaxContinuousSubarray {
    public static void main(String[] args) {
        int [] array = new int[]{-1,-3,3,5,-4,3,2,-2,3,6};
        MaxContinuousSubarray mcs = new MaxContinuousSubarray();
        System.out.println(mcs.maxCountinousSubarray01(array));
    }
    
    // 蛮力枚举
    public int maxCountinousSubarray01(int[] array){
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i <array.length ; i++) {
            int count = 0;
            for (int j=i;j<array.length;j++){
                count +=array[j];
                sum = Math.max(count,sum);
            }
        }
        return sum;
    }
    
    // 动态规划
    public int maxCountinousSubarray02(int[] array){
        int count = 0;
        return count;
    }
   
    
}
