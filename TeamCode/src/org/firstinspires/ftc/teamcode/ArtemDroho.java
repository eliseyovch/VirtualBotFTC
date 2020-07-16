package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name = "Artem's Robot Code")
public class ArtemDroho extends LinearOpMode {
    public void runOpMode() {
        DcMotor fl = hardwareMap.dcMotor.get("front_left_motor");
        DcMotor fr = hardwareMap.dcMotor.get("front_right_motor");
        DcMotor bl = hardwareMap.dcMotor.get("back_left_motor");
        DcMotor br = hardwareMap.dcMotor.get("back_right_motor");

        Servo servo1 = hardwareMap.servo.get("back_servo");

        fl.setDirection(DcMotorSimple.Direction.REVERSE);
        bl.setDirection(DcMotorSimple.Direction.REVERSE);
        waitForStart();
        int x = 0;
        // ElapsedTime et = new ElapsedTime();
        while (opModeIsActive()) {
            x= x+1;
            fl.setPower(.5);
            bl.setPower(.5);
            fr.setPower(.5);
            br.setPower(.5);
                if(x > 1500 && x < 2500){
                    fl.setPower(0);
                    bl.setPower(0);
                    fr.setPower(0);
                    br.setPower(0);

                    fl.setPower(.5);
                    bl.setPower(-.5);
                    fr.setPower(-.5);
                    br.setPower(.5);
                }
                if(x > 2501 && x < 4000){
                    fl.setPower(0);
                    bl.setPower(0);
                    fr.setPower(0);
                    br.setPower(0);

                    fl.setPower(-.5);
                    bl.setPower(0);
                    fr.setPower(0);
                    br.setPower(-.5);
                }
                if(x >4001 && x < 5000){
                    fl.setPower(0);
                    bl.setPower(0);
                    fr.setPower(0);
                    br.setPower(0);

                    fl.setPower(-.5);
                    bl.setPower(-.5);
                    fr.setPower(-.5);
                    br.setPower(-.5);
                }
                if(x > 5001 && x < 5005){
                    fl.setPower(0);
                    bl.setPower(0);
                    fr.setPower(0);
                    br.setPower(0);
                    servo1.setPosition(180);
                }
                if(x>5006){
                    fl.setPower(0);
                    bl.setPower(0);
                    fr.setPower(0);
                    br.setPower(0);
                }
            }
        }
    }


