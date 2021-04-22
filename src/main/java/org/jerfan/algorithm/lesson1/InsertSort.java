package org.jerfan.algorithm.lesson1;

/**
 * 演示插入排序
 * 样本数量情况会影响算法的性能
 * 最好情况 O(n)
 * 最坏情况 O (n的平方)
 * @author jerfan cang
 * @since 2021/4/22 21:37
 */
public class InsertSort {


    public static void insertSort(int [] arr){
        if(null == arr || arr.length < 2)
            return;

        // 0 ~ 0 有序
        // 0 ~ i 有序
        for(int i =1 ; i <arr.length ; i++){ // 0 ~ i 做到有序

            // j>=0 && arr[j] > arr[j+1]
            // j 不能越界，越界和不用交换则停掉
            for(int j=i-1; j>=0 && arr[j] > arr[j+1]; j--){
                 ArraySwap.swap(arr,j,j+1);
            }
        }


    }


    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 8, 9, 19,12};

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ,");
        }
        insertSort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ,");
        }
    }

}
