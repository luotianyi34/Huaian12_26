package HomeWork2;

import java.util.HashMap;
import java.util.Set;

public class getHashMap {
    public static void main(String[] args) {
        // 创建外层的HashMap，用于存放班级信息
        HashMap<String,HashMap<String,String>> finalHashMap = new HashMap<>();
        // 创建内层的HashMap，用于存放学生数据
        HashMap<String,String> hashMap1 = new HashMap<>();
        hashMap1.put("jf001","李四");
        hashMap1.put("jf002","张三");
        hashMap1.put("jf003","王五");
        HashMap<String,String> hashMap2 = new HashMap<>();
        hashMap2.put("jf001","赵六");
        hashMap2.put("jf002","田七");
        // 将内层的HashMap放入外层的HashMap中
        finalHashMap.put("2017",hashMap1);
        finalHashMap.put("2016",hashMap2);
        // 获取班级信息和学生数据
        HashMap<String, String> studentData1 = finalHashMap.get("2017");
        HashMap<String, String> studentData2 = finalHashMap.get("2016");
        System.out.println("2017班学生数据：");
        for (HashMap.Entry<String, String> entry : studentData1.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("2016班学生数据：");
        for (HashMap.Entry<String, String> entry : studentData2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }



    }
}
