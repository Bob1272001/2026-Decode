package org.firstinspires.ftc.teamcode.Teleop;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Teleop_All extends LinearOpMode {
    //Drive Base
    private DcMotor frontLeftMotor = null;
    private DcMotor frontRightMotor = null;
    private DcMotor backLeftMotor = null;
    private DcMotor backRightMotor = null;

    //Intake
    private DcMotor intakeMotor = null;

    //Catapult
    private DcMotor catapultMotorLeft = null;
    private DcMotor catapultMotorRight = null;

    @Override
    public void runOpMode() throws InterruptedException {
        //Drive Base
        frontLeftMotor = hardwareMap.get(DcMotor.class, "front_left");
        frontRightMotor = hardwareMap.get(DcMotor.class, "front_right");
        backLeftMotor = hardwareMap.get(DcMotor.class, "back_left");
        backRightMotor = hardwareMap.get(DcMotor.class, "back_right");

        frontLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeftMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRightMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        frontLeftMotor.setDirection(DcMotor.Direction.REVERSE); // Example, adjust as needed
        frontRightMotor.setDirection(DcMotor.Direction.FORWARD);
        backLeftMotor.setDirection(DcMotor.Direction.REVERSE); // Example, adjust as needed
        backRightMotor.setDirection(DcMotor.Direction.FORWARD);


        double drive = -gamepad1.left_stick_y; // Negate y for forward to be positive
        double strafe = gamepad1.left_stick_x;
        double turn = gamepad1.right_stick_x;

        double frontLeftPower = drive + strafe + turn;
        double frontRightPower = drive - strafe - turn;
        double backLeftPower = drive - strafe + turn;
        double backRightPower = drive + strafe - turn;

        frontLeftMotor.setPower(frontLeftPower);
        frontRightMotor.setPower(frontRightPower);
        backLeftMotor.setPower(backLeftPower);
        backRightMotor.setPower(backRightPower);


        //Intake
        intakeMotor = hardwareMap.get(DcMotor.class, "intakeMotor");

        //Catapult
        catapultMotorLeft = hardwareMap.get(DcMotor.class, "catapultMotor1");
        catapultMotorRight = hardwareMap.get(DcMotor.class, "catapultMotor2");
        catapultMotorLeft.setDirection(DcMotorSimple.Direction.FORWARD);
        catapultMotorRight.setDirection(DcMotorSimple.Direction.REVERSE);

        catapultMotorLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        catapultMotorRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        if(gamepad1.right_bumper){
            catapultMotorLeft.setPower(1.0);
            catapultMotorRight.setPower(1.0);
        }
        else if(gamepad1.x){
            catapultMotorLeft.setPower(0.4);
            catapultMotorRight.setPower(0.4);
        }
        else{
            catapultMotorLeft.setPower(0.2);
            catapultMotorRight.setPower(0.2);
        }

    }
}
