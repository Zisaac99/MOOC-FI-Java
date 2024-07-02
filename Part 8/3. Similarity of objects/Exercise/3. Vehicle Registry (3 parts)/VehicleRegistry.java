import java.util.*;

public class VehicleRegistry{
    private HashMap<LicensePlate,String> hm;

    public VehicleRegistry(){
        this.hm = new HashMap<LicensePlate,String>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        if(this.hm.containsKey(licensePlate)){
            return false;
        }

        this.hm.put(licensePlate,owner);
        return true;
    }

    public String get(LicensePlate licensePlate){
        return this.hm.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate){
        if(this.hm.containsKey(licensePlate)){
            this.hm.remove(licensePlate);
            return true;
        }

        return false;
    }

    public void printLicensePlates(){
        for(LicensePlate lp: this.hm.keySet()){
            System.out.println(lp);
        }
    }

    public void printOwners(){
        ArrayList<String> owners = new ArrayList<String>();
        for(String s: this.hm.values()){
            if(owners.contains(s)){
                continue;
            }

            System.out.println(s);
            owners.add(s);
        }
    }
}