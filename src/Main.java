import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Util utility = new Util();

        ReadDataFromJSON readJson = new ReadDataFromJSON();

        System.out.println("\nData is being read from Warehouse.json");
        ArrayList<Warehouse> warehouseArr = readJson.readWarehouse("./json/Warehouse.json");

        System.out.println("\nData is being read from ItemsHM.json");
        HashMap<Integer, Item> itemHashMap = readJson.readAllItemsToHashMap("./json/Items.json");

        utility.setNamesByIdMap(warehouseArr, itemHashMap);

        System.out.println("\nCurrent Warehouse data: \n");
        utility.printList(warehouseArr);

        QuickSort<Warehouse> quickSort = new QuickSort<>(new WarehouseComparator());
        warehouseArr = quickSort.sort(warehouseArr, 0, warehouseArr.size() - 1 );

        System.out.println("\nSorted warehouse data: \n");
        utility.printList(warehouseArr);

        System.out.println("\nItem data: \n");
        GetItemData getData = new GetItemData();
        getData.calculateItemData(warehouseArr, itemHashMap);
        utility.printHashMap(itemHashMap);
    }
}