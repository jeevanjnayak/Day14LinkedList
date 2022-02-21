import org.testng.Assert;
import org.testng.annotations.Test;


public class MyLinkedListTest {
    @Test
    public void given3NumberWhenLinked_ShouldPassLinkedListTestCase() {
        MyLinkedList<Integer> myFirstNode = new MyLinkedList<>(56);
        MyLinkedList<Integer> mySecondNode = new MyLinkedList<>(30);
        MyLinkedList<Integer> myThirdNode = new MyLinkedList<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                mySecondNode.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }
}
