package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


@Autonomous(name="Move 20 cm", group="DriveBot")
public class Move20Cm extends LinearOpMode {

    DriveBot robot = null;

    @Override
    public void runOpMode() throws InterruptedException {

        // initialize the hardware
        robot = new DriveBot(hardwareMap);

        // wait for the user to press the START button
        waitForStart();

        robot.leftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.leftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.rightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.rightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
//
        robot.leftMotor.setTargetPosition(robot.convertDegreesToTicks(60));
        robot.rightMotor.setTargetPosition(robot.convertDegreesToTicks(-60));
//
        robot.leftMotor.setPower(0.25);
        robot.rightMotor.setPower(0.25);

        while(robot.leftMotor.isBusy() && opModeIsActive()){
            idle();
        }

        robot.leftMotor.setPower(DriveBot.STOP_POWER);
        robot.rightMotor.setPower(DriveBot.STOP_POWER);
    }
}
