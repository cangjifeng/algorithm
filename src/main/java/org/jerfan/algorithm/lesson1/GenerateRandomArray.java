package org.jerfan.algorithm.lesson1;

/**
 * 随机数组生成器
 * @author jerfan cang
 * @since 2021/4/22 23:22
 */
public class GenerateRandomArray {


    /**
     * 生成一个随机数组
     * @param maxSize 数组期望有多少个数，会拿这个期望数 * 随机数 = 随机数
     * @param maxValue 最大值，会拿这个最大值 * 随机数 = 随机数
     * @return 随机数组
     */
    public static int[] generateRandomArray(int maxSize,int maxValue){

        if(maxSize < 0 || maxValue < 0 )
            return new int[]{0};

        // Math.random()  返回 [0,1)
        // Math.random() * N 返回 [0,N)
        // (int) (Math.random() * N) 返回 [0,N-1)

        int [] arr = new int[ (int) ( (maxSize+1) * Math.random() )];
        for( int i =0 ;i < arr.length; i++){
            // 保证值随机 可以有负数
            arr[i]= (int) ( (maxValue+1)*Math.random()  - (maxValue+1)*Math.random() );
        }
        return arr;
    }


    /**
     * copy 一个数组
     * @param arr 老数组
     * @return 新数组
     */
    public static int[] copyArray(int [] arr){
        int[] new_arr = new int[arr.length];
        for(int i =0; i<arr.length; i++){
            new_arr[i]=arr[i];
        }
        return new_arr;
    }


    public static void main(String[] args) {
        int [] arr = GenerateRandomArray.generateRandomArray(10,5);

        for(int i =0 ;i< arr.length; i++){
            System.out.print(arr[i] +" ,");
        }
    }
}
