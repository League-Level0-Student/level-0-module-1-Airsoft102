package ifs_ints_and_loops;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {

 Robot ron = new Robot ("batman");
public static void main(String[] args) {
	new RobotGraffiti().go();
}

void go() {
	ron.setSpeed(200);
ron.penDown();
ron.setPenWidth(10);
	ron.move(200);
	ron.turn(150);
	ron.move(200);
ron.turn(-130);
ron.move(200);
ron.turn(160);
ron.move(200);
}
}










