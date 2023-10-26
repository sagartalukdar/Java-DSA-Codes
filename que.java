
public class que {
    public static void main(String[] args) {
        class queue {
            int[] arr;
            int size;
            int rear = -1;

            public queue(int n) {
                arr = new int[n];
                this.size = n;
            }

            public boolean isempty() {
                if (rear == -1) {
                    return true;
                } else {
                    return false;
                }
            }

            public void add(int val) {
                if (rear == size - 1) {
                    System.out.println("full queue");
                    return;
                } else {
                    rear++;
                    arr[rear] = val;

                }
            }

            public int remove() {
                if (isempty()) {
                    return -1;
                } else {
                    int font = arr[0];
                    for (int i = 0; i < rear; i++) {
                        arr[i] = arr[i + 1];
                    }
                    rear--;

                    return font;

                }
            }

            public int peek() {
                if (isempty()) {
                    return -1;
                } else {
                    return arr[0];
                }
            }

        }
       // public class que {

         //   public static void main(String[] args) {
                queue q = new queue(5);
                q.add(4);
                q.add(3);
                q.add(2);
                while (!q.isempty()) {
                    System.out.println(q.remove());
                    //System.out.println(q.peek()+"*");
                }


            }

        }


