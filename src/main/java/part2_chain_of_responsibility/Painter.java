package part2_chain_of_responsibility;

public class Painter extends Employee {

    public Painter() {
        authorityLevel = PAINTER;
    }

    @Override
    protected void write(String message) {
        System.out.print(message);
        System.out.println(" Car completed");
    }
}
