package day27_maps;

import java.util.HashMap;
/*
    1)HashMap is not "thread-safe" and is not "synchronized"
    2)Learn and explain HashMap Mechanism
        i)When you create a HashMap, Java gives you 16 "bucket"s
        ii)Java indexes every bucket from 0 to 15
        iii)When you put a new entry into the map,
            a)Java creates hashcode for the key
            b)Divides the hashcode by 16 then the remainder is the index of the bucket
        iv)Java puts the entry into the bucket whose index is found in "2)iii)b)"
        v)If Java needs to put multiple entries into a bucket, Java uses "Linked List" structure inside the bucket
        vi)If "75%" of  the existing buckets is full Java creates a new 16 buckets
        vii)To find an entry Java follows the following steps
                Bucket --> HashCode --> Key --> return value
 */
public class C04HashMapMechanism {

    public static void main(String[] args) {


        HashMap<String, Integer> countries = new HashMap<>();

        countries.put("Albania", 3);
        countries.put("USA", 400);
        countries.put("UK", 65);

        countries.get("UK");
    }
}
