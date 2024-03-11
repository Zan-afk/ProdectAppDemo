import java.util.ArrayList;
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();
    void addProduct(Product p){
        products.add(p);
    }

    public List<Product> getAllProducts() {

        return products;
    }

    public Product getProduct(String name) {

        for (Product p : products){
            if (p.getName().equals(name)){
                return p;
            }
        }

        return null;
    }

    public List<Product> getProducts(String place) {

        List<Product> list = new ArrayList<>();
        for (Product p : products){
            if (p.getPlace().equals(place)){
                list.add(p);
            }
        }

        return list;
    }

    public List<Product> getWarranty() {
        List<Product> list = new ArrayList<>();
        for (Product product : products){
            if (product.getWarranty() < 2022){
                list.add(product);
            }
        }
        return list;
    }

    public List<Product> getProductWithText(String text) {

        String str = text.toLowerCase();


        List<Product> list = new ArrayList<>();
        for (Product product : products){

            String name = product.getName().toLowerCase();
            String place = product.getPlace().toLowerCase();
            String type = product.getType().toLowerCase();

            if (name.contains(text) || place.contains(text) || type.contains(text)){
                list.add(product);
            }
        }
        return list;
    }
}
