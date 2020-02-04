package org.usfirst.frc.team5030.robot.subsystems;
import org.usfirst.frc.team5030.robot.OI;
import org.usfirst.frc.team5030.robot.Robot;
import org.usfirst.frc.team5030.robot.commands.JoystickOperation;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.RobotDrive;


public class Drivetrain extends Subsystem
{
	final double driverBands = 0.08;
    
	public void initDefaultCommand()
	{
		setDefaultCommand(new JoystickOperation());
	}
	
	public void driving()
	{
	
			double leftJoy; //Xvalue of OperatorStick 
			double rightJoy; //Yvalue of OperatorStick
	        
			//DeadBands
	        if (OI.DriverStick.getY() < driverBands && OI.DriverStick.getY() > -driverBands) 
	        {
	        	leftJoy = 0;
	        }
	        else 
	        {
	        	leftJoy = OI.DriverStick.getY();
	        	System.out.println("LJ " + leftJoy);
	        }
	        if (OI.DriverStick.getRawAxis(5) < driverBands && OI.DriverStick.getRawAxis(5) > -driverBands)
	        { 
	        	rightJoy = 0;
	        }
	        else 
	        {
	        	rightJoy = OI.DriverStick.getRawAxis(5);
	        }
        
        
        //Robot.drive.tankDrive(-leftJoy , -rightJoy, true);
        Robot.drive.arcadeDrive(-leftJoy, -rightJoy,true);
	}
	
}
