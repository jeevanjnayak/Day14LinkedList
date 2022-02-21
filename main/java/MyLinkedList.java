public class MyLinkedList <K> implements InterNode<K> {
    private K key;
    private InterNode<K> next;

    public MyLinkedList(K key) {
        this.key =key;
        this.next=null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key=key;
    }

    public InterNode <K> getNext() {
        return next;
    }

    @Override
    public void setNext(InterNode next) {
        this.next=(MyLinkedList <K>) next;
    }
}