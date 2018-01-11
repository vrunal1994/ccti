/***Design a method to find the frequency of occurrences of any given word in a book.
What if we run the algo multiple times */

import java.io.*;
import java.util.*;



class Moderate16_2{
    public static void main(String args[]) throws Exception{
        File file = new File("lorem.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        // StringBuilder sb =  new StringBuilder();
        String st = br.readLine();
        String[] s = st.split(" ");
        Map<String,Integer> countMap = new HashMap<String, Integer>();

        for (String i : s){
            if(countMap.containsKey(i)){
                int count = countMap.get(i);
                countMap.put(i,count+1);
            }
            else
                countMap.put(i,1);
        }
        countMap.forEach((k,v) -> System.out.println( k +" " + v));
    }

    public int getFrequency(HashMap<String, Integer> countMap, String st){
        if (countMap)
    }
}