class twoStacks {
    int[] arr = new int[100];
    int size = 100;
    int top1=-1, top2=100;

    twoStacks() {
        // Initialize the top pointers of both stacks
        
    }

    void push1(int x) {
        // Insert the given element at the top of the first stack
        if(top1+1 != top2) {
            top1++;
            arr[top1] = x;
        }
    }

    void push2(int x) {
        // Insert the given element at the top of the second stack
        if(top2 != top1+1) {
            top2--;
            arr[top2] = x;
        }
    }

    int pop1() {
        // Remove and return the top element of the first stack
        // Return -1 if the stack is empty
        if(top1 == -1) {
            return -1;
        }
        return arr[top1--];
    }

    int pop2() {
        // Remove and return the top element of the second stack
        // Return -1 if the stack is empty
        if(top2 == 100) {
            return -1;
        }
        return arr[top2++];
    }
}