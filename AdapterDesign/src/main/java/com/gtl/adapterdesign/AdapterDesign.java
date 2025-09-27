/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gtl.adapterdesign;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 20309
 */
public class AdapterDesign {

    public static void main(String[] args) {
        FoodItem foodItem = new FoodItem("FoodName","FoodRestaurant");
        GroceryItem groceryItem = new GroceryProduct("GroceryName","GroceryStore");
       List<Item> items = new ArrayList<>();
       items.add(foodItem);
//       items.add(groceryItem);  incompatible types: GroceryItem cannot be converted to Item
         items.add(new GroceryItemProduct(groceryItem));
    }
}
