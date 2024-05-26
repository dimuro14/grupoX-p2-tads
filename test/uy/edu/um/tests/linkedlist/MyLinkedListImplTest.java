package uy.edu.um.tests.linkedlist;

import uy.edu.um.prog2.adt.linkedlist.MyLinkedListImpl;
import uy.edu.um.prog2.adt.linkedlist.MyList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListImplTest {

    @Test
    void testEmptySizeIsZero() {
        MyList l = new MyLinkedListImpl();
        assertEquals(0, l.size());
    }

    @Test
    void testSize() {
        MyList l = new MyLinkedListImpl();
        l.add("hola");
        assertEquals(1, l.size());
        l.add("mundo");
        assertEquals(2, l.size());
    }

    @Test
    void testAddToEmptyList(){
        MyList l = new MyLinkedListImpl();
        l.add("hola");
        assertEquals("hola", l.get(0));
    }

    @Test
    void testAddToNonEmptyList(){
        MyList l = new MyLinkedListImpl();
        l.add("hola");
        l.add("mundo");
        assertEquals("mundo", l.get(1));
    }

    @Test
    void get() {
    }

    @Test
    void contains() {
    }

    @Test
    void remove() {
    }

    @Test
    void size() {
    }
}