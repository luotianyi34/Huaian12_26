package demo2;

public class Generatorlmpl<T> implements Generator<T>{
    private T value;

    public Generatorlmpl(T value) {
        this.value = value;
    }

    public Generatorlmpl() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }


    @Override
    public T get(T t) {
        //.......
        return t;
    }
}
