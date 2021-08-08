package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
	Robot[] robots = new Robot[5];
for (int i = 0; i < 5; i++) {
	robots[i] = new Robot("mini");
	
}
int r =100;
for (int i = 0; i < 5; i++) {
	
	robots[i].setY(r);
	robots[i].setX(300);
			r+=25;
			robots[i].setAngle(90);
}
Random ran = new Random();
boolean raceStillGoing = true;
boolean turn2 = false;
while (raceStillGoing == true) {
	for (int h = 0; h < 5; h++) {
		if (robots[h].getX() > 500) {
			robots[h].setAngle(180);
		}
		for (int m = 0; m < 5; m++) {
			if (robots[m].getY() > 300) {
				robots[m].setAngle(-90);
				turn2=true;
			}
			for (int y = 0; y < 5; y++) {
				if (robots[y].getY() < 100 && turn2 == true) {
					robots[y].setAngle(0);
					turn2=true;
				}
			}
		}
	}
	
for (int i = 0; i < 5; i++) {
	int num = ran.nextInt(50);
	robots[i].move(num);
	
	if(robots[i].getY() < 0) {
		raceStillGoing = false;
		break;
	}

}
	
}
for (int j = 0; j < 5; j++) {
	if (robots[j].getY() < 0) {
		int b = j+1;
		JOptionPane.showMessageDialog(null, "Robot " + b + " wins!");
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
}}}

