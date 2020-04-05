package datastructures;

import java.util.ArrayList;
import java.util.Arrays;

class MyStackArray {
    ArrayList<Integer> storage = new ArrayList<Integer>();

    /**
     * @throws Exception if the stack is empty
     */
    public Integer top() throws Exception {
        if (storage.size() == 0) {
            throw new Exception("No data in array");
        }
        return storage.get(storage.size()-1);
    }

    public Integer pop() throws Exception {
        Integer value = top();
        storage.remove(storage.size() - 1);
        return value;
    }

    public void push(Integer data) {
       storage.add(data);
    }

    public Boolean empty() {
       return storage.isEmpty(); 
    }

    public Integer search(Integer data) {
        return Arrays.binarySearch(storage.toArray(), data);
    }
    
    public static void main(String[] args) throws Exception {
        MyStackArray msa = new MyStackArray();
        msa.push(5);
        msa.push(10);
        System.out.println(msa.top());
        System.out.println(msa.search(6));
        System.out.println(msa.pop());
        System.out.println(msa.top());
    }
}
