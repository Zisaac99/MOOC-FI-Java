import java.util.*;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> hm;

    public StorageFacility(){
        this.hm = new HashMap<String, ArrayList<String>>();
    }
    
    public void add(String unit, String item){
        this.hm.putIfAbsent(unit, new ArrayList<String>());

        this.hm.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        this.hm.putIfAbsent(storageUnit, new ArrayList<String>());

        return this.hm.get(storageUnit);
    }

    public void remove(String storageUnit, String item){
        if(this.hm.get(storageUnit) == null){
            return;
        }
        
        ArrayList<String> list = this.hm.get(storageUnit);
        if(list.contains(item)){
            list.remove(item);
        }

        if(list.size() == 0){
            this.hm.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits(){
        return new ArrayList<String>(this.hm.keySet());
        // ArrayList<String> list = new ArrayList<String>();

        // for(String s: this.hm.keySet()){
        //     list.add(s);
        // }

        // return list;
    }
}