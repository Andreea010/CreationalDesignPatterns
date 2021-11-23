package demo.models.structures.registry;

public class ItemQuantity extends StockDecorator {

    public ItemQuantity(Stock customStock) {
        super(customStock);
    }

    public String make() {
        return customStock.make() + addItemQuantity();
    }

    private String addItemQuantity() {
        return "\n" + "Item Quantity      | " + "34               " + "6     |" + "\n";
    }
}
