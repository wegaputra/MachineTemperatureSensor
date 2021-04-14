package test;

import measurement.Printer;

public class TestRunner {
    public static void main(String[] args) {
        Printer printer = new Printer();
        
        System.out.println("Test Case 1");
        printer.printerAllMachineTemperatures(new double[]{35,27.4,43.5,54.8});
        System.out.println("Test Case 2");
        printer.printerAllMachineTemperatures(new double[]{41.5,40.4,24.7,39.1,35.2,53.4,43});
        System.out.println("Test Case 3");
        printer.printerAllMachineTemperatures(new double[]{22.6,55,49.4,40.6,45.2,19.6,54});
        System.out.println("Test Case 4");
        printer.printerAllMachineTemperatures(new double[]{26.8,41.8,47.3,20.9,34.7});
        System.out.println("Test Case 5");
        printer.printerAllMachineTemperatures(new double[]{19.6,39.8,49.7,31.1,55.2,45.2,41.8});
    }
}
