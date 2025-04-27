public class ImplementationArray {
    public static class stack {
        private int arr[] = new int[5];
        private int idx = 0;

        void push(int x) {      ///Function to  push the elements

            if(isFull()){
                System.out.println("Stack  is already fulled: ");
                return ;
            }
            arr[idx] = x;
            idx++;
        }

        int peek() {               ///Function to get the top most element
            if (idx == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            return arr[idx - 1];

        }

        int pop() {                ///Function to  pop the elements
            if (idx == 0) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;

        }

        int size() {         ///Function to  return the size of the stack 
            return idx;
        }

        boolean isEmpty() {      ///Function to  check weather the stack is emty or not
            if (size() == 0) {
                return true;
            } else {
                return false;
            }
        }

  
        boolean isFull(){      ///Function to  check the stack is full or not
            if(idx==arr.length){
                return true;
            }else{
                return false;
            }
        }
    
        void display() {                     ///Function to  diaplay.
            for (int i = 0; i <= idx - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }

   public static void main(String[] args) {
    stack st = new stack();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    st.push(6);
    st.push(7);
    // st.display();
    st.display();
   System.out.println(st.isFull());
   }

}
