import java.util.ArrayList;
import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {
    private List <BottleOfWater> bottlesOfWater = new ArrayList<>();
    private List<Product> productList;
   

    public BottleOfWaterVendingMachine(List<Product> productList) {
        this.productList = productList;
      }

    @Override
    public void initProduct(List<Product> productList){
        for (Product i : productList){
            bottlesOfWater.add((BottleOfWater)i);
        }
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }

    public BottleOfWater getProduct(String name, int volume){
        for (Product product : productList) {
            if (product instanceof BottleOfWater){
                if (product.getName().equals(name) && ((BottleOfWater)product).getVolume() == volume){
                    return (BottleOfWater) product;
                }
            }
        }
        return null;
    }

}
