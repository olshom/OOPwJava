package task2;

import java.util.ArrayList;

public class Class{
    ArrayList<String> list = new ArrayList<>();
    public synchronized void add(String o) {
        list.add(o);
    }
    public synchronized void remove(String o) {
        list.remove(o);
    }
    public int size() {
        return list.size();
    }
}
