package demo.models.structures.registry;

public class IDNumber extends StockDecorator {

    public IDNumber(Stock customStock) {
        super(customStock);
    }

    public String make() {
        return customStock.make() + addIDName();
    }

    private String addIDName() {
        return "\n" + "ID Number          | " + "1                " + "2     |";
    }
}
