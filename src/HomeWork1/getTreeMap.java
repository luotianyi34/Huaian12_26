package HomeWork1;

import java.util.Set;
import java.util.TreeMap;

public class getTreeMap {
    public static void main(String[] args) {
        TreeMap<Student, String> treeMap = new TreeMap<>();//由于默认比较器无法比较Student类所以我们要自定义比较器
        // 添加数据
        treeMap.put(new Student("张三", 23), "北京");
        treeMap.put(new Student("李四", 21), "上海");
        treeMap.put(new Student("王五", 25), "广州");
//        System.out.println(treeMap);
        Set<Student> set = treeMap.keySet();
        for (Student student : set) {
            String value = treeMap.get(student);
            System.out.println("学生的名字为:"+student.getName()+",学生的年龄为:"+student.getAge()+",家庭住址为:"+value);
        }
    }
}
