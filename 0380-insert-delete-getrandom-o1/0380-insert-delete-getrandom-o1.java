import java.util.*;

class RandomizedSet {
   
    ArrayList<Integer> list; 
    Random rand;       

    public RandomizedSet() {
     
        list = new ArrayList<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        if (list.contains(val)) return false;
     
        list.add(val); 
        return true;
    }

    public boolean remove(int val) {
        if (!list.contains(val)) return false;
   
        list.remove(Integer.valueOf(val));
        return true;
    }

    public int getRandom() {
       
        return list.get(rand.nextInt(list.size()));
    }
}
