package Mid_Level.Collection_Framework.ArrayList.Common_Methods;

import java.util.ArrayList;

public class MyStringBuffer implements IStringBuffer {

    // int capacity = 16; // 不需要自己维护capcity，capacity在ArrayList中由ArrayList维护
    // int length = 0; // 不需要自己维护length，length ArrayList的size
    ArrayList value;

    public MyStringBuffer(){
        value = new ArrayList();
    }

    //有参构造方法
    public MyStringBuffer(String str) {
        this();
        if (null == str)
            return;
        char[] cs = str.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            char c = cs[i];
            value.add(c);
        }
    }

    @Override
    public void append(String str) {
        insert(value.size(),str);
    }

    @Override
    public void append(char c) {
        append(String.valueOf(c));
    }

    @Override
    public void insert(int pos, char b) {
        insert(pos,String.valueOf(b));
    }

    @Override
    public void insert(int pos, String b) {

        // 边界条件判断
        if (pos < 0)
            return;

        if (pos > value.size())
            return;

        if (null == b)
            return;

        // 无需手动扩容

        char[] cs = b.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            char c = cs[i];
            value.add(pos + i,c);
        }
    }

    @Override
    public void delete(int start) {
        delete(start,value.size());
    }

    @Override
    public void delete(int start, int end) {
        // 边界条件判断
        if (start < 0)
            return;

        if (start > value.size())
            return;

        if (end < 0)
            return;

        if (end > value.size())
            return;

        if (start >= end)
            return;

        for (int i = 0; i < end - start; i++) {
            value.remove(start);
        }
    }

    @Override
    public void reverse() {
        for (int i = 0; i < value.size() / 2; i++) {
            int length = value.size();
            char temp = (char) value.get(i);

            value.set(i,value.get(length - i - 1));

            value.set(length - i - 1,temp);
        }
    }

    @Override
    public int length() {
        return value.size();
    }

    public String toString() {
        char[] charValue = new char[value.size()];
        for (int i = 0; i < value.size(); i++) {
            charValue[i] = (char) value.get(i);
        }
        return new String(charValue);
    }


    public static void main(String[] args) {
       MyStringBuffer sb = new MyStringBuffer("there light");
        System.out.println(sb);
        sb.insert(0 ,"let");
        System.out.println(sb);

        sb.insert(10,"be");
        System.out.println(sb);
        sb.insert(0,"God Say");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.append("?");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(0,4);
        System.out.println(sb);
        sb.delete(4);
        System.out.println(sb);
    }
}
