package org.usfirst.frc.team5030.robot.subsystems;

import org.usfirst.frc.team5030.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Manipulator extends Subsystem {
    
    public void manipulatorUp()
    {
    	RobotMap.man.set(0.5);
    }
    
    public void manipulatorDown()
    {
    	RobotMap.man.set(-0.5);
    }
    
    public void manipulatorOff()
    {
    	RobotMap.man.set(0.0);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

