package org.firstinspires.ftc.teamcode.Commands.Chambers;
import org.firstinspires.ftc.teamcode.Commands.Arm.MoveArm;
import org.firstinspires.ftc.teamcode.Commands.StowAll;
import org.firstinspires.ftc.teamcode.Subsystems.Arm;
import org.firstinspires.ftc.teamcode.Subsystems.Constants;
import org.firstinspires.ftc.teamcode.Subsystems.Elevator;

import com.arcrobotics.ftclib.command.ParallelCommandGroup;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import com.arcrobotics.ftclib.command.WaitCommand;
import org.firstinspires.ftc.teamcode.Commands.Elevator.ElevatorPositions;

public class HighChamber extends SequentialCommandGroup {

    public HighChamber (Arm arm, Elevator elevator){
        addCommands(
                new MoveArm(arm, Constants.Arm.ARM_HIGHCHAMBER).withTimeout(500),
                new WaitCommand(2500),
                new ElevatorPositions(elevator,15).withTimeout(400),
                new WaitCommand(1500),
                new MoveArm(arm, Constants.Arm.ARM_HIGHCHAMBER-15).withTimeout(500),
                new WaitCommand(1000),
                new StowAll(arm, elevator)
        );


    }

}
