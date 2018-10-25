package org.usfirst.frc.team5030.robot;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.AnalogInput;
public class RobotMap 
{
   
	//DRIVE MOTORS
		
		//Motors powering the right three wheels
	    static final int rightMotorBack = 7; //Talon 1
	    public static Talon rTalonBack = new Talon(rightMotorBack);
				
		static final int rightMotorFront = 6; //Talon 3
		public static Talon rTalonFront = new Talon(rightMotorFront);
		
		//Motors powering the left three wheels
		static final int leftMotorBack = 3; //Talon 4
		public static Talon lTalonBack = new Talon(leftMotorBack);
		
		static final int leftMotorFront = 4; //Talon 2
		public static Talon lTalonFront = new Talon(leftMotorFront); 
	//SHOOTING MECHANISM 
		
		//Runs the flywheels to shoot the boulder
		
		static final int rightFlywheel = 9;
		public static Talon rFlywheel = new Talon(rightFlywheel);
		
	    static final int leftFlywheel = 10;
	    public static Talon lFlywheel = new Talon(leftFlywheel);
			
	//Conveyer System	
		
		//Spins the right belt
		static final int rightBelt = 5;
		public static Talon rBelt = new Talon(rightBelt);
		
		//Spins the left belt
		static final int leftBelt = 8;
		public static Talon lBelt = new Talon(leftBelt);
		
	//INTAKE
	
		//Spins Intake
		static final int intakeSpin = 1;
		public static Talon intake = new Talon(intakeSpin);
				
		//Actuates Intake
		static final int intakeMotor = 2;
		public static Talon intakeAct = new Talon(intakeMotor);
	
	//Defense Manipulator
		
		
		//Defensive Manipulator
		static final int manipulator = 15;
		public static Talon man = new Talon(manipulator);
		
	
	//DART Linear Actuator

		//Adjusts the angle of the shooter using DART linear actuator
		static final int dartMotor = 0;
		public static Talon dart = new Talon(dartMotor);
		
	//Potential Climber
		
		//Climber
		static final int Flash = 13;
		public static Talon flash = new Talon(Flash);
		
	//Sensors
		
		
		public static DigitalInput topHall; //Hall Effect for DART Maximum
		public static DigitalInput bottomHall;//Hall Effect for DART Minimum 
		public static DigitalInput leftLimit;//Limit Switch on left side of shooter
		public static DigitalInput rightLimit;//Limit Switch on right side of Shooter
		static Potentiometer pot;//Potentiometer on DART linear actuator
		static Encoder leftEnc;
		static Encoder rightEnc;
		static DigitalInput middleHall;
}