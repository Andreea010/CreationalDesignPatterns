package demo.models.specs.processor;

import demo.abstractfactory.ProcessorFactory;
import demo.models.specs.Computer;
import demo.models.specs.manufacturer.ASUScomputer;
import demo.models.specs.manufacturer.Manufacturer;

public class INTELprocessor implements ProcessorFactory {

    public Computer create(Manufacturer manufacturer) {

        switch (manufacturer) {
            case ASUS:
                return new ASUScomputer();
            default:
                return null;
        }
    }
}
