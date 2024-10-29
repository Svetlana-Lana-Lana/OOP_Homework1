//import java.util.ArrayList;
import java.util.List;

public interface VendingMachine {
    
    public void initProduct(List<Product>productList);
    public Product getProduct(String name);   

}
