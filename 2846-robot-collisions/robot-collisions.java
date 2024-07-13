import java.util.*;

class Solution {
    class Robot {
        int index;
        int position;
        int health;
        char direction;
        Robot(int index, int position, int health, char direction) {
            this.index = index;
            this.position = position;
            this.health = health;
            this.direction = direction;
        }
    }

    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        List<Integer> result = new ArrayList<>();
        Robot[] robots = new Robot[positions.length];
        Stack<Robot> stack = new Stack<>();

        // Create an array of Robot objects
        for (int i = 0; i < positions.length; i++) {
            robots[i] = new Robot(i, positions[i], healths[i], directions.charAt(i));
        }

        // Sort robots based on their positions
        Arrays.sort(robots, Comparator.comparingInt(a -> a.position));

        for (Robot robot : robots) {
            if (robot.direction == 'R') {
                stack.push(robot);
                continue;
            }
            // Handle collisions for robots moving to the left
            while (!stack.isEmpty() && stack.peek().direction == 'R' && robot.health > 0) {
                Robot rightRobot = stack.peek();
                if (rightRobot.health == robot.health) {
                    stack.pop();
                    robot.health = 0;
                } else if (rightRobot.health < robot.health) {
                    stack.pop();
                    robot.health -= 1;
                } else { // rightRobot.health > robot.health
                    rightRobot.health -= 1;
                    robot.health = 0;
                }
            }
            if (robot.health > 0) {
                stack.push(robot);
            }
        }

        // Collect the remaining robots and sort them by their original indices
        List<Robot> survivingRobots = new ArrayList<>(stack);
        survivingRobots.sort(Comparator.comparingInt(a -> a.index));

        for (Robot robot : survivingRobots) {
            result.add(robot.health);
        }

        return result;
    }
}

