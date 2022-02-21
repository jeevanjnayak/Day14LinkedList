public class LinkedListOperation <K> {
    public InterNode head;
    public InterNode tail;

    public LinkedListOperation() {
        this.head=null;
        this.tail=null;
    }

    public void add(InterNode newNode) {

        if (this.tail==null){
            this.tail=newNode;
        }
        if (this.head==null){
            this.head=newNode;
        }else {
            InterNode tempNode=this.head;
            this.head=newNode;
            this.head.setNext(tempNode);
        }
    }

    public void append(InterNode myNode) {
        if (this.head==null){
            this.head=myNode;
        }
        if (this.tail==null){
            this.tail=myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail=myNode;
        }
    }

    public void insert (InterNode myNode, InterNode newNode) {
        InterNode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }
    public InterNode pop () {
        InterNode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public InterNode popLast() {
        InterNode tempNode = head;
        while(!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode.setNext(null);
        return tempNode;
    }

    public boolean search(InterNode node) {
        InterNode tempNode = head;
        boolean found = false;
        while(tempNode.getNext() != null) {
            if(tempNode.getKey() == node.getKey()) {
                found = true;
            }
            tempNode = tempNode.getNext();
        }
        return found;
    }

    public void searchThenInsert(InterNode searchNode, InterNode insertNode) {
        LinkedListOperation n = new LinkedListOperation();
        InterNode tempNode = head;
        boolean inserted = false;
        while(tempNode.getNext() != null) {
            if(tempNode.getKey() == searchNode.getKey()) {
                n.insert(searchNode,insertNode);
            }
            tempNode = tempNode.getNext();
        }
    }

    public void searchThenDelete(InterNode deleteNode) {
        LinkedListOperation linkedList = new LinkedListOperation();
        InterNode tempNode = head;
        boolean inserted = false;
        while(tempNode.getNext() != null) {
            if(tempNode.getKey() == deleteNode.getKey()) {
                linkedList.pop();
            }
            tempNode = tempNode.getNext();
        }
    }


    public int size() {
        InterNode tempNode = head;
        int count = 1;
        while(tempNode.getNext() != null) {
            count++;
            tempNode = tempNode.getNext();
        }
        return count;
    }

    public void printMyNode(){
        StringBuffer myNodes=new StringBuffer("My Nodes :");
        InterNode tempNode=head;
        while (tempNode.getNext()!=null){
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail))myNodes.append("->");
            tempNode=tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

}