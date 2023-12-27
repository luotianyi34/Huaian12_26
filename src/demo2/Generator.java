package demo2;

//当接口中的，某一个方法或者多个方法的返回值类型不确定时，可以用泛型表示
public interface Generator<T> {
    public T get(T t);

}
