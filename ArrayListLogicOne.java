
import java.util.*;
public class ArrayListLogicOne {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(101);
        list.add(188);
        list.add(155);
        list.add(125);
        list.add(145);
        list.add(100);
        list.add(123);
        List<Integer> list1 = new ArrayList<>(list);
        
        System.out.println("Different ArrayList Operations");
        System.out.println("");
        System.out.println("1) Original List: "+list1);
        
        
        int max = 0;
        int min = list.get(0);
        
        for(int i = 0; i<list.size();i++){
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
         System.out.println("2) Maximum in all Elements: "+max);
         for(int i = 0; i<list.size();i++){
            if(list.get(i)<list.get(0)){
                min=list.get(i);
            }
        }
         System.out.println("3) Minimum in all Elements: "+min);
         int sum = 0;
         for(int sum1:list){
             sum+=sum1;
         }
         System.out.println("4) Sum of all Elements: "+sum);
         
         double avrg = sum/list.size();
         System.out.println("5) Avarege of all Elements: "+avrg);
         
         Collections.sort(list);
         System.out.println("6) Sorted Array: "+list);
         int secondLarg = list.get(0);
         for(int i = list.size()-2;i>0;i++){
             if(secondLarg!=max){
                 secondLarg=list.get(i);
                 break;
             }
         }
         
        System.out.println("7) second Largest Element in Array: "+secondLarg);
         
         
         

        
        
    }
}