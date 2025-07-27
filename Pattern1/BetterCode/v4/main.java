package Pattern1.BetterCode.v4;

public class main {
     public static void main(String[] args) {
        Product p = Product.getBuilder()
                            .setName("Iphone")
                            .setPrice(1000)
                            .setBrand("Apple")
                            .setDesc("New apple iphone")
                            .setCategory("Mobile")
                            .build();
    }
    
}
