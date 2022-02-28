package com.itheima.io;

import java.io.*;
import java.util.Arrays;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/2/22 16:29
 */
public class AddFile {


    public static void main(String[] args) throws FileNotFoundException {

        int count = 0;
        while (true) {
            File file = new File("D:\\heimaHomeWork\\FeiQ.exe-" + count);
            if (!file.exists())
                break;
            count++;
        }

        File[] files = new File[count];
        for (int i = 0; i < files.length; i++) {
            files[i] = new File("D:\\heimaHomeWork\\FeiQ.exe-" + i);
        }

        File file = new File("d:/FeiQ.exe");
        byte[] target = null;
        OutputStream fos = new FileOutputStream(file);

        for (int i = 0; i < files.length; i++) {
            FileInputStream fis = new FileInputStream(files[i]);
            try (fis) {
                byte[] readContent = new byte[(int) files[i].length()];
                fis.read(readContent);
                if (i == 0)
                    target = Arrays.copyOf(readContent, (int) files[0].length());
                else {
                    if (i != files.length - 1)
                        target = Arrays.copyOf(readContent, (int) (target.length + files[i + 1].length()));
                    else
                        target = Arrays.copyOf(readContent, (int) (target.length + files[i].length()));
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try (fos) {
            fos.write(target);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}