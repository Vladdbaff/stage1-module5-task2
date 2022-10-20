package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(3, 6, 9));

        InterfaceCreator creator = new InterfaceCreator();

        Operation<Integer> operation = creator.divideBy(3);

        System.out.println(operation.apply(list));
    }
}
