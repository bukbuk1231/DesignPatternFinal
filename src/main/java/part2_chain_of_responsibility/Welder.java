package part2_chain_of_responsibility;

public class Welder extends Employee {

    public Welder() {
        authorityLevel = WELDER;
    }

    @Override
    protected void write(String message) {
        System.out.print(message);
        System.out.println(" All parts have been welded together");
    }
}
