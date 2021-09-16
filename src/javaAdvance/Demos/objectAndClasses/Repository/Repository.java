package javaAdvance.Demos.objectAndClasses.Repository;

import java.util.HashMap;
import java.util.Map;

public class Repository {
    private Map<Integer,Person>data;
    private int Id;

    public Repository() {
        this.Id = 0;
        this.data = new HashMap<>();

    }
    public void add(Person person){
        data.put(this.Id,person);
        this.Id++;
    }
    public Person get(int Id){
        return this.data.get(Id);
    }
    public boolean update(int Id , Person newPerson){
        if (!data.containsKey(Id)){
            return false;
        }else {
            data.put(Id,newPerson);
            return true;
        }
    }
    public boolean delete(int Id){
        if (data.containsKey(Id)){
            data.remove(Id);
            return true;
        }else {
            return false;
        }
    }
    public int getCount(){
        return data.size();
    }


}
