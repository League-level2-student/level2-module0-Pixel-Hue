package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	Robot[] robots = new Robot[5];
for (int i = 0; i < 5; i++) {
	robots[i] = new Robot();
	
}
int r =100;
for (int i = 0; i < 5; i++) {
	
	robots[i].setY(500);
	robots[i].setX(r);
			r+=150;
}
Random ran = new Random();
boolean raceStillGoing = true;
while (raceStillGoing == true) {
for (int i = 0; i < 5; i++) {
	int num = ran.nextInt(50);
	robots[i].move(num);
	
	if(robots[i].getY() < 0) {
		raceStillGoing = false;
		break;
	}
	
}
}
	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
}
