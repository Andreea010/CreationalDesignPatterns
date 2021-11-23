package demo.models.structures.store;

public abstract class Store {
    protected DescriptionAPI descriptionAPI;

    protected Store(DescriptionAPI descriptionAPI) {
        this.descriptionAPI = descriptionAPI;
    }

    public abstract void description();
}
