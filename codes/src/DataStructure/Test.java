package DataStructure;

/**
 * Created by Jordan Duan on 3/3/2017.
 */
public class Test {

    @org.junit.Test
   public void testMyTable()
   {
       MyHashTable<String,String> table = new MyHashTable<>();
           table.put("James","duan");
           table.put("Jiachen","duan");


       System.out.println(table.get("James"));
       System.out.println(table.get("Jiachen"));
   }
}
