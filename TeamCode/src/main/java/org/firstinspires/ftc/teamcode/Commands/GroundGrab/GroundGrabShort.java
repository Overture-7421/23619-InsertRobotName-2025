package org.firstinspires.ftc.teamcode.Commands.GroundGrab;

import org.firstinspires.ftc.teamcode.Commands.Arm.MoveArm;
import org.firstinspires.ftc.teamcode.Commands.Elevator.ElevatorPositions;
import org.firstinspires.ftc.teamcode.Subsystems.Arm;
import org.firstinspires.ftc.teamcode.Subsystems.Constants;
import org.firstinspires.ftc.teamcode.Subsystems.Elevator;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;
import com.arcrobotics.ftclib.command.WaitUntilCommand;


public class GroundGrabShort extends SequentialCommandGroup {

    public GroundGrabShort(Arm arm, Elevator elevator){
        addCommands(
                //new MoveArm(arm, 20).withTimeout(500),
                new ElevatorPositions(elevator, 10).withTimeout(500),
                new MoveArm(arm, Constants.Arm.ARM_SHORT_GROUNDGRAB).withTimeout(500),
                new ElevatorPositions(elevator, Constants.Elevator.ELEVATOR_SHORT_GROUNDGRAB).withTimeout(1500)
        );
    }

}