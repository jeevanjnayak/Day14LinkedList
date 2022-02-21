import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkedListOperationTest {
    @Test
    void given3NumbersWhenAddedToLinkedList_ShouldBeAddedToTop(){
        System.out.println("Added to Top");
        MyLinkedList<Integer> myFirstNode = new MyLinkedList<>(70);
        MyLinkedList<Integer> mySecondNode= new MyLinkedList<>(30);
        MyLinkedList<Integer> myThirdNode= new MyLinkedList<>(56);
        LinkedListOperation myLinkedList= new LinkedListOperation();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNode();
        boolean result=myLinkedList.head.equals(myThirdNode) &&
                myLinkedList.head.getNext().equals(mySecondNode)&&
                myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }
    @Test
    void given3NumbersAppend_ShouldBeAddedToLast(){
        System.out.println("Added to last");
        MyLinkedList<Integer> myFirstNode = new MyLinkedList<>(56);
        MyLinkedList<Integer> mySecondNode= new MyLinkedList<>(30);
        MyLinkedList<Integer> myThirdNode= new MyLinkedList<>(70);
        LinkedListOperation myLinkedList= new LinkedListOperation();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNode();
        boolean result=myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode)&&
                myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    void givenNumbersWhenInsert_ShouldPassLinkListResult(){
        System.out.println("\nInsert in between");
        MyLinkedList<Integer> myFirstNode = new MyLinkedList<>(56);
        MyLinkedList<Integer> mySecondNode= new MyLinkedList<>(30);
        MyLinkedList<Integer> myThirdNode= new MyLinkedList<>(70);
        LinkedListOperation myLinkedList= new LinkedListOperation();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode,mySecondNode);
        myLinkedList.printMyNode();
        boolean result=myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode)&&
                myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    void givenNumbersWhenDeleted_ShouldPassLinkListResult(){
        System.out.println("\nDeleted first number");
        MyLinkedList<Integer> myFirstNode = new MyLinkedList<>(56);
        MyLinkedList<Integer> mySecondNode= new MyLinkedList<>(30);
        MyLinkedList<Integer> myThirdNode= new MyLinkedList<>(70);
        LinkedListOperation myLinkedList= new LinkedListOperation();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.pop();
        myLinkedList.printMyNode();
        boolean result=myLinkedList.head.equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    void givenNumbersWhenDeletedFromLast_ShouldPassLinkListResult(){
        System.out.println("\nDeleted Last number");
        MyLinkedList<Integer> myFirstNode = new MyLinkedList<>(56);
        MyLinkedList<Integer> mySecondNode= new MyLinkedList<>(30);
        MyLinkedList<Integer> myThirdNode= new MyLinkedList<>(70);
        LinkedListOperation myLinkedList= new LinkedListOperation();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode, mySecondNode);
        myLinkedList.popLast();
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumberWhenAppendedToLinkedListShouldSearch30() {
        System.out.println("\nSearch number 30");
        MyLinkedList<Integer> myFirstNode= new MyLinkedList<>(56);
        MyLinkedList<Integer> mySecondNode= new MyLinkedList<>(30);
        MyLinkedList<Integer> myThirdNode= new MyLinkedList<>(70);
        LinkedListOperation myLinkedList = new LinkedListOperation();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode, mySecondNode);
        myLinkedList.printMyNode();
        boolean result = myLinkedList.search(mySecondNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumberSearch30InLinkedListShouldBeInserted40After30() {
        System.out.println("\nSearch number 30 and add 40 after it");
        MyLinkedList<Integer> myFirstNode= new MyLinkedList<>(56);
        MyLinkedList<Integer> mySecondNode= new MyLinkedList<>(30);
        MyLinkedList<Integer> myThirdNode= new MyLinkedList<>(70);
        MyLinkedList<Integer> myFourthNode= new MyLinkedList<>(40);
        LinkedListOperation myLinkedList = new LinkedListOperation();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode, mySecondNode);
        myLinkedList.searchThenInsert(mySecondNode, myFourthNode);
        myLinkedList.printMyNode();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void givenSearchNumber40InLinkedListShouldBeDeleted() {
        System.out.println("\nSearch number 40 and delete it");
        MyLinkedList<Integer> myFirstNode= new MyLinkedList<>(56);
        MyLinkedList<Integer> mySecondNode= new MyLinkedList<>(30);
        MyLinkedList<Integer> myThirdNode= new MyLinkedList<>(70);
        MyLinkedList<Integer> myFourthNode= new MyLinkedList<>(40);
        LinkedListOperation myLinkedList = new LinkedListOperation();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode, mySecondNode);
        myLinkedList.searchThenDelete(myFourthNode);
        myLinkedList.printMyNode();
        System.out.println("Size of linked list: " +myLinkedList.size());
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void givenShouldReturn() {
        System.out.println("\nOrdered Linked List");
        OrderedLinkedList<Integer> linkedList = new OrderedLinkedList<>();
        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(70);
        linkedList.add(40);
        linkedList.printMyNodes();
        int head =linkedList.head.data;
        Assert.assertEquals(30, head);
    }
}
