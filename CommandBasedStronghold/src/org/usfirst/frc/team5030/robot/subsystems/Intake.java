package org.usfirst.frc.team5030.robot.subsystems;

import org.usfirst.frc.team5030.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem 
{
    
    public void intakeIn()
    {
    	if(!RobotMap.leftLimit.get() ||  !RobotMap.rightLimit.get())
		{	
			RobotMap.intake.set(0.0);
			RobotMap.rBelt.set(0.0);
			RobotMap.lBelt.set(0.0);
	
		}
		else
		{
			RobotMap.intake.set(-1.0);
			RobotMap.rBelt.set(0.30);
			RobotMap.lBelt.set(-0.30);
	
		}
    }
    
    public void intakeOut()
    {
    	RobotMap.rBelt.set(-0.3);
    	RobotMap.lBelt.set(0.3);
    	RobotMap.intake.set(0.5);
    }
    
    public void intakeOff()
    {
    	RobotMap.rBelt.set(0.0);
    	RobotMap.lBelt.set(0.0);
    	RobotMap.intake.set(0.0);
    }
    
    public void intakeUp()
    {
		RobotMap.intakeAct.set(-1.0);
	}

    public void intakeDown()
    {
    	RobotMap.intakeAct.set(1.0);    
   	}
    
    public void intakeActOff()
    {
    	RobotMap.intakeAct.set(0.0);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

