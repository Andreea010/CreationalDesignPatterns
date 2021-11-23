package demo.models.specs.processor;

import demo.abstractfactory.ProcessorFactory;
import demo.models.specs.Computer;
import demo.models.specs.manufacturer.HPcomputer;
import demo.models.specs.manufacturer.Manufacturer;

public class AMDprocessor implements ProcessorFactory {

    public Computer create(Manufacturer manufacturer) {

        switch (manufacturer) {
            case HP:
                return new HPcomputer();
            default:
                return null;
        }
    }
}
