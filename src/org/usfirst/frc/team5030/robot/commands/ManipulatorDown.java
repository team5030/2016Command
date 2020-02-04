package org.usfirst.frc.team5030.robot.commands;

import org.usfirst.frc.team5030.robot.OI;
import org.usfirst.frc.team5030.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ManipulatorDown extends Command {

    public ManipulatorDown() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.manipulator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.manipulator.manipulatorDown();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return !OI.manipulatorDown.get();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.manipulator.manipulatorOff();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
