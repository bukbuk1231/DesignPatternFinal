package part2_chain_of_responsibility;

public class Driver {

    public static void main(String[] args) {
        Employee partCollector = new PartCollector();
        Employee assembler = new Assembler();
        Employee welder = new Welder();
        Employee painter = new Painter();

        partCollector.setNextEmployee(assembler);
        assembler.setNextEmployee(welder);
        welder.setNextEmployee(painter);
        painter.setNextEmployee(null);

        partCollector.doWork(4, "Hello");
    }
}
