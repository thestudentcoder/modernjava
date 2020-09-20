package com.wchan.defaults;

import java.util.List;

public interface Multiplier {

    int multiply(List<Integer> integerList);

    // default methods can be overridden
    default int size(List<Integer> integerList) {
        return integerList.size();
    }

    // static methods cannot be overriden, but they can
    // be hidden by redeclaring it in the implementing
    // class
    static boolean isEmpty(List<Integer> integerList) {
        return integerList != null && integerList.size() > 0;
    }
}
