package org.firstinspires.ftc.teamcode.Teleop;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class Teleop_All extends LinearOpMode {
    //Drive Base
    private DcMotor frontLeft = null;
    private DcMotor frontRight = null;
    private DcMotor backLeft = null;
    private DcMotor backRight = null;

    //Intake
    private DcMotor intakeMotor = null;

    //Catapult
    private DcMotor catapultMotor1 = null;
    private DcMotor catapultMotor2 = null;

    @Override
    public void runOpMode() throws InterruptedException {
        //Drive Base
        frontLeft = hardwareMap.get(DcMotor.class, "front_left");
        frontRight = hardwareMap.get(DcMotor.class, "front_right");
        backLeft = hardwareMap.get(DcMotor.class, "back_left");
        backRight = hardwareMap.get(DcMotor.class, "back_right");

        frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        //Intake
        intakeMotor = hardwareMap.get(DcMotor.class, "intakeMotor");

        //Catapult
        catapultMotor1 = hardwareMap.get(DcMotor.class, "catapultMotor1");
        catapultMotor2 = hardwareMap.get(DcMotor.class, "catapultMotor2");

    }
}
