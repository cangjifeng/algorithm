package org.jerfan.algorithm.lesson1;

/**
 * 数组中 2 位置数值交换
 * @author jerfan cang
 * @since 2021/4/22 21:39
 */
public class ArraySwap {

    /**
     * 交换数组中 2个索引下标的值
     * @param arr 一个非空数组
     * @param i 索引下标 i
     * @param j 索引下标 j
     */
    public static void swap(int [] arr , int i , int j){
        if(null == arr
                || ( i <0 || i > arr.length)
                || (( j <0 || j > arr.length)))
            return;

        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    /**
     * 交换数组中 2个索引下标的值
     * @param arr 一个非空数组
     * @param i 索引下标 i
     * @param j 索引下标 j
     */
    public static void baseSwap(int [] arr , int i , int j){

        if(null == arr
                || ( i <0 || i > arr.length)
                || (( j <0 || j > arr.length))){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
