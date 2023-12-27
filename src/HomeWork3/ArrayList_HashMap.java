package HomeWork3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayList_HashMap {
    public static void main(String[] args) {
        //创建ArrayList集合
        ArrayList<HashMap<String,String>> arrayList = new ArrayList<>();
        //创建HashMap集合，并添加键值对元素
        HashMap<String,String> first = new HashMap<>();
        first.put("jf001","郑智");
        first.put("jf002","李毅");
        first.put("jf003","郜林");
        first.put("jf004","黄博文");
        HashMap<String,String> second = new HashMap<>();
        second.put("jf001","梅西");
        second.put("jf002","C罗");
        second.put("jf003","内马尔");
        second.put("jf004","帕托");
        //把HashMap作为元素添加到ArrayList集合中
        arrayList.add(first);
        arrayList.add(second);
        //遍历ArrayList集合
        for (HashMap<String, String> hashMap : arrayList) {
            System.out.println(hashMap);
            //HashMap集合的遍历
            Set<String> set = hashMap.keySet();
            for (String s : set) {
                String value = hashMap.get(s);
                System.out.println(s+" "+value);
            }
        }

    }
}
