package org.frc5687.steamworks.simplebot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.frc5687.steamworks.simplebot.RobotMap;
import org.frc5687.steamworks.simplebot.commands.DriveWith2Joysticks;
import org.frc5687.steamworks.simplebot.utils.AbstractPWMSpeedController;

/**
 * Created by Baxter on 3/22/2017.
 */
public class DriveTrain extends Subsystem {

    private AbstractPWMSpeedController leftFrontMotor;
    private AbstractPWMSpeedController leftRearMotor;
    private AbstractPWMSpeedController rightFrontMotor;
    private AbstractPWMSpeedController rightRearMotor;

    public DriveTrain() {
        leftFrontMotor = new AbstractPWMSpeedController(RobotMap.DriveTrain.LEFT_FRONT_MOTOR);
        leftRearMotor = new AbstractPWMSpeedController(RobotMap.DriveTrain.LEFT_REAR_MOTOR);
        rightFrontMotor = new AbstractPWMSpeedController(RobotMap.DriveTrain.RIGHT_FRONT_MOTOR);
        rightRearMotor = new AbstractPWMSpeedController(RobotMap.DriveTrain.RIGHT_REAR_MOTOR);
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new DriveWith2Joysticks());
    }

    public void tankDrive(double leftSpeed, double rightSpeed) {
        leftFrontMotor.set(leftSpeed);
        leftRearMotor.set(leftSpeed);
        rightFrontMotor.set(rightSpeed);
        rightRearMotor.set(rightSpeed);
    }

}
