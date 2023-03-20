import java.util.ArrayList;

public class ShippingTest {
  public static void main(String[] args) {
    // ---- TESTING PART A ----
    System.out.println("---- TESTING PART A ----");
    ShippingItem myItem = new ShippingItem(10);
    System.out.println(myItem.getCost());

    // ---- TESTING PART B ----
    System.out.println("---- TESTING PART B ----");
    ShippingItem insItem = new InsuredShippingItem(10, 50);
    System.out.println(insItem instanceof InsuredShippingItem);
    
    // ---- TESTING PART C ----
    System.out.println("---- TESTING PART C ----");
    ShippingItem newItem = new InsuredShippingItem(10, 50);
    System.out.println(newItem.getCost());
    
    // ---- TESTING PART D ----
    System.out.println("---- TESTING PART D ----");
    ArrayList<ShippingItem> itemList = new ArrayList<>();
    itemList.add(new ShippingItem(10));
    itemList.add(new InsuredShippingItem(20, 50));
    itemList.add(new ShippingItem(30));
    itemList.add(new InsuredShippingItem(50, 70));
    
    /* MISSING CODE, TO BE WRITTEN IN PART D */
    // determine the total cost of all 4 items in itemList;
    // if the item is an InsuredShippingItem, add an additional 30
    // dollars of insurance BEFORE adding its costs to the total.
    // (there is a addMoreInsurance method for this purpose)

    // add your code here
    double totalCost = 0;
    for (ShippingItem item : itemList) {
      if (item instanceof InsuredShippingItem) {
        InsuredShippingItem itemTemp = (InsuredShippingItem) item;
        itemTemp.addMoreInsurance(30);
      }
      totalCost += item.getCost();
    }
    // This should print 345.0 if your code is correct
    System.out.println(totalCost);
  }
}