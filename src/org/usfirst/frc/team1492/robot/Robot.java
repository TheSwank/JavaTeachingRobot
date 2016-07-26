
package org.usfirst.frc.team1492.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;

public class Robot extends IterativeRobot {

	Joystick joystickLeft;
	Joystick joystickRight;
    
	
    public void robotInit() {
    	joystickLeft = new Joystick(0);
    	joystickRight = new Joystick(1);
    }
    
    public void autonomousInit() {
    	System.out.println("hello");
    	
    }

    
    public void autonomousPeriodic() {
    	
    }
    
    public void teleopPeriodic() {
        int a = 2;
        System.out.println(a);
    }
    
    public void testPeriodic() {
    	
    	//javateachingrobot
    }
    
}
