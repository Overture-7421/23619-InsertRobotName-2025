package org.firstinspires.ftc.teamcode.Commands.RetractExtendCommand;

import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import org.firstinspires.ftc.teamcode.Commands.Arm.MoveArm;
import org.firstinspires.ftc.teamcode.Commands.Elevator.ElevatorPositions;
import org.firstinspires.ftc.teamcode.Subsystems.Arm;
import org.firstinspires.ftc.teamcode.Subsystems.Elevator;
import org.firstinspires.ftc.teamcode.Commands.RetractExtendCommand.PositionsTable;

public class RetractArmElevator extends SequentialCommandGroup {
    public RetractArmElevator (Arm arm, Elevator elevator, PositionsTable positionsTable){
        positionsTable.Index= positionsTable.Index - 1;
        addCommands(

                new ElevatorPositions(elevator, positionsTable.getElevatorTarget(positionsTable.Index)).withTimeout(1000),
                new MoveArm(arm, positionsTable.getArmTarget(positionsTable.Index)).withTimeout(1000)
        );
    }
}