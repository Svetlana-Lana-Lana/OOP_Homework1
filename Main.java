
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Product> coldDrinks = new ArrayList<>();
        coldDrinks.add(new BottleOfWater("BonAqua", 50, 500));
        coldDrinks.add(new BottleOfWater("Святой источник", 60, 1000));
        coldDrinks.add(new BottleOfWater("ФруттоНяня", 40, 250));
        System.out.println(coldDrinks);
        BottleOfWaterVendingMachine coldDr = new BottleOfWaterVendingMachine(coldDrinks);
        coldDr.initProduct(coldDrinks);
        System.out.println(coldDr.getProduct("BonAqua", 500));

        List<Product> hotDrinks = new ArrayList<>();
        hotDrinks.add(new HotDrink("сappuccino", 200, 70));
        hotDrinks.add(new HotDrink("tea", 150, 80));
        hotDrinks.add(new HotDrink("hot chocolate", 250, 60));
        System.out.println(hotDrinks);
        HotDrinkVendingMachine hotDr = new HotDrinkVendingMachine(hotDrinks);
        hotDr.initProduct(hotDrinks);
        System.out.println(hotDr.getProduct("tea", 80));
       
    }

   
}
