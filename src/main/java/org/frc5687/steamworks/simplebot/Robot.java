package org.frc5687.steamworks.simplebot;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot  {

    public static Robot robot;
    private Command autoCommand;

    public Robot() {
    }

    @Override
    public void startCompetition() {
        super.startCompetition();
    }

    @Override
    public void robotInit() {
        robot = this;

    }

    @Override
    public void disabledInit() {

    }

    @Override
    public void autonomousInit() {
        if (autoCommand != null) {
            autoCommand.start();
        }
    }

    @Override
    public void teleopInit() {
        if (autoCommand != null) autoCommand.cancel();
    }

    @Override
    public void testInit() {

    }

    @Override
    public void robotPeriodic() {

    }

    @Override
    public void disabledPeriodic() {
        updateDashboard();
    }

    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        updateDashboard();
    }

    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        updateDashboard();
    }

    @Override
    public void testPeriodic() {
    }

    public void updateDashboard() {

    }

}