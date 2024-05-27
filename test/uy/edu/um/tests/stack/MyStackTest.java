package uy.edu.um.tests.stack;

import uy.edu.um.prog2.adt.linkedlist.MyLinkedListImpl;
import uy.edu.um.prog2.adt.stack.MyStack;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import uy.edu.um.prog2.exceptions.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    MyStack s = new MyLinkedListImpl();

    @Before
    public void setup() {
        MyStack s = new MyLinkedListImpl();
    }

    @Test
    void testPush() {
        s.push("hola");
        assertEquals("hola", s.peek());
        s.push("mundo");
        assertEquals("mundo", s.peek());
    }
    @Test
    void testPop() throws EmptyStackException {
        s.push("hola");
        s.push("mundo");
        s.pop();
        assertEquals("hola", s.peek());
    }

    @Test
    void testSize() {
        assertEquals(0, s.size());
        s.push("hola");
        assertEquals(1, s.size());
        s.push("mundo");
        assertEquals(2, s.size());
    }

    @Test
    void testIsEmpty() {
        assertTrue(s.isEmpty());
        s.push("hola");
        assertFalse(s.isEmpty());
    }

}