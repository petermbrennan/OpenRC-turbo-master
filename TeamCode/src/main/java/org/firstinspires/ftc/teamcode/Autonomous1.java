package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous(name="Autonomous1", group="DriveBot")
public class Autonomous1 extends LinearOpMode {

    DriveBot robot = null;

    @Override
    public void runOpMode() throws InterruptedException {

        // initialize the hardware
        robot = new DriveBot(hardwareMap);


        // wait for the user to press the START button
        waitForStart();

        moveRobot(0.5, 183);
        moveRobot(0.5, -61);
        turnRobot(0.5, 90);
        moveRobot(0.5, 183);
        turnRobot(0.5, 120);
        moveRobot(0.5, 141);
        //having some trouble with the turning past this point. Robot does not rotate all the way to face the last checkpoint
        turnRobot(0.5, 60);
        moveRobot(0.5, 122);
        turnRobot(0.5, -270);
        // for some reason it doesn't turn a full 270 degrees when this line is not here
        turnRobot(0.5, 0);

    }


    //convenience methods
    public void moveRobot(double speed, double distance) {
        robot = new DriveBot(hardwareMap);

        robot.leftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.leftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.rightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.rightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        robot.leftMotor.setTargetPosition(robot.convertCentimetersToTicks(distance));
        robot.rightMotor.setTargetPosition(robot.convertCentimetersToTicks(distance));

        robot.leftMotor.setPower(speed);
        robot.rightMotor.setPower(speed);
        //changed to include the right motor. Not sure if this is necessary.
        while (robot.leftMotor.isBusy() && robot.rightMotor.isBusy()&& opModeIsActive()) {
            idle();
        }
        robot.stop();
    }

    public void turnRobot(double speed, double degrees) {
        robot = new DriveBot(hardwareMap);

        robot.leftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.leftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.rightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.rightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        robot.leftMotor.setTargetPosition(robot.convertDegreesToTicks(-degrees));
        robot.rightMotor.setTargetPosition(robot.convertDegreesToTicks(degrees));

        robot.leftMotor.setPower(speed);
        robot.rightMotor.setPower(speed);

        //changed to include the right motor. Not sure if this is necessary.
        while (robot.leftMotor.isBusy() && robot.rightMotor.isBusy() && opModeIsActive()) {
            idle();
        }
        robot.stop();
    }
}