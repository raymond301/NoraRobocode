package NoraRoboCode;
import robocode.*;
import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * TheBestOneThatWillDestroyU - a robot by (your name here)
 */
public class TheBestOneThatWillDestroyU extends Robot
{
	/**
	 * run: TheBestOneThatWillDestroyU's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		 setColors(Color.magenta,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		while(true) {
			System.out.println("Round: "+getRoundNum() );
			// Replace the next 4 lines with any behavior you would like
			//ahead(100);
			turnGunRight(360);
			//back(100);
			turnGunRight(360);
			// Turn the robot's gun 5 degrees to the right
   			turnGunRight(5);
			System.out.println("X="+getX()+" Y="+getY());
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		fire(4);
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		back(0);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall	
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
	}	
}