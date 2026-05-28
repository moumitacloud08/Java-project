package org.java.version.jdk11;

import java.io.IOException;

public class Solution {
    public static void main(String args[]) throws IOException {

        VarInLambda vl = new VarInLambda();
        vl.example();

        StringFeatures sf = new StringFeatures();
        sf.example();

        FileStringExample fs = new FileStringExample();
        fs.example();
    }
}
