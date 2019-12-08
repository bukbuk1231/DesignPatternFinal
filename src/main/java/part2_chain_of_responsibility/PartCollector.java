package part2_chain_of_responsibility;

public class PartCollector extends Employee {

    public PartCollector() {
        authorityLevel = PART_COLLECTOR;
    }

    @Override
    protected void write(String message) {
        System.out.print(message);
        System.out.println(" All parts have been gathered");
    }
}
