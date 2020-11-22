package fundamentals.coderecap.streams.shop;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AppShop {
    public static void main(String[] args) {

        List<Item> items = Arrays.asList(
                new Item("apple", 10, new Double(9D)),
                new Item("banana", 20, new Double(19.99)),
                new Item("orange", 10, new Double(29.99)),
                new Item("watermelon", 10, new Double(29.99)),
                new Item("papaya", 20, new Double(9.99)),
                new Item("apple", 10, new Double(9.99)),
                new Item("banana", 10, new Double(19.99)),
                new Item("apple", 20, new Double(9.99))
        );

        Map<String, Long> sortedItems = items.stream()
                .collect(Collectors.groupingBy(item -> item.getName(), Collectors.counting()));

        System.out.println(sortedItems);

        Map<String, Integer> sortedItemsByQuantity = items.stream()
                .collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQuantity)));

        System.out.println(sortedItemsByQuantity);





    }
}
