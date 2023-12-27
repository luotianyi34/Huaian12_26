package demo2;

import java.util.List;

public class Genericity {
    /*泛型
      当没有固定集合中的数据类型时，那么集合中可以存放任何数据类型
      数据混乱，不容易整理处理
      为了避免这样的情况出现，可以指定集合的数据类型 叫做泛型
      定义<数据类型> E(elment) T(type) K(key) V(value) N(num) ?(不确定)通配符并且这个数据类型没有被用到
      上界通配符
      泛型类接口
    当接口中的某一个方法或多个方法的返回值类型不确定时，可以用泛型表示
    泛型接口的实现
    当实现类不确定接口中的泛型到底时啥类型，可以继续保留泛型，泛型的类型由调用它的实例决定
    在实现定义有泛型的接口时,直接赋予泛型为具体的类型

    泛型的好处:消除代码中的类型转换  类型检查层 可以防止错误类型的键或者值存入集合中
        1.类型安全
        2.消除强制类型转换


    * */
    public static void main(String[] args) {

    }
    public static void generic(List<?> data){
        System.out.println(data.get(0));
    }
    /*class ArrayList<E>{
        public boolean add(E e){
            return true;
        };
        public E get(int index){
            return null;
        };
    }*/
}



