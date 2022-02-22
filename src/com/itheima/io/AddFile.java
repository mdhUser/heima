package com.itheima.io;

import java.io.File;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/22 16:29
 */
public class AddFile {


    public static void main(String[] args) {

        int count = 0;
        while (true) {
            File file = new File("FeiQ.exe-" + count);
            if (!file.exists())
                break;
            count++;
        }

        File[] files = new File[count];


    }
}