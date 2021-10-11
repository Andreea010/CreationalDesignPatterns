package demo.abstractfactory;

import demo.models.specs.Computer;
import demo.models.specs.manufacturer.Manufacturer;

public interface ProcessorFactory {

    Computer create(Manufacturer manufacturer);
}
