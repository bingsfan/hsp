package com.smh.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * ClassName: Homework01
 * Package: com.smh.homework
 * Description:
 *
 * @Author mh sun
 * @Create 2024/4/5 13:55
 * @Version 1.0
 */
public class Homework01{
    public static void main(String[] args) {

    }
    @Test
    public void testList(){
        DAO<User> dao = new DAO<>();
        dao.save("001",new User(1,10,"jack"));
        dao.save("002",new User(2,18,"king"));
        System.out.println(dao.list());
    }
}
class DAO<T>{
   private HashMap<String,T> hashMap =new HashMap<String,T>();
   public T get(String id){
       return hashMap.get(id);
   }
   public void update(String id,T entity){
       hashMap.put(id,entity);
   }
   public List<T> list(){
       ArrayList<T> arrayList = new ArrayList<>();
       for (String key : hashMap.keySet()) {
           arrayList.add(hashMap.get(key));
       }
       return arrayList;
   }
   public void remove(String id){
       hashMap.remove(id);
   }
   public void save(String id,T entity){
       hashMap.put(id,entity );
   }
}
class User{
    private int id;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    private int age;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}