package Mid_Level.Collection_Framework.Others.HashCode.Step8;

public class Entry {
    public Entry(Object key,Object value) {
        super();
        this.key = key;
        this.value = value;
    }
    public Object key;
    public Object value;
    public String toString() {
        return "[key = "+ key +", value = " + value + "]";
    }
}