package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.util.Range;


public class DriveBot {
    /**
     * convenience methods
     */
    public static final double STOP_POWER = 0.0;
    public static final double SLOW_POWER = 0.2;
    public static final double FULL_POWER = 1.0;

    /**
     * motors
     */
    public DcMotor rightMotor = null;
    public DcMotor leftMotor = null;

    /**
     * sensors
     */

    public TouchSensor touchSensor = null;
    public ColorSensor colorSensor = null;

    /**
     * Constructor that initializes the robot.
     */
    public DriveBot(HardwareMap hardwareMap) {

        // map the motors to hardware
        leftMotor = hardwareMap.get(DcMotor.class, "motorL");
        rightMotor = hardwareMap.get(DcMotor.class, "motorR");

        // one motor needs to be reversed since they are mounted in opposite directions
        leftMotor.setDirection(DcMotor.Direction.REVERSE);
        rightMotor.setDirection(DcMotor.Direction.FORWARD);


        // setup the sensors  to hardware
        touchSensor = hardwareMap.get(TouchSensor.class, "touchSensor");
        colorSensor = hardwareMap.get(ColorSensor.class, "colorSensor");



}


    /**
     * start, stop convenience methods to run/stop the robot
     */
    public void stop() {
        leftMotor.setPower(STOP_POWER);
        rightMotor.setPower(STOP_POWER);
    }

    public void start(double power) {
        power = Range.clip(power, 0.0, 1.0);
        leftMotor.setPower(power);
        rightMotor.setPower(power);
    }
    public void resetEncoders() {
        leftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        leftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }
    public int convertCentimetersToTicks(double cm) {
        int ticks = (int)((cm / 31.4159) * 1120);
        return ticks;
    }
    public int convertDegreesToTicks(double degrees){
        int ticks = (int)((degrees / 60) * 500);
        return ticks;
    }
}
