package com.github.curriculeon;

import java.util.*;

/**
 * Created by leon on 12/16/2019.
 *
 *
 *
 */

public class GenericInventory<SomeType> implements InventoryInterface<SomeType>, Iterable<SomeType>{
    private List<SomeType> arrayList = new ArrayList<>();
    @Override
    public void add(SomeType someObject) {
        arrayList.add(someObject);
    }

    @Override
    public Boolean contains(SomeType someObject) {
        return arrayList.contains(someObject);
    }

    @Override
    public SomeType get(int indexOfElement) {
        return  arrayList.get(indexOfElement);
    }

    @Override
    public SomeType remove(int indexOfElement) {
        return arrayList.remove(indexOfElement);
    }

    @Override
    public SomeType[] toArray(SomeType[] objectsToBeAdded) {
        arrayList.clear();
        arrayList.addAll(Arrays.asList(objectsToBeAdded));
        return (SomeType[]) arrayList.toArray();
    }

    @Override
    public Iterator<SomeType> iterator() {
        return null;
    }
}
