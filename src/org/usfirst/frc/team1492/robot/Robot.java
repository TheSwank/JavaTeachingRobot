
package org.usfirst.frc.team1492.robot;

import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends IterativeRobot {
    
	
    public void robotInit() {
    	
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
    	
    }
    
}
