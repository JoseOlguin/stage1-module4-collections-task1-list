package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> arrayList = new ArrayList<>();

        for(int i = 1, k = 0; k < sourceList.size(); i++, k++) {
            if (i % 3 == 0) {
                arrayList.add(sourceList.get(k));
                arrayList.add(sourceList.get(k));
            }
        }

        return arrayList;
    }
}
