package demo.abstractfactory;

import demo.models.specs.processor.AMDprocessor;
import demo.models.specs.processor.INTELprocessor;
import demo.models.specs.processor.Processor;

public class ComputerAbstractFactory {

    public static ProcessorFactory getFactory(Processor processor) {

        switch (processor) {
            case AMD:
                return new AMDprocessor();
            case INTEL:
                return new INTELprocessor();
            default:
                return null;
        }
    }
}