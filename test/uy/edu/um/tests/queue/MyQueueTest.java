package uy.edu.um.tests.queue;

import uy.edu.um.prog2.adt.linkedlist.MyLinkedListImpl;
import uy.edu.um.prog2.adt.queue.MyQueue;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import uy.edu.um.prog2.exceptions.EmptyQueueException;

import static org.junit.jupiter.api.Assertions.*;

public class MyQueueTest {

    MyQueue q = new MyLinkedListImpl();

    @Before
    public void setup() {
        MyQueue q = new MyLinkedListImpl();
    }

    @Test
    void testEnqueue() {
        q.enqueue("hola");
        assertEquals("hola", q.get(0));
        q.enqueue("mundo");
        assertEquals("mundo", q.get(0));
    }
    @Test
    void testDequeue() throws EmptyQueueException {
        q.enqueue("hola");
        q.enqueue("mundo");
        q.dequeue();
        assertEquals("mundo", q.get(0));
    }

    @Test
    void testContains() {
        assertFalse(q.contains("hola"));
        q.enqueue("hola");
        assertTrue(q.contains("hola"));
        assertFalse(q.contains("mundo"));
    }

    @Test
    void testSize() {
        assertEquals(0, q.size());
        q.enqueue("hola");
        assertEquals(1, q.size());
        q.enqueue("mundo");
        assertEquals(2, q.size());
    }

    @Test
    void testIsEmpty() {
        assertTrue(q.isEmpty());
        q.enqueue("hola");
        assertFalse(q.isEmpty());
    }

}