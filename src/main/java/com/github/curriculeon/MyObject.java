package com.github.curriculeon;

public class MyObject implements Runnable {
        @Override
        public void run() {
            ItemInventory itemInventory = new ItemInventory();
            itemInventory.add(null);
            itemInventory.add(null);
            itemInventory.add(null);
            itemInventory.add(null);
            itemInventory.add(null);
            itemInventory.add(null);
            for(Item item : itemInventory) {

            }
        }
    }

