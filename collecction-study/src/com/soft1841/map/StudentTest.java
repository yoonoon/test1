package com.soft1841.map;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();
        list1.add(new Student(1, "林俊杰"));
        list1.add(new Student(2, "李荣浩"));
        list2.add(new Student(3, "那英"));
        list2.add(new Student(4, "邓紫棋"));

        Map<String, List<Student>> map = new HashMap<>();
        map.put("男生", list1);
        map.put("女生", list2);

        Iterator<Map.Entry<String, List<Student>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<Student>> entry = iterator.next();
            System.out.println(entry.getKey());
        Iterator<Student> listIterator =  entry.getValue().iterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }


        }
    }
}
