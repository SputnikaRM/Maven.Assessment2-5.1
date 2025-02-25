package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    LinkedHashMap<String,String> list=new LinkedHashMap<>();


    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {


    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {



    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item){return ;}


    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        return;
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        return null;
    }
}
