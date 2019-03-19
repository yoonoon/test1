package com.soft1841.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * set接口基础
 */
public class SetTest {
    public
    static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("9");
        set.add("6");
        set.add("8");
        System.out.println("直接输出**********");
        System.out.println(set);


        //用for循环遍历集合
        System.out.println("for循环遍历集合****");
        Object[] array = set.toArray();
        for(int i =0 ; i < array.length ;i++){
           System.out.println(array[i]+ "  ");
        }

        //用iteration迭代器遍历集合
        System.out.println("迭代器遍历集合********");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + "  ");
        }
        //用lambda表达式遍历集合
        System.out.println("表达式遍历集合*********");
        set.forEach(s -> System.out.println(set));


//        String s1 = new String("A");
//        String s2 = new String("B");
//        String s3 = new String("C");
//        String s4 = new String("A");
//        set.add(s1);
//        set.add(s2);
//        set.add(s3);
//        set.add(s4);
//        System.out.println(set);
    }
}
