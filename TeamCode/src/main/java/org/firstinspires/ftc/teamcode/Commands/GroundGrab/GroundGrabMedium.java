package org.firstinspires.ftc.teamcode.Commands.GroundGrab;

import org.firstinspires.ftc.teamcode.Commands.Arm.MoveArm;
import org.firstinspires.ftc.teamcode.Commands.Elevator.ElevatorPositions;
import org.firstinspires.ftc.teamcode.Commands.Wrist.MoveWrist;
import org.firstinspires.ftc.teamcode.Subsystems.Arm;
import org.firstinspires.ftc.teamcode.Subsystems.Constants;
import org.firstinspires.ftc.teamcode.Subsystems.Elevator;
import org.firstinspires.ftc.teamcode.Subsystems.Wrist;

import com.arcrobotics.ftclib.command.SequentialCommandGroup;


public class GroundGrabMedium extends SequentialCommandGroup {

    public GroundGrabMedium(Arm arm, Elevator elevator, Wrist wrist){
        addCommands(
                new ElevatorPositions(elevator, 10).withTimeout(500),
                new MoveArm(arm, Constants.Arm.ARM_MEDIUM_GROUNDGRAB).withTimeout(500),
                new MoveWrist(wrist, Constants.Wrist.WRIST_GROUNDGRAB_MEDIUM).withTimeout(500),
                new ElevatorPositions(elevator, Constants.Elevator.ELEVATOR_MEDIUM_GROUNDGRAB).withTimeout(1500)
        );
    }

}