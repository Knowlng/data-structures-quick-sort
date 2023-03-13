import java.util.ArrayList;
import java.util.Comparator;

public class QuickSort<T> {
    
    private final Comparator<T> comparator;

    public QuickSort(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public ArrayList<T> sort(ArrayList<T> list, int low, int high) {
        int i = low, j = high;
        T pivot = list.get((low+high)/2);
        while (i <= j) {
            while (comparator.compare(list.get(i), pivot) < 0) {
                i++;
            }
            while (comparator.compare(list.get(j), pivot) > 0) {
                j--;
            }
            if (i <= j) {
                swap(list, i, j);
                i++;
                j--;
            }
        }

        if (low < j) sort(list, low, j);
        if (i < high) sort(list, i, high);
        
        return list;
    }

    private void swap(ArrayList<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
