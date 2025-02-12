package coffee;

public class Main {
    public static void main(String[] args) {
        Coffee matchaLatte = new Coffee("Matcha Latte", "Latte", "Medium", 50.00, "None", "Japan", false, 10, "Steamed");
        matchaLatte.addFlavorNotes("Sweet");
        matchaLatte.addFlavorNotes("Creamy");
        matchaLatte.displayDetails();

        Coffee latte = new Coffee("Latte", "Latte", "Large", 40.00, "Medium", "Brazil", false, 5, "Espresso");
        latte.addFlavorNotes("Vanilla");
        latte.addFlavorNotes("Citrus");
        latte.displayDetails();

        Coffee mocha = new Coffee("Mocha", "latte", "Small", 30.00, "Light", "Yemen", true, 6, "Drip");
        mocha.addFlavorNotes("Sweet");
        mocha.displayDetails();
    }
}