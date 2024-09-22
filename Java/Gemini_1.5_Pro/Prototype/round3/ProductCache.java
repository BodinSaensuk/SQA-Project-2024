// Abstract Prototype (Interface)
interface Prototype extends Cloneable {
    Prototype clone();
    void display();
}

// Concrete Prototype (Product)
class Product implements Prototype {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public   
 Prototype clone() {
        try {
            return (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported.", e);
        }
    }

    @Override
    public void display() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }
}

// Prototype Manager (ProductCache)
class ProductCache {
    private static HashMap<String, Prototype> productMap = new HashMap<>();

    public static Prototype getProduct(String productId) {
        Prototype cachedProduct = productMap.get(productId);
        return cachedProduct.clone();
    }

    public static void loadCache() {
        Product laptop = new Product("Laptop", 1200.0);
        productMap.put("1", laptop);

        Product phone = new Product("Smartphone", 800.0);
        productMap.put("2", phone);
    }
}