package collection;

//com.company.input.InputReader.java
package com.company.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader {
 private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

 public static String readString(String prompt) {
     try {
         System.out.println(prompt);
         return reader.readLine();
     } catch (IOException e) {
         e.printStackTrace();
         return null;
     }
 }
}

