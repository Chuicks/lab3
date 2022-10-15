import static org.junit.Assert.*;
import org.junit.*;


public class LinkedListTests {
 @Test
public void testprepend() {
       LinkedList input1 = new LinkedList();
       
        input1.append(4);
        input1.append(6);
        assertEquals(1, input1.length());
    }
}

//        LinkedList input1 = new LinkedList();
//        Noder input2 =  new Node(4, input3);