package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name = "Motor Test")
public class motorTest extends OpMode {

    Servo servo;
    DcMotor motor;
  //  DcMotor rightFrontDrive;

    @Override
    public void init(){
        //servo = hardwareMap.get(Servo.class, "testServo");
        motor = hardwareMap.get(DcMotor.class, "testMotor");
        //rightFrontDrive = hardwareMap.get(DcMotor.class, "right_Front_Drive");

        telemetry.addData("hardware: ", "Initialize");


        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        motor.setDirection(DcMotorSimple.Direction.FORWARD);
        //motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

  //      rightFrontDrive.setDirection(DcMotor.Direction.FORWARD);
    }

    @Override
    public void loop(){
       motor.setPower(1);

    }
}
