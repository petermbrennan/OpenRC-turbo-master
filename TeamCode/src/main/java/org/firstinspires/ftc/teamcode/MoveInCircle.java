package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;


@Autonomous(name="Move In Circle", group="DriveBot")
public class MoveInCircle extends LinearOpMode {
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

        // wait 2 seconds
        sleep(2000);

        // turn the drive motors off
        robot.leftMotor.setPower(DriveBot.STOP_POWER);
        robot.rightMotor.setPower(DriveBot.STOP_POWER);
//turn
        robot.rightMotor.setPower(DriveBot.FULL_POWER);
        robot.leftMotor.setPower(-DriveBot.FULL_POWER);
        sleep(1000);
        robot.rightMotor.setPower(DriveBot.STOP_POWER);

        // turn the drive motors on
        robot.leftMotor.setPower(DriveBot.SLOW_POWER);
        robot.rightMotor.setPower(DriveBot.SLOW_POWER);

        // wait 2 seconds
        sleep(2000);

        // turn the drive motors off
        robot.leftMotor.setPower(DriveBot.STOP_POWER);
        robot.rightMotor.setPower(DriveBot.STOP_POWER);
//turn
        robot.rightMotor.setPower(DriveBot.FULL_POWER);
        robot.leftMotor.setPower(-DriveBot.FULL_POWER);
        sleep(1000);
        robot.rightMotor.setPower(DriveBot.STOP_POWER);

        // turn the drive motors on
        robot.leftMotor.setPower(DriveBot.SLOW_POWER);
        robot.rightMotor.setPower(DriveBot.SLOW_POWER);

        // wait 2 seconds
        sleep(2000);

        // turn the drive motors off
        robot.leftMotor.setPower(DriveBot.STOP_POWER);
        robot.rightMotor.setPower(DriveBot.STOP_POWER);
//turn
        robot.rightMotor.setPower(DriveBot.FULL_POWER);
        robot.leftMotor.setPower(-DriveBot.FULL_POWER);
        sleep(1000);
        robot.rightMotor.setPower(DriveBot.STOP_POWER);

        // turn the drive motors on
        robot.leftMotor.setPower(DriveBot.SLOW_POWER);
        robot.rightMotor.setPower(DriveBot.SLOW_POWER);

        // wait 2 seconds
        sleep(2000);

        // turn the drive motors off
        robot.leftMotor.setPower(DriveBot.STOP_POWER);
        robot.rightMotor.setPower(DriveBot.STOP_POWER);
//turn
        robot.rightMotor.setPower(DriveBot.FULL_POWER);
        robot.leftMotor.setPower(-DriveBot.FULL_POWER);
        sleep(1000);
        robot.rightMotor.setPower(DriveBot.STOP_POWER);



    }
}

