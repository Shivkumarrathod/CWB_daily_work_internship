import java.util.ArrayList;
 
public class ListExample {
 
    public static void main(String[] args) {
        //List,Set,Map
        //List is a ordered Collection
        //List is a interface in java
        //Many List types are ArrayList,LinkedList,Vector
        ArrayList<String> countries=new ArrayList<>();
        countries.add("India");
        countries.add("Pakisthan");
        countries.add("China");
        countries.add("USA");
 
        System.out.println(countries);
        for(int i=0;i<countries.size();i++)
            System.out.println(countries.get(i));
 
 
        countries.forEach(data->{
            System.out.println(data);
        });    
 
    }
 
}