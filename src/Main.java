import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Item i1 = new Item(1, "Item1");
        Item i2 = new Item(2, "Item2");
        Item i3 = new Item(3, "Item3");
        Item i4 = new Item(4, "Item4");
        Item i5 = new Item(5, "Item5");

        ArrayList<Item> items = new ArrayList<>();

        items.add(i1);
        items.add(i2);
        items.add(i3);
        items.add(i4);
        items.add(i5);

        items.get(0).show();
        items.get(1).show();
        items.get(2).show();
        items.get(3).show();
        items.get(4).show();

        HashMap<Integer, String> itemHashMap = new HashMap();
        for (Item o : items)
            itemHashMap.put(o.id, o.name);

        for (Map.Entry<Integer, String> entry : itemHashMap.entrySet())
            System.out.printf("%d, %s\n", entry.getKey(), entry.getValue());
    }
}