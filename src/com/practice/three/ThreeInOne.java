package com.practice.three;

// Describe how you could use a single array to implement three stacks.

import java.util.EmptyStackException;

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

        // Push a value onto a stack.

        public void push(int stackNum, int value) { // throw FullStackException

            if (isFull(stackNum)) {

                // Throw new FullStackException()

            }

            // Increment the stack pointer and then update the top value.

            sizes[stackNum]++;
            values[indexOfTop(stackNum)] = value;

        }

        // Pop an item from the top of the stack.

        public int pop(int stackNum) {

            if (isEmpty(stackNum)) {

                throw new EmptyStackException();

            }

            int topIndex = indexOfTop((stackNum));
            int value = values[topIndex];
            values[topIndex] = 0;
            sizes[stackNum]--;
            return value;

        }

        // Returns the top element.

        public int peek(int stackNum) {

            if (isEmpty(stackNum)) {

                throw new EmptyStackException();

            }

            return values[indexOfTop(stackNum)];

        }

        // Returns true if stack is empty.

        public boolean isEmpty(int stackNum) {

            return sizes[stackNum] == 0;

        }

        // Returns true if stack is full.

        public boolean isFull(int stackNum) {

            return sizes[stackNum] == stackCapacity;

        }

        // Returns the index of the top of the stack.

        private int indexOfTop(int stackNum) {

            int offset = stackNum * stackCapacity;
            int size = sizes[stackNum];
            return offset + size - 1;

        }

    }

}
