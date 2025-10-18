package org.firstinspires.ftc.teamcode.Teleop;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class Intake extends LinearOpMode {
    private DcMotor intakeMotor = null;
    @Override
    public void runOpMode() throws InterruptedException {
       intakeMotor = hardwareMap.get(DcMotor.class, "intakeMotor");
    }
}
