import java.util.ArrayList;
import java.util.List;
public class Stomack extends Organ {
    public List<String> ItemsInStomack;

    Stomack() {
        super("Stomack"); // når man sender verdi til base constructoren
        ItemsInStomack = new ArrayList<String>();
    }

    public void AddItemToStomack(String foodItem)
    {
        ItemsInStomack.add(foodItem);
    }
}

