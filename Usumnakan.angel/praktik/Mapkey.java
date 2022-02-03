package praktik;


import java.util.*;

public class Mapkey {


    public static  Map<String, Integer> nameCount(List<String> names) {
        Map<String, Integer> map=new HashMap<>();
        for (String name : names) {
            if(map.get(name)==null){
                map.put(name,1);
            }else{
                int count=map.get(name);
                map.put(name,++count);
            }
        }
        return map;
    }
    public static void main(String[] args) {

         List<String> names = new LinkedList<>();
        names.add("poxos");
        names.add("petros");
        names.add("martiros");
        names.add("poxos");
        names.add("petros");
        names.add("poxos");
        names.add("poxos");
        Set<Map.Entry<String, Integer>> entries=nameCount(names).entrySet();
        for (Map.Entry<String,Integer> entry:entries){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
       }}


