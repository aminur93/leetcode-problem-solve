package Find_the_largest_rectangle_in_a_histogram_using_a_stack;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static int largestRectangleArea(int heights[])
    {
        // first declare stack
        Stack<Integer> stack = new Stack<>();

        // second declare varibale maxArea
        int maxArea = 0;

        // third find length heights
        int n = heights.length;

        // forth for loop start
        for(int i=0; i < n; i++)
        {
            // fifth check currentHeight 0 or not, if 0 then height should pop
            int currentHeight = (i == n) ? 0 : heights[i];

            /*
             * sixth start while loop
             * 👉 until the stack is empty and
             * 👉 The current height is smaller than the previous stored height,
             * 👉 Until then, I will pop from the stack.
            */
            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                
                int height = heights[stack.pop()];

                int width = stack.isEmpty() ? i : (i - stack.peek() - 1);

                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;

    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your array size: ");
        int size = scanner.nextInt();

        int height[] = new int[size];

        System.out.println("Enter " + size + " height for the array: ");
        for(int i=0; i < size; i++)
        {
            height[i] = scanner.nextInt();
        }

        System.out.println("Maximum Area: " + largestRectangleArea(height));

        scanner.close();
        
    }
}
