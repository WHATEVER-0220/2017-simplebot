package org.frc5687.steamworks.simplebot.subsystems;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.frc5687.steamworks.simplebot.Constants;
import org.frc5687.steamworks.simplebot.RobotMap;
import org.frc5687.steamworks.simplebot.utils.AbstractPWMSpeedController;

public class Climber extends Subsystem {

    private AbstractPWMSpeedController motorA;
    private AbstractPWMSpeedController motorB;

    public Climber() {
        motorA = new AbstractPWMSpeedController(RobotMap.Climber.MOTOR_A);
    }

    @Override
    protected void initDefaultCommand() {
    }
}
