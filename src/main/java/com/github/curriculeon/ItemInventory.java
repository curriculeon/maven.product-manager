package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by leon on 12/16/2019.
 */
public class ItemInventory implements InventoryInterface<Item>, Iterable<Item> {
    List<Item>items = new ArrayList<>();
    @Override
    public void add(Item someObject) {
    items.add(someObject);
    }

    @Override
    public Boolean contains(Item someObject) {
        return items.contains(someObject);
    }

    @Override
    public Item get(int indexOfElement) {
        return items.get(indexOfElement);
    }

    @Override
    public Item remove(int indexOfElement) {
        return items.remove(indexOfElement);
    }

    @Override
    public Item[] toArray(Item[] objectsToBeAdded) {
        return items.toArray(new Item[0]);
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }
}
