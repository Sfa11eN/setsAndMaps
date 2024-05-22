package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {


    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        InputStream inStream = new FileInputStream(fileName);

        while(inStream.available() > 0){
            list.add(inStream.read()) ;
        }
        Collections.sort(list);

        for (Integer runner: list) {
            if (runner % 2 == 0)
                System.out.println(runner);

        }
        //System.out.println();
        reader.close();
        inStream.close();
    }
}
