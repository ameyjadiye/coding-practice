package com.codeinventory.codegladiator2020.round1;
/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class Problem1 {
    public static void main(String args[] ) throws Exception {

        BufferedReader reader =  
                new BufferedReader(new InputStreamReader(System.in)); 
      
     int numberOfIng = Integer.parseInt(reader.readLine()); 

     final long[] requiredQ = Arrays.stream(reader.readLine().split("\\s+"))
             .mapToLong(Long::parseLong)
             .toArray();
     
     final long[] availQ = Arrays.stream(reader.readLine().split("\\s+"))
             .mapToLong(Long::parseLong)
             .toArray();
     
     long result[] = new long[numberOfIng];
     for (int i = 0 ;i < numberOfIng ;i ++) {
         result[i] = availQ[i]/requiredQ[i];
     }
     
     long res = Arrays.stream(result).reduce((x, y) -> x < y ? x : y).getAsLong();
     System.out.println(res);
     
   }
}
