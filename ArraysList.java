import java.util.ArrayList;
import java.util.Iterator;

/* ArrayList function is a predifined set of instruction in 
programme */

class ArraysList {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<String>();

        obj.add("Ashish");   //push the elements in Array
        obj.add("abhishek");
        obj.add("abhinay");
        
        // System.out.println(obj);
        // obj.remove("Ashish");  //remove the elements from array
        // System.out.println(obj);
        
        System.out.println(obj.contains("Ashish")); //return boolean value
       
        Iterator<String> itr = obj.iterator();
        
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        ArrayList<Integer> obj1 = new ArrayList<Integer>() ;

        obj1.add(1);
        obj1.add(2);
        obj1.add(13);
        obj1.add(60);

        Iterator<Integer> itr1 = obj1.iterator();

        while(itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        System.out.println(obj1);
      
        
    }
}