package uy.edu.um.tests.linkedlist;

import uy.edu.um.prog2.adt.linkedlist.MyLinkedListImpl;
import uy.edu.um.prog2.adt.linkedlist.MyList;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyListTest {

    MyList l = new MyLinkedListImpl<>();

    @Before
    public void setup() {
        MyList l = new MyLinkedListImpl<>();
    }

    @Test
    void testAddToEmptyList() {
        l.add("hola");
        assertEquals("hola", l.get(0));
    }

    @Test
    void testAddToNonEmptyList() {
        l.add("hola");
        l.add("mundo");
        assertEquals("mundo", l.get(1));
    }

    @Test
    void testRemove() {
        l.add("hola");
        l.add("mundo");
        l.remove("hola");
        assertEquals("mundo", l.get(0));
    }

    @Test
    void testSize() {
        l.add("hola");
        assertEquals(1, l.size());
        l.add("mundo");
        assertEquals(2, l.size());
    }

    @Test
    void testEmptySizeIsZero() {
        assertEquals(0, l.size());
    }

    @Test
    void testContains() {
        l.add("hola");
        assertTrue(l.contains("hola"));
        assertFalse(l.contains("mundo"));
    }
}