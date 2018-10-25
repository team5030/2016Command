package org.usfirst.frc.team5030.robot;

import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team5030.robot.commands.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import org.usfirst.frc.team5030.robot.LTriggerConversion;
import org.usfirst.frc.team5030.robot.RTriggerConversion;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.Joystick;
//import org.usfirst.frc.team5030.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI
{
	private final int LT = 2;
	private final int RT = 3;
	
	public static Joystick DriverStick = new Joystick(0); //Xbox Controller for Driver
	
		public static Button manipulatorUp = new JoystickButton(DriverStick, 6); //Defense arm up
		public static Button manipulatorDown = new JoystickButton(DriverStick, 5); //Defense arm down	
		public static Button stackMode = new JoystickButton(DriverStick,1); // Slows drivetrain for fine manuevers
	
	
	public static Joystick OperatorStick = new Joystick(1);
		
		public static Button intakeActUp = new JoystickButton(OperatorStick, 4); //intake up
		public static Button intakeActDown = new JoystickButton(OperatorStick, 2);//intake down
		public static Button intakeIn = new JoystickButton(OperatorStick, 6);
		public static Button intakeOut = new JoystickButton(OperatorStick, 5);
		public static Button Flash = new JoystickButton(OperatorStick, 1);
		//public static Button rTrigger= new JoystickButton(OperatorStick, 12);
	//	public static Button lTrigger= new JoystickButton(OperatorStick, 11);;
		public Button rTrigger = new TriggerButton(OperatorStick, this.RT, .9);
		public Button lTrigger = new TriggerButton(OperatorStick, this.LT, .9);
	
		
		{
		    rTrigger.whileHeld (new Shoot());
		//	System.out.println("Val" + LTriggerConversion.spinUp);
		    lTrigger.whileHeld(new SpinFlywheels());
		/*	if(OI.OperatorStick.getRawAxis(2) > 0.95)
			{ new SpinFlywheels(); }
			System.out.println("Val" + LTriggerConversion.spinUp);
			
			if(RTriggerConversion.shoot)
			{ new Shoot(); }*/
			Flash.whileHeld(new Flash());
			intakeIn.whileHeld(new IntakeIn());
			intakeOut.whileHeld(new IntakeOut());
			intakeActUp.whenPressed(new IntakeUp());
			intakeActDown.whenPressed(new IntakeDown());
			manipulatorUp.whileHeld(new ManipulatorUp());
			manipulatorDown.whileHeld(new ManipulatorDown());
			
		}
		
		
}