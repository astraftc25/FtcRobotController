package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class Variables extends OpMode{
    @Override
    public void init() {
        int teamNumber = 32089;
        double motorPower = 0.75;
        boolean clawClosed = true;
        int motorAngle=60;
        String name = "Astra";
        telemetry.addData("Team Number",teamNumber);
        telemetry.addData("MotorPower",motorPower);
        telemetry.addData("ClawClosed",clawClosed);
        telemetry.addData("Name",name);
        telemetry.addData("Motor Angle",motorAngle);
    }

    @Override
    public void loop() {

    }
}
