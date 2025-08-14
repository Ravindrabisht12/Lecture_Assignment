package org.LLD1.Generics;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        /**
         * Normal Pair
         * 1. We pass 3, 4 in Pair.
         * 2. Now if we are trying to set string it won't accept as we directly define type of first variable in Pair class
         *
         * So issue without Generics
         * 1. If class is created user have do not any control over it.
         */
         Pair p = new Pair(3, 4);
         // p.setFirst("test"); // It won't except string as we hardcoded type int.


        /**
         * Generics
         * 1. Type safety: Generics provide compile-time type checking, reducing the chances of runtime errors.
         * 2. Code reusability
         * 3. Elimination of Type Casting: Generics eliminate the need for explicit type casting, making the code cleaner.
         *
         * Below two examples show how we can set type from client side. We do not need to modify the PairGeneric class and we can pass any type
         */
        // PairGenerics<String, Integer> pairGe = new PairGenerics<>(3, 4); // Error because we define first as a string but trying to pass Integer
        PairGenerics<String, Integer> pairGe = new PairGenerics<>("Ravindra", 26);
        // pairGe.setFirst(45) // Error becuase we are trying to set integer to first but we define this as a String


        // In this example we set datatype as List and String
        List<Integer> l = new ArrayList<>();
        PairGenerics<List<Integer>, String> g2 = new PairGenerics<>(l, "Ravindra");
    }
}
