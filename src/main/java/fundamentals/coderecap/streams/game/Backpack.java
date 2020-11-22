package fundamentals.coderecap.streams.game;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class Backpack {

    private List<Item> itemList;
    private double maxWeight;

    public Backpack(){}

    public Backpack(List<Item> itemList, double maxWeight) {
        this.itemList = itemList;
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if(canAddItem(item))
            itemList.add(item);
    }

    public boolean canAddItem(Item item) {
        double totalWeight = itemList.stream().map(Item::getWeight).reduce(0D, Double::sum);

        return totalWeight + item.getWeight() <= maxWeight;
    }

    public Item getItemByName(String itemName) {
        Optional<Item> item = itemList.stream().filter(t -> t.getName().equals(itemName)).findFirst();

        return item.orElseGet(() -> new Item() {
            @Override
            public double getWeight() {
                return 0;
            }

            @Override
            public String getName() {
                return "default!";
            }
        });
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }



}












