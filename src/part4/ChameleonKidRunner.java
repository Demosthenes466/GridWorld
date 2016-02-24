/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 * @author Cay Horstmann
 */

package part4;

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;

import java.awt.Color;

/**
 * This class runs a world that contains chameleon critters. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class ChameleonKidRunner {
	
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		world.add(new Location(7, 8), new Rock());
		world.add(new Location(3, 3), new Rock());
		world.add(new Location(2, 8), new Rock(Color.BLUE));
		world.add(new Location(5, 5), new Rock(Color.PINK));
		world.add(new Location(1, 5), new Rock(Color.RED));
		world.add(new Location(7, 2), new Rock(Color.YELLOW));
		world.add(new Location(4, 4), new ChameleonKid());
		world.add(new Location(5, 8), new ChameleonKid());
		world.show();
	}
}