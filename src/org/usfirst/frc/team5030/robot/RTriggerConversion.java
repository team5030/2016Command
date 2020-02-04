package org.usfirst.frc.team5030.robot;
import edu.wpi.first.wpilibj.buttons.Button;

public class RTriggerConversion extends Button 
{
	double rTrigger = OI.OperatorStick.getRawAxis(3); //Shoot, overrides limit switches, Right Trigger
  	public static boolean shoot;
  	  	
  	public boolean get() 
  	{
  		if(rTrigger > 0.95)
  		{
  			shoot = true;
  		}
  		else
  		{
  			shoot = false;
  		}
		return shoot;
  	}
  	
}