package demo;

import org.junit.Test;

import java.util.*;

public class My_map {
    /*Map 接口 双列集合
元素包含一个键(key)对象和一个值(value)对象访问元素，只要指定key就能找到对应的value
将key映射到值的对象，key不能重复，每一个key只能映射到一个value
Map子类
HashMap :哈希表结构
元素的顺序不能保证―需要key唯一 不重复需要重写hashcode()和equals()方法LinkedHashMap:链表结构+哈希表结构
是HashMap子类,通过链表结构来保证元素的存取顺序一致工TreeMap:树结构
注意：map有两个泛型 map<k,v> k是指定key的数据类型 v是指定value的数据类型
方法:
    1.get(Object key)通过key找到对应的value
    2.put(K k ,V v)将指定的值于此映射的指定的key 关联 存入到map集合中
    3.remove(Object key)根据key去移除对应映射的value
    如果没有指定的key对应的value 返回null
    使用put时候，如果key已经存在，就修改原来的value
Map的嵌套接口: Entry 键值对 对象
            将键值对的对应关系封装成对象
            获取元素的时候，每一组元素就是一个键值对对象
            getKey()获取键
            getValue()获取值
            keySet()获取所有的key 转换为set集合 先获取到key 再根据key获取到对应的value
            entrySet()返回Map集合中所有的键值对对象 同时获取key和value
             是以set集合的形式返回(可以不重复 可以排序)
注意:Map集合不能直接使用迭代器或者for循环直接遍历,需要先转换成set之后在遍历
*/
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("name","admin");
        map.put("test","123456");
        map.put("test1","123456");
        map.put("test2","123456");
        map.put("test3","123456");
        map.put("password","123456");
        System.out.println(map);
        //转换成set集合后遍历，可以获取到具体的key和具体的value
        Set<Map.Entry<String,String>> set = map.entrySet();

        //迭代器遍历 同时获取key和value
        Iterator<Map.Entry<String,String>> iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:"+key+",value:"+value);
        }

        //增强for循环遍历
        for (Map.Entry<String,String> entry: set){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }

//        System.out.println(map.get("name"));
//        System.out.println(map.remove("test"));
//        System.out.println(map);
    }
    @Test
    public void getMapSet(){
        //对象为value
        HashMap<String,Student> map1 = new HashMap<>();
        map1.put("001",new Student("张三",18));
        map1.put("002",new Student("李四",15));
        map1.put("003",new Student("王五",17));

//        System.out.println(map1.get("001"));
        //对象作为key
        HashMap<Student,String> map2 = new HashMap<>();
        LinkedHashMap<Student,String> map3 = new LinkedHashMap<>();
        map2.put(new Student("周杰伦",18),"台湾");
        map2.put(new Student("薛之谦",21),"上海");
        map2.put(new Student("许嵩",22),"安徽");
        //遍历取值  键->值的形式
        //1.先获取到所有的key 然后根据key去一个一个的对应value
        Set<Student> keyset = map2.keySet();
        for (Student student : keyset) {
            String value = map2.get(student);
            System.out.println(student.toString()+"="+value);
        }


    }
}
