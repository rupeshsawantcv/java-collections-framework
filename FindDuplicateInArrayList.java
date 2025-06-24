
import java.util.*;
class FindDuplicateInArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(19);
         list.add(129);
          list.add(129);
           list.add(129);
            list.add(15);
             list.add(135);
              list.add(135);
              System.out.println("Original Array: "+list);
              
              findDuplicate(list);
              
    }
    public static void findDuplicate(List<Integer> list){
                 HashSet<Integer> seen = new HashSet<>();
                 HashSet<Integer> dup =  new HashSet<>();
                 
                 for(Integer num: list){
                     if(!seen.add(num)){
                         dup.add(num);
                     }
                 }
                 System.out.println("Duplicate Elements in Array: "+dup);
                 
              }
              
}