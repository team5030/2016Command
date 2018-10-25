package org.usfirst.frc.team5030.robot.commands;

import org.usfirst.frc.team5030.robot.OI;
import org.usfirst.frc.team5030.robot.Robot;
import org.usfirst.frc.team5030.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SpinFlywheels extends Command {

    public SpinFlywheels() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.shooter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	System.out.println("Jason is retarded ");
    	Robot.shooter.spinFlywheels();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	double lTrigger = OI.OperatorStick.getRawAxis(2);
    	boolean isPressed = false;
    	
    	if(lTrigger < 0.95)
    	{
    		System.out.println("Kurreem sucks");
    		isPressed = true;
    		
    	}
    	
    	 return isPressed;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.shooter.flywheelsOff();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
