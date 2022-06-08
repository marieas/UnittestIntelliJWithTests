import java.util.List; //namespaces ikke using men import
import java.util.ArrayList;

public class Person {

    private String name;
    public List<Organ> Organs;

    public String getName() //properties er ikke likt i java, kan skrives på denne måten
    {
        return this.name;
    }
    public void setName(String name) {this.name = name;}

    public Person(){

    }
    public void EatFood(String foodToEat)
    {
        var stomack = GetStomack();
        stomack.AddItemToStomack(foodToEat);
    }

    public Stomack GetStomack()
    {
        //En foreach type løkke i java ser slik ut
        if(Organs == null)
            return null;
       for(var organ : Organs)
       {
           if(organ.OrganName == "Stomack")
           {
               return (Stomack)organ;
           }
       }
       return null;
    }
    public void PersonIsBorn(){
        Organs = new ArrayList<Organ>();
        Organs.add(new Organ("Kidney"));
        Organs.add(new Organ("Kidney"));
        Organs.add(new Organ("Heart"));
        Organs.add(new Organ("Liver"));
        Organs.add(new Organ("Guts"));
        Organs.add(new Stomack());
    }

}
