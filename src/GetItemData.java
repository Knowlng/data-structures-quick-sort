import java.util.ArrayList;
import java.util.HashMap;

public class GetItemData {

  public void calculateItemData(ArrayList<Warehouse> warehouseArr, HashMap<Integer, Item> itemHashMap) {
    for (Item item : itemHashMap.values()) {
      int id = item.getId();
      double price = item.getPrice();
      int amountIn = 0;
      int amountOut = 0;

      for (Warehouse warehouse : warehouseArr) {
          if (warehouse.getItemId() == id) {
              if (warehouse.getIn_out() > 0) {
                amountIn += warehouse.getAmount();
              } else {
                amountOut += warehouse.getAmount();
              }
          }
      }

      item.setAmountIn(amountIn);
      item.setAmountOut(amountOut);
      item.setTotalPriceIn(amountIn * price);
      item.setTotalPriceOut(amountOut * price);
      item.setAmountLeft(amountIn - amountOut);
    }
  }
}
