package demo.models.structures.registry;

public class ItemName extends StockDecorator {

    public ItemName(Stock customStock) {
        super(customStock);
    }

    public String make() {
        return customStock.make() + addItemName();
    }

    private String addItemName() {
        return "\n" + "Items in the stock | " + "Asus VivoBook    " + "HP 15S|";
    }
}
