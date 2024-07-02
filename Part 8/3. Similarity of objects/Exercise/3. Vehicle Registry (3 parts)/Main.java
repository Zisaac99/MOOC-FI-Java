import java.util.*;

public class Main{
    public static void main(String[] args){
        // LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        // LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        // LicensePlate li3 = new LicensePlate("D", "B WQ-431");

        // ArrayList<LicensePlate> finnishPlates = new ArrayList<>();
        // finnishPlates.add(li1);
        // finnishPlates.add(li2);

        // LicensePlate newLi = new LicensePlate("FI", "ABC-123");
        // if (!finnishPlates.contains(newLi)) {
        //     finnishPlates.add(newLi);
        // }
        // System.out.println("finnish: " + finnishPlates);
        // // if the equals-method hasn't been overwritten, the same license number will be added to the list againg

        // HashMap<LicensePlate, String> owners = new HashMap<>();
        // owners.put(li1, "Arto");
        // owners.put(li3, "Jürgen");

        // System.out.println("owners:");
        // System.out.println(owners.get(new LicensePlate("FI", "ABC-123")));
        // System.out.println(owners.get(new LicensePlate("D", "B WQ-431")));
        // // if the hasCode-method hasn't been overwritten, the owners won't be found

        VehicleRegistry VR = new VehicleRegistry();
        VR.add(new LicensePlate("FI", "ABC-123"),"Arthur");
        VR.add(new LicensePlate("FI", "ABC-123"),"Blax");
        VR.add(new LicensePlate("SI", "ABC-123"),"Arthur");
        VR.add(new LicensePlate("VI", "ABC-133"),"Otto");
        VR.add(new LicensePlate("XI", "ABC-144"),"Joshua");

        VR.remove(new LicensePlate("XI", "ABC-144"));

        VR.printLicensePlates();
        VR.printOwners();
    }
}