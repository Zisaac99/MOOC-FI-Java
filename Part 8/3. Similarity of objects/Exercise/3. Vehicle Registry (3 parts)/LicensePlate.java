import java.util.*;

public class LicensePlate {

    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }

        if(!(object instanceof LicensePlate)){
            return false;
        }

        LicensePlate LPObject = (LicensePlate) object;
        if(this.liNumber.equals(LPObject.liNumber) && this.country.equals(LPObject.country)){
            return true;
        }

        return false;
    }

    @Override
    public int hashCode(){
        if(this.liNumber == null){
            return this.country.hashCode();
        }

        if(this.country == null){
            return this.liNumber.hashCode();
        }

        if(this.liNumber != null && this.country != null){
            return this.liNumber.hashCode() + this.country.hashCode();
        }

        return 1;
    }
}