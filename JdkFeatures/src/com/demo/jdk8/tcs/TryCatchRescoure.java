package com.demo.jdk8.tcs;


import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/24 19:46
 */
public class TryCatchRescoure {

    public static void main(String[] args) {

        String path="d:/test.txt";
        test(path);


    }

    private static void test(String path) {
        File file = new File(path);
        if (!file.exists())
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }

        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write("我爱你YYJ".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
