package demo.models.structures.registry;

public abstract class StockDecorator implements Stock {
    protected Stock customStock;

    public StockDecorator(Stock customStock) {
        this.customStock = customStock;
    }

    public String make() {
        return customStock.make();
    }
}
