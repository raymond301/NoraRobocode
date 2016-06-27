package NoraRoboCode;
import robocode.*;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * TheOkay - a robot by (your name here)
 */
public class TheOkay extends Robot
{
	/**
	 * run: TheOkay's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here 
		
		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		int c =1;
		while(true) {
 			System.out.println(c+"  X="+getX());
			System.out.println(c+"  Y="+getY());
			
			
// Replace the next 4 lines with any behavior you would like
		turnGunRight(50);
			//back(1);			
		
			//back(100);
			//turnGunRight(360);
		//	onScannedRobotEvent ();
		c++;
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void  onScannedRobot(ScannedRobotEvent e) {
       //fire(1);
// Assuming radar and gun are aligned...
       if (e.getDistance() >200) {
           fire(4);
       } else {
           fire(2);
		   
       }
   } 

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		//back(5);
	//	ahead(3);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		back(20);
	}	

/*void onScannedRobot(ScannedRobotEvent event) {
       // Assuming radar and gun are aligned...
       if (event.getDistance() < 25) {
           fire(3);
       } else {
           fire(1);
       } 
	   */
   } 
