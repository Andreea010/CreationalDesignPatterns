package demo.builder;

public class Computer {

    public static class Builder {
        private String modelCode;
        private String color;
        private String weight;
        private String dimensions;

        public Builder() {
        }

        public Computer build() {
            return new Computer(this);
        }

        public Builder modelCode(String modelCode) {
            this.modelCode = modelCode;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder weight(String weight) {
            this.weight = weight;
            return this;
        }

        public Builder dimensions(String dimensions) {
            this.dimensions = dimensions;
            return this;
        }


    }

    private String modelCode;
    private String color;
    private String weight;
    private String dimensions;

    private Computer(Builder builder) {
        this.modelCode = builder.modelCode;
        this.color = builder.color;
        this.weight = builder.weight;
        this.dimensions = builder.dimensions;
    }

    public String getModelCode() {
        return modelCode;
    }

    public String getColor() {
        return color;
    }

    public String getWeight() {
        return weight;
    }

    public String getDimensions() {
        return dimensions;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Description: ").append('\n');
        sb.append("Model Code = ").append(modelCode).append('\n');
        sb.append("Color = ").append(color).append('\n');
        sb.append("Weight = ").append(weight).append('\n');
        sb.append("Dimensions = ").append(dimensions);
        return sb.toString();
    }
}
