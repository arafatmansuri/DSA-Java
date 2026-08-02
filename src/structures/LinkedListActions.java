package structures;

import java.util.LinkedList;

public class LinkedListActions {
    LinkedList<Integer> nums = new LinkedList<Integer>();

    public void add(int num){
        nums.add(num);
    }
    public LinkedList<Integer> display(){
        return nums;
    }


}
