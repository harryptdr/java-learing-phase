package stack;

public class arrayImplementatation {
    public static class stack {
        int[] arr = new int[5];
        int idx = 0;

        //push function
        void push(int x) {
            if (idx == arr.length) {
                System.out.println("stack is full");
            } else {
                arr[idx] = x;
                idx++;
            }
        }

        //pop function
        int pop() {
            if (idx == 0) {
                System.out.println("stack is empty");
                return -1;
            }
            int top = arr[idx - 1];
            idx--;
            return top;
        }


         //peek function
        void peek() {
            if (idx == 0) {
                System.out.println("stack is empty");
                return;
            }
            int top = arr[idx - 1];
            System.out.println(top);
        }

        //display function
        void display() {
            if (idx == 0) {
                System.out.println("stack is empty");
            }
            for (int i = 0; i <= idx - 1; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
        public static void main(String[] args) {
            stack st = new stack();
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);
            st.push(60);
            st.display();
            st.pop();
            st.display();
            st.peek();
        }
    }
