package org.usfirst.frc.team5030.robot.commands;

import org.usfirst.frc.team5030.robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class ShootGroup extends CommandGroup {
    
    public  ShootGroup() {
        requires(Robot.shooter);
        
        addParallel(new DartOperation());
        addParallel(new SpinFlywheels());
        addParallel(new Flash());
    
    }
}
