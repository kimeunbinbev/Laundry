package deu.cse.laundry;

public class ASCompleteCommand implements Command {
    private WashingMachineManagement management;

    public ASCompleteCommand(WashingMachineManagement management) {
        this.management = management;
    }

    @Override
    public void execute() {
        management.completeAS();
    }
}