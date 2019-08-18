/**  
* @author SANKALP SAXENA  
*/

    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int m = in.nextInt();
            Deque deque = new ArrayDeque<>();
            int size = 0;

            for (int i = 0; i < n; i++) {
                int num = in.nextInt();

                if(deque.size() == m) {
                    deque.addFirst(num);
                    deque.removeLast();
                }
                else {
                    deque.add(num);

                }

                int cc = (int)deque.stream().distinct().count();    
                size = (cc > size) ? cc : size; 
            }

            System.out.println(size);
        }
    }



