# **Part 1:**
#### Set 1 Answers:
1. The bug does not always move because if it encounters a rock, it will not move a space but will rotate. In addition to this, if the bug is fully encased in rocks, it will not move to a new location.
2. The bug rotates clockwise when it encounters an object, so it moves clockwise as well.
3. The bug rotates at 45 degree angles.
4. Bugs leave flowers behind them when they move.
5. When the bug reaches the end of the grid, it rotates clockwise to the nearest cardinal direction.
6. The bug will rotate clockwise 45 degrees to move past it.
7. The flowers do not move.
8. The flowers simply sit in the tracks behind a bug, and change color if a different colored bug travels over it.
9. A rock does not move and cannot be influenced.
10. No, both cannot exist in one square at any given time. However, when a bug encounters a flower, unlike the other objects, it removes the flower ans substitutes the bug in.

### Exercises
1. | Degrees | Compass Direction |
   |---------|-------------------|
   | 0       | North             |
   | 45      | North-East        |
   | 90      | East              |
   | 135     | South-East        |
   | 180     | South             |
   | 225     | South-West        |
   | 270     | West              |
   | 315     | North-West        |
   | 360     | North             |
2. You can move the bug in any direction, to any square, as long as the square is on the grid. If you attempt to move the bug to a square that does not exist on the grid, an error occurs and the bug does not move. 
3. To change the color of all 3 I used the setColor() method.
4. If you move a rock on to a bug, and then move the rock again, the bug has been replaced by the rock so there is only 1 actor remaining. The rock replaced the bug at that specific location and in doing so, removed the actor.

# Part 2

#### Set 2 Answers:
1. The side length instance variable determines the amount of spaces the bug will move forward before turning. 
2. The steps variable keeps track of how many times the bug has moved, and compares that to the size of the square that the bug must create.
3. Because in the turn() method, the bug only turns 45 degrees, and the angle of each square corner is 90 degrees.
4. Because the BoxBug class is an extention of bug, which has that method.
5. 
