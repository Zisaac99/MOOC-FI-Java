import java.util.*;
import java.util.stream.*;

public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor(){
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }

    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }

    public List<Integer> readings(){
        return this.readings;
    }

    @Override
    public boolean isOn(){
        for(Sensor s: this.sensors){
            if(!s.isOn()){
                return false;
            }
        }

        return true;
    }

    @Override
    public void setOn(){
        for(Sensor s: this.sensors){
            s.setOn();
        }
    }

    @Override
    public void setOff(){
        for(Sensor s: this.sensors){
            s.setOff();
        }
    }

    @Override
    public int read(){
        if(!isOn() || this.sensors.size() == 0){
            throw new IllegalStateException("Average Sensor must be on and not empty!");
        }
        
        int sum = 0;
        for(Sensor s: this.sensors){
            sum += s.read();
        }

        int avgTemp = sum / this.sensors.size();
        this.readings.add(avgTemp);
        return avgTemp;
    }

}
