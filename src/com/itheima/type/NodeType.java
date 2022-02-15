package com.itheima.type;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 二叉树算法
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/15 11:09
 */
public class NodeType<T> {

    NodeType<T> leftNode;

    NodeType<T> rightNode;

    T value;

    public void add(T t) {

        if (value == null)
            value = t;

        else {
            if ((Integer) value - (Integer) t <= 0) {
                if (null == leftNode) leftNode = new NodeType<>();
                leftNode.add(t);
            }

            if (null == rightNode) rightNode = new NodeType<>();
            rightNode.add(t);
        }

    }

    public List<T> values(){

        List<T> values=new ArrayList<>();
        if (null!=leftNode)
            values.addAll(leftNode.values());


         return values;
    }


}
