import java.util.List;

public class Container<T extends Employee> {
    private List<T> list;

    public Container(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
