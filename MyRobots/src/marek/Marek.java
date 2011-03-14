package marek;

import java.awt.Color;

import robocode.AdvancedRobot;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;
import robocode.TurnCompleteCondition;

public class Marek extends AdvancedRobot {

	boolean movingForward;

	/**
	 * run: Crazy's main run function
	 */
	public void run() {
		// Set colors
		setBodyColor(new Color(0, 200, 0));
		setGunColor(new Color(0, 150, 50));
		setRadarColor(new Color(0, 100, 100));
		setBulletColor(new Color(255, 255, 100));
		setScanColor(new Color(255, 200, 200));

		// Loop forever
		while (true) {
			ahead(100);
			movingForward = true;
			setTurnRight(Math.random() * 200 - 100);
			setTurnGunRight(360);
			// Tell the game we will want to move ahead 40000 -- some large
			// number
			//setAhead(40000);
			//setTurnRadarRight(360);
			//movingForward = true;
			// Tell the game we will want to turn right 90
			//setTurnRight(90);
			//setTurnRadarRight(360);
			// At this point, we have indicated to the game that *when we do
			// something*,
			// we will want to move ahead and turn right. That's what "set"
			// means.
			// It is important to realize we have not done anything yet!
			// In order to actually move, we'll want to call a method that
			// takes real time, such as waitFor.
			// waitFor actually starts the action -- we start moving and
			// turning.
			// It will not return until we have finished turning.
			//waitFor(new TurnCompleteCondition(this));
			//setTurnRadarRight(360);
			// Note: We are still moving ahead now, but the turn is complete.
			// Now we'll turn the other way...
			//setTurnLeft(180);
			//setTurnRadarRight(360);
			// ... and wait for the turn to finish ...
			//waitFor(new TurnCompleteCondition(this));
			//setTurnRadarRight(360);
			// ... then the other way ...
			//setTurnRight(180);
			//setTurnRadarRight(360);
			// .. and wait for that turn to finish.
			//waitFor(new TurnCompleteCondition(this));
			//setTurnRadarRight(360);
			// then back to the top to do it all again
		}
	}

	/**
	 * onHitWall: Handle collision with wall.
	 */
	public void onHitWall(HitWallEvent e) {
		// Bounce off!
		reverseDirection();
	}

	/**
	 * reverseDirection: Switch from ahead to back & vice versa
	 */
	public void reverseDirection() {
		
		if (movingForward) {
			back(300);
			movingForward = false;
		} else {
			back(300);
			movingForward = true;
		}
	}

	/**
	 * onScannedRobot: Fire!
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		if (e.getDistance() < 600){
			setTurnGunRight(getRadarHeading() - getGunHeading());
			fire(0.5);
		}
		if (e.getDistance() < 400){
			setTurnGunRight(getRadarHeading() - getGunHeading());
			fire(1);
		}
		if (e.getDistance() < 200){
			setTurnGunRight(getRadarHeading() - getGunHeading());
			fire(2);
		}
	}

	/**
	 * onHitRobot: Back up!
	 */
	public void onHitRobot(HitRobotEvent e) {
		// If we're moving the other robot, reverse!
		if (e.isMyFault()) {
			reverseDirection();
		}
	}
}
