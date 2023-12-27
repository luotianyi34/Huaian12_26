package demo2;

public class Generic<T>{
    private T value;//这个成员变量的数量类型不确定，用泛型T来表示 T的类型是由外部决定的

    public Generic(){

    }
    public Generic(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "value=" + value +
                '}';
    }
}
