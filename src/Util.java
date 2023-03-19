import java.util.ArrayList;
import java.util.HashMap;

public class Util {
    
    public void printList(ArrayList<Warehouse> arr) {
        for (Object o : arr) {
            System.out.println(o);
        }
    }

    public void printHashMap(HashMap<Integer, Item> itemsHM) {
        itemsHM.forEach((key, value) -> System.out.println(value));
    }

    public void setNamesByIdMap(ArrayList<Warehouse> warehouseList, HashMap<Integer, Item> itemsHM) {
        for (Warehouse whk : warehouseList) {
            int id = whk.getItemId();
            if (itemsHM.containsKey(id)) {
                Item p = itemsHM.get(id);
                whk.setItemName(p.getName());
            }
        }
    }
}
