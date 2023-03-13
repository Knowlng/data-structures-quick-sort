import java.util.Comparator;

public class WarehouseComparator implements Comparator<Warehouse> {

    @Override
    public int compare(Warehouse o1, Warehouse o2) {
        int nameCompare = o1.getItemName().compareTo(o2.getItemName());

        if (nameCompare == 0) {
            return Integer.compare(o2.getIn_out(), o1.getIn_out());
        } else {
            return nameCompare;
        }
    }
}
