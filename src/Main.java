import java.util.*;

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

        // Zadanie 3

        Item i6 = new Item(6, "Item6");
        Item i7 = new Item(7, "Item7");
        Item i8 = new Item(8, "Item8");
        Item i9 = new Item(9, "Item9");
        Item i10 = new Item(10, "Item10");

        items.add(i6);
        items.add(i7);
        items.add(i8);
        items.add(i9);
        items.add(i10);

        List<Item> itemSubList = items.subList(0, 4);
        HashSet<Item> itemHashSet = new HashSet<>();
        for (Item o : itemSubList)
            itemHashSet.add(o);
    }
}