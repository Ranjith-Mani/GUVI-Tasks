
    import java.util.Scanner;
    import java.util.Stack;

    public class IntegerStack
    {
        private final Stack<Integer> stack;

        public IntegerStack()
        {
            stack = new Stack<>();
        }

        // Method to push an element onto the stack
        public void pushElement(int element)
        {
            stack.push(element);
            System.out.println("Pushed element: " + element);
        }

        // Method to pop an element from the stack
        public void popElement(int pop)
        {
            if (!stack.isEmpty())
            {
                int element = stack.pop();
                System.out.println("Popped element: " + element);
            }
            else
            {
                System.out.println("Stack is empty.");
            }
        }

        public static void main(String[] args)
        {
            IntegerStack integerStack = new IntegerStack();

            System.out.println("____________________________________________");
            System.out.println("INTEGER STACK");
            System.out.println("____________________________________________");
            Scanner stack = new Scanner(System.in);
            System.out.println("Enter elements which you want to push : ");
            int num1 = stack.nextInt();
            int num2 = stack.nextInt();
            int num3 = stack.nextInt();
            System.out.println();
            // Pushing elements onto the stack
            integerStack.pushElement(num1);
            integerStack.pushElement(num2);
            integerStack.pushElement(num3);
            System.out.println("____________________________________________");
            // Popping elements from the stack
            System.out.println("Enter elements which you want to push : ");
            int pop1 = stack.nextInt();
            int pop2 = stack.nextInt();
            int pop3 = stack.nextInt();
            integerStack.popElement(pop1);
            integerStack.popElement(pop2);
            integerStack.popElement(pop3);
            System.out.println("____________________________________________");
            System.out.println("Stack empty");
            System.out.println("____________________________________________");
        }
    }
