package Pattern1.Pattern1ProblematicCode;
import java.util.List;
import java.util.ArrayList;

public class Product {
    private String name;
    private String desc;
    private int prize;
    private String brand;
    private String categary;
    private int discount;
    private String createdAt;
    private String updatedAt;
    private List<String> images;

    Product(String name, String desc, int prize, String brand, String categary, int discount, String createdAt, String updatedAt, ArrayList<String> images){
        this.name = name;
        this.desc = desc;
        this.prize = prize;
        this.brand = brand;
        this.categary = categary;
        this.discount = discount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.images = images;



    }

    
}
