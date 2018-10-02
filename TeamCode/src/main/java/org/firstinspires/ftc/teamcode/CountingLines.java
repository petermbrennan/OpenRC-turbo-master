package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


@Autonomous(name="Counting Lines", group="DriveBot")
public class CountingLines extends LinearOpMode {

    DriveBot robot = null;

    @Override
    public void runOpMode() throws InterruptedException {

        // initialize the hardware
        robot = new DriveBot(hardwareMap);

        //read the touch Sensor
        boolean isPressed = robot.touchSensor.isPressed();
        telemetry.addLine().addData("touchSensor", isPressed ? "ON" : "off");

        //read the color sensor
        // ......................
        int A = robot.colorSensor.alpha();
        int R = robot.colorSensor.red();
        int G = robot.colorSensor.green();
        int B = robot.colorSensor.blue();

        telemetry.addLine()
                .addData("A", "%3d", A)
                .addData("R", "%3d", R)

                .addData("G", "%3d", G)

                .addData("B", "%3d", B);

        telemetry.update();

        int highest = 3;
        int lowest = 30;
        robot = new DriveBot(hardwareMap);

        robot.leftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.leftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        robot.rightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.rightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        robot.leftMotor.setTargetPosition(robot.convertCentimetersToTicks(30));
        robot.rightMotor.setTargetPosition(robot.convertCentimetersToTicks(30));

        robot.leftMotor.setPower(0.3);
        robot.rightMotor.setPower(0.3);
        while (robot.leftMotor.isBusy() && robot.rightMotor.isBusy() && opModeIsActive()) {
            if (robot.colorSensor.alpha() > highest) {
                highest = robot.colorSensor.alpha();
            }
            if (robot.colorSensor.alpha() < lowest) {
                lowest = robot.colorSensor.alpha();
            }
        }


        robot.stop();


    }
}
