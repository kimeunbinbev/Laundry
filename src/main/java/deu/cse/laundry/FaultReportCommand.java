package deu.cse.laundry;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FaultReportCommand implements Command {
    private WashingMachineManagement management;
    private int machineIndex;

    public FaultReportCommand(WashingMachineManagement management, int machineIndex) {
        this.management = management;
        this.machineIndex = machineIndex;
    }

    @Override
    public void execute() {
        management.reportFault(machineIndex);
    }
}