package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("setsAndMaps!");

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        class TestClass {
            public static void main(String[] args) {
                for (int i = 0; i < 20; i++) {
                    if (i % 2 != 0) {
                        continue;
                    }
                    System.out.println("Number=" + i);
                }

            }
        }
    }
}