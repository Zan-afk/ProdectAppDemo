import java.util.List;

public class Main {
    public static void main(String[] args) {


        ProductService service = new ProductService();


        service.addProduct(new Product("Asus Vivobook","Laptop","Brown Table",2022));
        service.addProduct(new Product("Mac Studio","computer","White Table",2024));
        service.addProduct(new Product("HDMI cable","cable","Black Drawer",2021));
        service.addProduct(new Product("C-type cable","cable","Brown Table",2021));

//------------------------------------------------------------------------------------------------

        List<Product> productsList = service.getAllProducts();
        for (Product product : productsList){
            System.out.println(product);
        }

//-------------------------------------------------------------------------------------


        Product p = service.getProduct("HDMI cable");
        System.out.println(p);

        List<Product> placeList = service.getProducts("Brown Table");

        for (Product product : placeList){
            System.out.println(product);
        }

//------------------------------------------------------------------------------------------

        List<Product> warrantyList = service.getWarranty();

        for (Product product : warrantyList){
            System.out.println(product);
        }


//------------------------------------------------------------------------------------------

        List<Product> prods = service.getProductWithText("cable");

        for (Product product : prods){
            System.out.println(product);
        }

    }
}