package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

/**
 * Move the robot forward for 2 seconds.
 *
 * @author J. Hollingsworth
 */

@Autonomous(name="Move 2 Seconds", group="DriveBot")
public class Move2Seconds extends LinearOpMode {

    DriveBot robot = null;

    @Override
    public void runOpMode() throws InterruptedException {

        // initialize the hardware
        robot = new DriveBot(hardwareMap);

        // wait for the user to press the START button
        waitForStart();

        // turn the drive motors on
        robot.leftMotor.setPower(DriveBot.SLOW_POWER);
        robot.rightMotor.setPower(DriveBot.SLOW_POWER);

        // wait .5 seconds
        sleep(500);

        // turn the drive motors off
        robot.leftMotor.setPower(DriveBot.STOP_POWER);
        robot.rightMotor.setPower(DriveBot.STOP_POWER);

    }
}
