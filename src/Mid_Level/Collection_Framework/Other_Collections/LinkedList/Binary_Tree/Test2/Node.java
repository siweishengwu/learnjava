package Mid_Level.Collection_Framework.Other_Collections.LinkedList.Binary_Tree.Test2;


public class Node {
    //左子节点
    public Node leftNode;
    //右子节点
    public Node rightNode;

    // 值
    public Object value;

    //插入数据
    public void add(Object v) {
        // 如果当前字节没有值,就把数据放在当前子节点上
        if (null == value)
            value = v;
        // 如果当前节点又值，就进行判断，新增的值与当前值的大小关系
        else {
            // 新增的值，比当前值小或者相同

            if ((Integer) v -((Integer) value) <=0 ) {
                if (null == leftNode)
                    leftNode = new Node();
                leftNode.add(v);
            }
        }
    }

    public static void main(String[] args) {
        int randoms[] = new int[] { 67, 7, 30, 73, 10, 0, 78, 81, 10, 74};

        Node roots = new Node();
        for (int number : randoms) {
            roots.add(number);
        }
    }
}
