package org.usfirst.frc.team5030.robot;
import edu.wpi.first.wpilibj.buttons.Button;

public class LTriggerConversion extends Button 
{
	double lTrigger = OI.OperatorStick.getRawAxis(2); //Begin spinning flywheels, Left Trigger 
  	public static boolean spinUp;

  	public boolean get() 
  	{
  		if(lTrigger > 0.95)
  		{
  			spinUp = true;
  		}
  		else
  		{
  			spinUp = false;
  		}
  		return spinUp;
  	}
}
