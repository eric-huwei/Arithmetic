package com.eric.linked;

/**
 * @DESCIRPTION 基于单链表LRU算法
 * @AUTHOR SCORPIO.HU
 * @DATE 2019-03-21 22:38
 */
public class LRUBaseLinkedList<T> {

    /**
     * 默认链表容量
     */
    private static final Integer DEFAULT_CAPACITY = 5;

    /**
     * 头节点
     */
    private SNode headNode;

    /**
     * 链表长度
     */
    private Integer length;

    /**
     * 链表容量
     */
    private Integer capacity;

    public LRUBaseLinkedList() {
        this.headNode = new SNode<T>();
        this.capacity = DEFAULT_CAPACITY;
        this.length = 0;
    }

    public void add(T data) {
        SNode preNode = findPreNode(data);

        //如果元素存在，删除原节点，再插入链表头部
        if (preNode != null) {
            deleteElemOptim(preNode);
            insertElemAtBegin(data);
        } else {
            if (length >= this.capacity) {
                deleteElemAtEnd();
            }
            insertElemAtBegin(data);
        }
    }

    /**
     * 删除尾结点
     */
    private void deleteElemAtEnd() {
        SNode ptr = headNode;

        if (ptr.getNext() == null) {
            return;
        }

        while (ptr.getNext().getNext() != null) {
            ptr = ptr.getNext();
        }

        SNode temp = ptr.getNext();
        ptr.setNext(null);
        temp = null;
        length--;
    }

    /**
     * 插入新结点
     */
    private void insertElemAtBegin(T data) {
        SNode next = headNode.getNext();
        headNode.setNext(new SNode(data, next));
        length++;
    }

    /**
     * 删除preNode结点下一个元素
     */
    private void deleteElemOptim(SNode preNode) {
        SNode temp = preNode.next;
        preNode.setNext(temp.next);
        temp = null;
        length--;
    }

    /**
     * 获取查找元素的前一个节点
     */
    private SNode findPreNode(T data) {
        SNode node = headNode;

        while (node.getNext() != null) {
            if (data.equals(node.getNext().getElement())) {
                return node;
            }

            node = node.getNext();
        }
        return null;
    }

    public class SNode<T> {
        private T element;
        private SNode next;

        public SNode() {
        }

        public SNode(T element) {
            this.element = element;
        }

        public SNode(T element, SNode next) {
            this.element = element;
            this.next = next;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public SNode getNext() {
            return next;
        }

        public void setNext(SNode next) {
            this.next = next;
        }
    }
}
