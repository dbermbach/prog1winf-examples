package de.tuberlin.mcc.prog1winf.datastructures;

public class ListRecursiveIterative {

    private Entry head;

    void appendIterative(Object obj) {
        if (head == null) head = new Entry(obj);
        else head.appendIterative(new Entry(obj));
    }

    void appendRecursive(Object obj) {
        if (head == null) head = new Entry(obj);
        else head.appendRecursive(new Entry(obj));
    }

    public static void main(String[] args) {
        ListRecursiveIterative list1 = new ListRecursiveIterative(), list2 = new ListRecursiveIterative();
        for (int i = 1; i < 10; i++) {
            list1.appendIterative(i);
            list2.appendRecursive(i);
        }

        System.out.println("Iterative:" + list1.toStringIterative());
        System.out.println("Recursive:" + list2.toStringRecursive());
    }

    String toStringIterative() {
        String res = "[";
        if (head != null) res += head.toStringIterative();
        return res + "]";
    }

    String toStringRecursive() {
        String res = "[";
        if (head != null) res += head.toStringRecursive();
        return res + "]";
    }


}


class Entry {
    Object value;
    Entry next;

    Entry(Object o) {
        value = o;
    }

    void appendRecursive(Entry entry) {
        if (next == null) next = entry;
        else next.appendRecursive(entry);

    }

    void appendIterative(Entry entry) {
        Entry tmp = this;
        while (tmp.next != null) tmp = tmp.next;
        tmp.next = entry;
    }

    String toStringIterative() {
        String res = "" + value;
        Entry tmp = this.next;
        while (tmp != null) {
            res += "," + tmp.value;
            tmp = tmp.next;
        }
        return res;
    }

    String toStringRecursive() {
        if (next == null) return "" + value;
        return value + "," + next.toStringRecursive();
    }


}