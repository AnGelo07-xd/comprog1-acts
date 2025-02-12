package coffee;

class Coffee {
    // Properties (Attributes)
    private String name;
    private String type;
    private String size;
    private double price;
    private String roastLevel;
    private String origin;
    private boolean isDecaf;
    private int stock; // Quantity available
    private String[] flavorNotes; // Fixed-size array for flavor notes
    private int flavorCount; // To keep track of the number of flavor notes
    private String brewMethod;



    // Constructor
    public Coffee(String name, String type, String size, double price, String roastLevel, String origin, boolean isDecaf, int stock, String brewMethod) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.price = price;
        this.roastLevel = roastLevel;
        this.origin = origin;
        this.isDecaf = isDecaf;
        this.stock = stock;
        this.flavorNotes = new String[5]; // Fixed size for flavor notes
        this.flavorCount = 0; // Initialize flavor count
        this.brewMethod = brewMethod;
    }

    // Method to calculate price based on size and discounts
    public double calculatePrice() {
        double discount = 0;
        if (size.equals("Medium")) {
            discount = 0.10; // 10% discount for medium
        } else if (size.equals("Large")) {
            discount = 0.15; // 15% discount for large
        }
        return price * (1 - discount);
    }

    // Method to add flavor notes
    public void addFlavorNotes(String flavor) {
        if (flavorCount < flavorNotes.length) {
            flavorNotes[flavorCount] = flavor;
            flavorCount++;
        }
    }

    // Method to display coffee details
    public void displayDetails() {
        System.out.println("Coffee Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.printf("Price: ₱%.2f%n", calculatePrice());
        System.out.println("Roast Level: " + roastLevel);
        System.out.println("Origin: " + origin);
        System.out.println("Is Decaf: " + (isDecaf ? "Yes" : "No"));
        System.out.println("Stock: " + stock);
        System.out.print("Flavor Notes: ");
        for (int i = 0; i < flavorCount; i++) {
            System.out.print(flavorNotes[i]);
            if (i < flavorCount - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Brew Method: " + brewMethod);
        System.out.println();
    }
}
