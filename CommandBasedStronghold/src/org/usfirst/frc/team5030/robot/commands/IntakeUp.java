package org.usfirst.frc.team5030.robot.commands;

import org.usfirst.frc.team5030.robot.OI;
import org.usfirst.frc.team5030.robot.Robot;
import org.usfirst.frc.team5030.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class IntakeUp extends Command {

    public IntakeUp() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.intake.intakeUp();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return (!OI.intakeActUp.get());
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.intake.intakeActOff();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
