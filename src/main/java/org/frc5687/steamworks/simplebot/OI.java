package org.frc5687.steamworks.simplebot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * Created by Baxter on 3/22/2017.
 */
public class OI {

    public class ButtonNumbers {
        public static final int LEFT_AXIS = 0;
        public static final int RIGHT_AXIS = 0;
    }

    private Joystick gamepad;

    public OI() {
        gamepad = new Joystick(0);
    }

    public double getLeftSpeed() {
        return gamepad.getRawAxis(ButtonNumbers.LEFT_AXIS);
    }

    public double getRightSpeed() {
        return gamepad.getRawAxis(ButtonNumbers.RIGHT_AXIS);
    }

}
