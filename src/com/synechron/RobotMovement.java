package com.synechron;

public class RobotMovement {
    public static int[] finalPosition(String moves) {
        if (moves == null || moves.isEmpty()) {
            return new int[]{0, 0};
        }

        int x = 0, y = 0;

        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid move character: " + move);
            }
        }

        return new int[]{x, y};
    }

    public static void main(String[] args) {
        // Test cases
        testFinalPosition("UDDLRL", new int[]{-1, -1});
        testFinalPosition("UDDLLRUUUDUURUDDUULLDRRRR", new int[]{2, 3});
        testFinalPosition("", new int[]{0, 0});
        testFinalPosition("UUUU", new int[]{0, 4});
        testFinalPosition("DDDD", new int[]{0, -4});
        testFinalPosition("LLLL", new int[]{-4, 0});
        testFinalPosition("RRRR", new int[]{4, 0});
        testFinalPosition(null, new int[]{0, 0});
    }

    private static void testFinalPosition(String moves, int[] expected) {
        int[] result = finalPosition(moves);
        if (result[0] == expected[0] && result[1] == expected[1]) {
            System.out.println("Test passed for moves: " + moves);
        } else {
            System.out.println("Test failed for moves: " + moves + ". Expected: (" + expected[0] + ", " + expected[1] + "), but got: (" + result[0] + ", " + result[1] + ")");
        }
    }
}
