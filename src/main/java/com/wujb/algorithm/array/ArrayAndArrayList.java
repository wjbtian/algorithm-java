package com.wujb.algorithm.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：wujb
 * @date ：Created in 2019/12/16
 * @description：单纯的数组和容器封装类ArrayList的区别
 * 数组是一块连续的内存空间，来存储一组相同的数据，最大特点是支持随机访问
 * 但是插入和删除操作比较低效
 */
public class ArrayAndArrayList {


    public static void main(String[] args) {
        //数组初始化
        int[] array = {1, 2, 4, 5, 6, 7};
        // new 必须指定数组的大小
        int[] arrayInit = new int[3];
        //数组属于引用类型，为初始化导致的空指针异常
        int[] arrayNotInit = null;
       // System.out.println("args = [" + arrayNotInit[1] + "]");
        //java中arrayList的封装
        //为什么List容器中封装的必须是对象，而不可以是基本数据类型，可以从remove方法中看到，最后一步 又一个置为空的操作，int i - null，是语法
        //检查不会通过的
        List<Integer> arraylist = new ArrayList<Integer>();
        //数组的删除操作是将一段数据copy后，数组大小不变，末尾设置为null

        array =  delete(1,array);
        for (int i:array){
            System.out.println("i = [" + i + "]");
        }
        array =  delete(1,array);
        for (int i:array){
            System.out.println("i = [" + i + "]");
        }
    }

    /**
     * 数组删除操作
     * @param index
     * @param s
     * @return
     */
    public static int[] delete(int index, int[] s) {
        System.arraycopy(s, index+1, s, index, s.length-1-index);
        s[s.length-1]= 0;
        return s;
    }
}
