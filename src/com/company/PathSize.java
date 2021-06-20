package com.company;

import java.io.File;

public class PathSize {
    static long size = 0;

    public static long getSize(File file) {
        if (file.isDirectory()) {
            for (File child : file.listFiles()) {
                size += getSize(child);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(size);
            }
        } else {
            size = file.length();
        }
        return size;
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\user\\Desktop");
        System.out.println(getSize(file));
    }
}
