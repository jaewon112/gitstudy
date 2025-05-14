package generic;

import java.util.ArrayList;
import java.util.List;

public class Repoitory<T> {
    private List<T> list;

    public Repoitory() {
        list = new ArrayList<>();
    }

    public Object save(T obj) {
        list.add(obj);
        return obj;
    }

    public List<T> findAll() {
        return list;
    }

}
