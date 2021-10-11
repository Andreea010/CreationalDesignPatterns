package demo;

import demo.abstractfactory.ComputerAbstractFactory;
import demo.abstractfactory.ProcessorFactory;
import demo.builder.Computer;
import demo.models.specs.manufacturer.Manufacturer;
import demo.models.specs.processor.Processor;
import demo.models.actors.singleton.Staff;

public class Main {

    public static void main(String[] args) {

        ProcessorFactory factory1 = ComputerAbstractFactory.getFactory(Processor.INTEL);
        demo.models.specs.Computer asus = factory1.create(Manufacturer.ASUS);
        asus.display();

        Computer.Builder builder1 = new Computer.Builder()
                .modelCode("BR103")
                .color("Gold")
                .weight("1.8 kg")
                .dimensions("360.2 x 234.9 x 19.9 mm");
        Computer computer1 = builder1.build();
        System.out.println(computer1);

        ProcessorFactory factory2 = ComputerAbstractFactory.getFactory(Processor.AMD);
        demo.models.specs.Computer hp = factory2.create(Manufacturer.HP);
        hp.display();
        
        Computer.Builder builder2 = new Computer.Builder()
                .modelCode("EQ2025NQ")
                .color("Silver")
                .weight("1.69 kg")
                .dimensions("358.5 x 242 x 17.9 mm");
        Computer computer2 = builder2.build();
        System.out.println(computer2);

        Staff employee = Staff.getInstance();
        System.out.println("\n" + "Computer Store Staff { " + "\n" + employee.getName() + " " + employee.getSurname()
                + "\n" + "}");

    }
}

