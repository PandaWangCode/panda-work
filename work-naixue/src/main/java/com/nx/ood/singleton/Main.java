package com.nx.ood.singleton;

import com.nx.ood.singleton.lazy.LazySingleton;

public class Main {

    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
    }
}
