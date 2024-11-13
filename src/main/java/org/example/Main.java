package org.example;

import java.io.File;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File file = new File("E:\\обои gr");
        System.out.println(getFolderFile(file));
    }
    public static long getFolderFile(File folder){
        if (folder.isFile()){
            return folder.length();
        }
        long sum = Arrays.stream(folder.listFiles()).mapToLong(Main::getFolderFile).sum();
        return sum;
    }
}