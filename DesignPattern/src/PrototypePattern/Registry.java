package PrototypePattern;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<ItemType, Item> itemMap = new HashMap<>();

    public Registry() {
        this.initialize();
    }

    private void initialize() {
        MobilePhone mobilePhone = new MobilePhone();
        mobilePhone.setPrice(50000.00);
        mobilePhone.setCategory("Samsung");
        mobilePhone.setCamera("48MP");

        Computer computer = new Computer();
        computer.setPrice(350000.00);
        computer.setCategory("Asus");
        computer.setType("Laptop");

        itemMap.put(ItemType.PHONE, mobilePhone);
        itemMap.put(ItemType.COMPUTER, computer);
    }

    public Item getItem(ItemType itemType) {
        Item item = null;
        try {
            item = (Item) itemMap.get(itemType).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }
}
