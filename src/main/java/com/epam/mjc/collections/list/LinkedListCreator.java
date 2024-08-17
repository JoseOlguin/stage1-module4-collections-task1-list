package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (Integer source : sourceList) {
            if (source % 2 == 0) {
                linkedList.addLast(source);
            } else {
                linkedList.addFirst(source);
            }
        }

        return linkedList;
    }
}
