//This file will have Collection API or Collection Framework, Collections, Collection
//Collection API is a concept in which Collection, Map and Iterator comes
//Collection - An Interface 
//Collections - Class - A utility class in java.util package to define several utility methods (Like Sorting, Searching) for collection objects. 


//Collection: Collection Inherits from Iterable
// 1. Collection is implemented by List, Set and Queue
// 2. List - ArrayList, LinkedList, Stack, Vector
// 3. Set - EnumSet, HashSet, LinkedHashSet, TreeSet
// 4. Queue - ArrayQueue, LinkedList, PriorityQueue


//Map is not an extension of collection interface but is part of API concept. Map itself is an interface. Key value is unique.
//What is the difference between HashMap and Hashtable

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Stream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Arrays;


public class InBuilt {
    
    //Arrays module to manipulate arrays (Not ArrayList)
    public static void ArraysClass(){
        int nums[] = new int[5];
        int index = Arrays.binarySearch(nums, 4);
        //Similarly .sort and .fill
    }

    //Collections class:
    public static void CollectionsClass(){
        //Collections.min(Pass a list); Max; frequency(9); sort(list);
        //sort(list, comparator.reverseorder());
        // ArrayList<Student> num = new ArrayList<>();
        //2 ways to sort custom objects
        // Collections.sort(nums, new Comparator<Student>(Student s1, Student s2) {
        //    public int compare (Student s1, Student s2){
        //     return s1.name.compareTo(s2.name);
        //}
        // });
        //You can change to lambda function

        //Another way to sort is to - Make the class student inherit from comparable and implement compareTo function
        //public int compareTo(Student 0){
        //      return this.rollno - 0.rollno;
        //      return this.name.compareTo(o.name)//If string
        //}
            

    }
    
    //Stream API - Does not affect the original nums arraylist from which stream is created.
    //Once you use an element in stream you cannot use it again. So I cannot use one stream twice.

    public static void streamAPI(){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(-3);
        nums.add(22);

        Stream <Integer> s1 = nums.stream();
        //This function does not work for arrays
        Stream <Integer> s2 = s1.filter(n -> n%2 == 0);
        //Or can do all operations in a single go
        int res = nums.stream().filter(n -> n%2 == 0).map (n -> n/2).reduce (0, (c,e) -> c+e);
        //Here 0 is the initial value in reduce function
    }
    
    public static void main(String[] args) {
        
        Collection<Integer> nums = new ArrayList<>();
        //You can directly print nums
        //If you don't specity Integer then by default it will Object
        //Collection does not support Index


        //ArrayList - Internally uses Arrays
        List<String> strs = new ArrayList<>();
        //Available functions - add(); .add(index, value); get(index); remover(index);
        //remove(Integer.valueof(30));.clear(); .set(2, 1000); contains(50); sout(); size();
        //Enhanced for loop
        //For every collection API you will get a Iterator
        Iterator <String> it = strs.iterator();
        //Functions - hasNext(); next();

        //Stacks - push, sout, peek and pop

        //LinkedList - Same ArrayList functions

        //Queue - It is an Interface
        Queue<Integer> queue = new LinkedList<>();
        //ArrayList can also be used
        //.offer(12), sout, poll, peek - These either gives true or false or null
        //.add, element(), remove - These throw exceptions
        //.equals

        //PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //Same Queue functions
        //Max heap
        PriorityQueue<Integer> max_pq = new PriorityQueue<>(Comparator.reverseOrder());


        //Deque
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        //Functions - .offer, offerfirst, offerlast, peek, peekfirst, peeklast, poll, pollfirst, polllast, addfirst, addlast
        

        //Sets - No Duplicates allowed
        //HashSet is not sorted. Not Indexed i.e not ordered.
        Set<Integer> st = new HashSet<>();
        //Functions - Add, sout, contains, isempty, size, clear
        //Mostly all functions in O(1);
        //LinkedHashSet - Ordered
        //TreeSet - Sorted way. Uses Heaps - O (log N)
        //How does the set differentiate if 2 custom objects are same?
        //You have to overired equals and hashcode methods in that custom class
        //That code can be generated by IDE. But see once.
        //Code will be there in OOPS file


        //Map
        //TreeMao is key sorted
        Map<Integer, String> mp = new HashMap<Integer, String> ();
        //Functions - put, sout, containskey, putifabsent, isempty, containsvalue, containskey
        for(Map.Entry<Integer, String> e: mp.entrySet()){
            System.out.println(e.getKey());
        }
        for (int key: mp.keySet()){

        }

        SortedMap <Integer, Integer> map = new TreeMap<>();
    

        System.out.println("Programme ended");
    }
}
