package org.java.version.jdk11;

import java.io.IOException;

public class Solution {
    public static void main(String args[]) throws IOException {

        VarInLambda vl = new VarInLambda();
        vl.example();
        System.out.println();

        StringFeatures sf = new StringFeatures();
        sf.example();
        System.out.println();

        FileStringExample fs = new FileStringExample();
        fs.example();
        System.out.println();
    }
}
