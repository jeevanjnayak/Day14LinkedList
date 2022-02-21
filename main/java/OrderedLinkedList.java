public class OrderedLinkedList<K extends Comparable<K>> {
    MyNode<K> head;
    MyNode<K> tail;
    MyNode<K> current;
    int position;

    public OrderedLinkedList(){
        head = null;
        current = null;
        tail = null;
        position = -1;
    }

    public void list(){
        MyNode<K> tempCurrent = head;
        while(tempCurrent != null){
            System.out.print(tempCurrent.data+",");
            tempCurrent = tempCurrent.next;
        }
    }

    public void add(K data)
    {

        MyNode<K> newNode = new MyNode<K>(data);
        if(head == null) {
            head = newNode;
            current = head;
        }
        else if(head.data.compareTo(data) > 0)
        {
            newNode.next = head;
            head = newNode;
        }
        else if(current.data.compareTo(data) < 0) {
            current.next = newNode;
            current = newNode;
        }
        else {
            MyNode<K> tempPrev = head;
            MyNode<K> tempCurrent = head.next;

            while((tempCurrent != current) && (tempCurrent.data.compareTo(data) < 0)) {
                tempPrev = tempCurrent;
                tempCurrent = tempCurrent.next;

            }
            tempPrev.next = newNode;
            newNode.next = tempCurrent;
        }
        position++;
    }

    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        MyNode<K> tempNode = head;
        while (tempNode.next != null) {
            myNodes.append(tempNode.data);
            if(!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.next;
        }
        myNodes.append(tempNode.data);
        System.out.println(myNodes);
    }

    static class MyNode<K>{
        K data;
        MyNode<K> next;

        MyNode(K data){
            this.data = data;
            next = null;
        }
    }
}
