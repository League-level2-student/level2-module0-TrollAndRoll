package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		int i;
	
	//2. create an array of 5 robots.
	Robot[] robots = new Robot[5];
	//3. use a for loop to initialize the robots.
	for (i = 0; i<robots.length;i++)
	{
		robots[i] = new Robot();
		//4. make each robot start at the bottom of the screen, side by side, facing up
		robots[i].moveTo(i * 150, 400);
	}
	//5. use another for loop to iterate through the array and make each robot move
	boolean raceFinished = false;
	while(raceFinished == false)
	{
	for (i = 0; i<robots.length;i++) {
	//   a random amount less than 50.
		Random rand = new Random();
		int thisMuch = rand.nextInt(51);
		robots[i].setSpeed(100);
		robots[i].move(thisMuch);
		if(robots[i].getY() < 0)
		{
			raceFinished = true;
		}
	}
	}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
	//ok.
	//7. declare that robot the winner and throw it a party!
	JOptionPane.showMessageDialog(null, "Robot #" + i + " is the winner!!");
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
	}
}
