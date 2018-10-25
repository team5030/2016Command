package org.usfirst.frc.team5030.robot.subsystems;

import org.usfirst.frc.team5030.robot.OI;
import org.usfirst.frc.team5030.robot.RobotMap;
import org.usfirst.frc.team5030.robot.commands.DartOperation;
import edu.wpi.first.wpilibj.ControllerPower;
import edu.wpi.first.wpilibj.command.Subsystem;




public class Shooter extends Subsystem 
{
	public static double dartValue;
	double operatorBands = 0.05;
	
	public void flashOn() 
	{
		RobotMap.flash.set( 6 / ControllerPower.getInputVoltage());
	}
	
	public void flashOff()
	{
		RobotMap.flash.set(0.0);
	}
	
	public void drivingDart()
	{
		 if (OI.OperatorStick.getY() < operatorBands && OI.OperatorStick.getY() > -operatorBands)
	        {
	        	dartValue = 0;
	        }
	        else 
	        {
	        	dartValue = OI.OperatorStick.getY();
	        }
	        
	        //Stop dart if it is trying to go above top hall effect sensor
	        if(dartValue < 0.0 && !RobotMap.topHall.get())
	        {
	        	RobotMap.dart.set(0.0);
	        }
	        //Stop dart if it is trying to go below the bottom hall effect sensor
	        else if(dartValue > 0.0 && !RobotMap.bottomHall.get())
	        {
	        	RobotMap.dart.set(0.0);
	        }
	        else
	        {
	        	RobotMap.dart.set(-dartValue);
	        }
	}
	
	public void spinFlywheels()
	{
		double lTrigger = OI.OperatorStick.getRawAxis(2);
        if(lTrigger > 0.95)
        {	
			RobotMap.rFlywheel.set(0.6);
			RobotMap.lFlywheel.set(0.6);
        }
        else 
        {
        	RobotMap.rFlywheel.set(0.0);
			RobotMap.lFlywheel.set(0.0);
        }	
	}
	
	public void shoot()
	{
		RobotMap.rFlywheel.set(0.6);
		RobotMap.lFlywheel.set(0.6);
		RobotMap.lBelt.set(-0.3);
		RobotMap.rBelt.set(0.3);
	}
	
	public void flywheelsOff()
	{
		RobotMap.lFlywheel.set(0.0);
    	RobotMap.rFlywheel.set(0.0);
	}

    public void initDefaultCommand() 
    {
       setDefaultCommand(new DartOperation());
    }
}

