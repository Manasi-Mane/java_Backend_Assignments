// 2. Write a program to sort HashMap by value.
import java.util.*;
class Main{
    public static void main(String[] args){
        HashMap<String,Integer> m = new HashMap<>();
        m.put("Apple",50);
        m.put("Orange",40);
        m.put("Banana",70);
        m.put("Mango",20);

        List<Map.Entry<String,Integer>> list = new ArrayList<>(m.entrySet());
        Collections.sort(list,(a,b)->a.getValue().compareTo(b.getValue()));

        LinkedHashMap<String,Integer> sortedMap = new LinkedHashMap<>();

        for(Map.Entry<String,Integer> entry :list){
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        for(String s : sortedMap.keySet()){
            System.out.println(s+" : "+sortedMap.get(s));
        }
    }
}