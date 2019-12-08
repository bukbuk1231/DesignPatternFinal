package part2_chain_of_responsibility;

public class Assembler extends Employee {

    public Assembler() {
        authorityLevel = ASSEMBLER;
    }

    @Override
    protected void write(String message) {
        System.out.print(message);
        System.out.println(" All parts have been put together");
    }
}
