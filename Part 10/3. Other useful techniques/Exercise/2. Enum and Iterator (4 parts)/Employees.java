import java.util.*;
import java.util.stream.*;

public class Employees{
    private List<Person> employees;

    public Employees(){
        this.employees = new ArrayList<Person>();
    }

    public void add(Person personToAdd){
        this.employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd){
        this.employees.addAll(peopleToAdd);
    }

    public void print(){
        this.employees.stream().forEach(p -> System.out.println(p));
    }

    public void print(Education education){
        this.employees.stream().filter(p -> p.getEducation() == education).forEach(p -> System.out.println(p));
    }

    public void fire(Education education){
        Iterator<Person> itr = this.employees.iterator();

        while(itr.hasNext()){
            if(itr.next().getEducation() == education){
                itr.remove();
            }
        }
    }
}