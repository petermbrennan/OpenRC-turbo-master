package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;


@Autonomous(name="Move BackWards", group="DriveBot")
public class MoveBackwards extends LinearOpMode {
    DriveBot robot = null;

    @Override
    public void runOpMode() throws InterruptedException {

        // initialize the hardware
        robot = new DriveBot(hardwareMap);

        // wait for the user to press the START button
        waitForStart();

        // turn the drive motors on
        robot.leftMotor.setPower(-DriveBot.SLOW_POWER);
        robot.rightMotor.setPower(-DriveBot.SLOW_POWER);

        // wait 2 seconds
        sleep(2000);

        // turn the drive motors off
        robot.leftMotor.setPower(DriveBot.STOP_POWER);
        robot.rightMotor.setPower(DriveBot.STOP_POWER);

    }
}

