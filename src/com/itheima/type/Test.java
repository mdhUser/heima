package com.itheima.type;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 测试
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/15 10:40
 */
public class Test {

    public static void main(String[] args) {

        ArrayList<Number> nums = new ArrayList<>();
        nums.add(1);
        nums.add(456.65f);
        nums.add(87.45d);
        System.out.println("nums = " + nums);

        System.out.println();

        List<Integer> integers = new ArrayList<>();

        integers.add(456);
        integers.add(24);
        integers.add(46);
        integers.add(85);
        integers.add(745);

        NodeType<Integer> nodeType = new NodeType<>();
        integers.stream().forEach(i->nodeType.add(i));

        System.out.println("nodeType = " + nodeType.values());






    }



}
