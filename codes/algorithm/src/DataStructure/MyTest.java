package DataStructure;

public class MyTest
{

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