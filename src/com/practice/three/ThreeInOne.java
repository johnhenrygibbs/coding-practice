package com.practice.three;

// Describe how you could use a single array to implement three stacks.

public class ThreeInOne {

    class FixedMultiStack {

        private int numberOfStacks = 3;
        private int stackCapacity;
        private int[] values;
        private int[] sizes;

        public FixedMultiStack(int stackSize) {

            stackCapacity = stackSize;
            values = new int[stackSize * numberOfStacks];
            sizes = new int[numberOfStacks];

        }

    }

}
