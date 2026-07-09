// Write a program to find the total number of occurrences of a word inside a Statement.

// Eg. “people love to love people”
// Output : people : 2
// love:  2
// to : 1
import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str=str.trim();
        LinkedHashMap<String,Integer>map =new LinkedHashMap<>();
        for(String s : str.split("\\s+")){
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for(String key : map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }
    }
}
