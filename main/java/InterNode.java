public interface InterNode <K> {
    K getKey();
    void setKey(K key);

    InterNode getNext();
    void setNext(InterNode next);
}
