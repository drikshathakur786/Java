// eg ki apne generic interface ko implement kraya pr jo class h vo generic nhi h

public interface Container<T> {

    void add(T item);
    T.get();

    
}

public class StringContainer implements Container<String>{

    private String item;

    @Override
    public void add(String item){
        this.item=item;
    }

    @Override
    public String get(){
        return null;
    }
}