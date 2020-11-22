package fundamentals.coderecap.streams.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MiniApplication {

    public static void main(String[] args) {

        Item firstItem = new Item() {
            @Override
            public double getWeight() {
                return 15.6;
            }

            @Override
            public String getName() {
                return "pencil";
            }
        };

        Item secondItem = new Item() {
            @Override
            public double getWeight() {
                return 12.22;
            }

            @Override
            public String getName() {
                return "chicken";
            }
        };

        List<Item> itemList = new ArrayList<>();
        itemList.add(firstItem);

        Backpack backpack = new Backpack();
        backpack.setItemList(itemList);

        backpack.setMaxWeight(50);
        backpack.addItem(secondItem);

        System.out.println(backpack.getItemByName("chicken").getName() );

        System.out.println(backpack.getItemList().stream().map(Item::getName).collect(Collectors.joining(",")) );
    }

}










