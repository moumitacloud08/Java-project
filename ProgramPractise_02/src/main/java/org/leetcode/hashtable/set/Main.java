package org.leetcode.hashtable.set;

public class Main {

    public static void main(String[] args) {
        HashTable table;

        System.out.println("These tests confirm that set() correctly");
        System.out.println("inserts items, handles collisions, and");
        System.out.println("stores hardware inventory in the hash table.");
        System.out.println();

        // Test 1: Add single key to empty table
        System.out.println("Test 1: Insert Single Key");
        table = new HashTable();
        table.set("apple", 5);
        System.out.println("Expected: 'apple' with value 5");
        table.printTable();
        System.out.println();

        // Test 2: Insert multiple keys
        System.out.println("Test 2: Insert Multiple Keys");
        table = new HashTable();
        table.set("apple", 5);
        table.set("banana", 3);
        System.out.println("Expected: 'apple'=5 and 'banana'=3");
        table.printTable();
        System.out.println();

        // Test 3: Collision handling
        System.out.println("Test 3: Handle Collisions");
        table = new HashTable();
        table.set("apple", 5);
        table.set("orange", 4);
        System.out.println("Expected: 'apple' and 'orange' both stored");
        table.printTable();
        System.out.println();

        // Test 4: Multiple chained nodes
        System.out.println("Test 4: Hardware Store Chain");
        table = new HashTable();
        table.set("nails", 100);
        table.set("tile", 50);
        table.set("lumber", 80);
        System.out.println("Expected: nails, tile, lumber all present");
        table.printTable();
        System.out.println();

        // Test 5: Values remain independent
        System.out.println("Test 5: Independent Values");
        table = new HashTable();
        table.set("nails", 100);
        table.set("tile", 50);
        table.set("lumber", 80);
        System.out.println("Expected: nails=100, tile=50, lumber=80");
        table.printTable();
        System.out.println();

        // Test 6: Insert many items
        System.out.println("Test 6: Insert Many Items");
        table = new HashTable();
        for (int i = 0; i < 20; i++) {
            table.set("item" + i, i * 10);
        }
        System.out.println("Expected: 20 items across buckets");
        table.printTable();
        System.out.println();

        // Test 7: Retrieval after many insertions
        System.out.println("Test 7: Retrieve Keys from Chains");
        table = new HashTable();
        table.set("nails", 100);
        table.set("tile", 50);
        table.set("lumber", 80);
        table.set("bolts", 200);
        table.set("screws", 140);
        System.out.println("Expected: nails, tile, lumber, bolts, screws");
        table.printTable();
        System.out.println();

    }

}


