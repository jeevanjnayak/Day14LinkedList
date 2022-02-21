import org.testng.Assert;
import org.testng.annotations.Test;


public class MyLinkedListTest {
    @Test
    public void given3NumberWhenLinked_ShouldBeALinkedLIst() {
        MyLinkedList<Integer> FirstNode = new MyLinkedList<>(56);
        MyLinkedList<Integer> SecondNode = new MyLinkedList<>(30);
        MyLinkedList<Integer> ThirdNode = new MyLinkedList<>(70);
        FirstNode.setNext(SecondNode);
        SecondNode.setNext(ThirdNode);
        boolean result = FirstNode.getNext().equals(SecondNode) &&
                SecondNode.getNext().equals(ThirdNode);
        Assert.assertTrue(result);
    }
}
