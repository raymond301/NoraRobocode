package NoraRoboCode;
import robocode.*;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/JuniorRobot.html

/**
 * JrBest1ThatWillDestoryU - a robot by (your name here)
 */
public class JrBest1ThatWillDestoryU extends JuniorRobot
{
	/**
	 * run: JrBest1ThatWillDestoryU's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here
		int x = 1;
		// Some color codes: blue, yellow, black, white, red, pink, brown, grey, orange...
		// Sets these colors (robot parts): body, gun, radar, bullet, scan_arc
		setColors(orange, blue, white, yellow, black);

		// Robot main loop
		while(x==1) {
			// Replace the next 4 lines with any behavior you would like
			//ahead(100);
			turnGunRight(180);
			fire(1);
			//back(100);
			//turnGunRight(360);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
//	public void onScannedRobot() {
		// Replace the next line with any behavior you would like
//		fire(1);
//	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet() {
		// Replace the next line with any behavior you would like
		back(10);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall() {
		// Replace the next line with any behavior you would like
		back(20);
	}	
}
