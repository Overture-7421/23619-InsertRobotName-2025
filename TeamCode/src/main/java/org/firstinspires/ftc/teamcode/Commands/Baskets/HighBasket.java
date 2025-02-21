package org.firstinspires.ftc.teamcode.Commands.Baskets;
import com.arcrobotics.ftclib.command.SequentialCommandGroup;

import org.firstinspires.ftc.teamcode.Commands.Arm.MoveArm;
import org.firstinspires.ftc.teamcode.Commands.Wrist.MoveWrist;
import org.firstinspires.ftc.teamcode.Subsystems.Arm;
import org.firstinspires.ftc.teamcode.Subsystems.Constants;
import org.firstinspires.ftc.teamcode.Subsystems.Elevator;
import org.firstinspires.ftc.teamcode.Commands.Elevator.ElevatorPositions;
import org.firstinspires.ftc.teamcode.Subsystems.Wrist;


public class HighBasket extends SequentialCommandGroup {

    public HighBasket ( Arm arm, Elevator elevator, Wrist wrist){

        addCommands(
                new MoveArm(arm, Constants.Arm.ARM_HIGHBASKET).withTimeout(1500),
                new MoveWrist(wrist, Constants.Wrist.WRIST_LONG).withTimeout(500),
                new ElevatorPositions(elevator, Constants.Elevator.ELEVATOR_HIGHBASKET).withTimeout(1500),
                new MoveWrist(wrist, Constants.Wrist.WRIST_MEDIUM).withTimeout(500)
        );

    }
}