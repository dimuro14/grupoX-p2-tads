package uy.edu.um.tests.binarytree;

import uy.edu.um.prog2.adt.binarytree.SearchBinaryTreeImpl;
import uy.edu.um.prog2.adt.binarytree.BinaryTree;


import org.junit.Before;
import org.junit.jupiter.api.Test;
import uy.edu.um.prog2.exceptions.EmptyStackException;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

    BinaryTree t = new SearchBinaryTreeImpl();

    @Before
    public void setup() {
        BinaryTree t = new SearchBinaryTreeImpl();
    }

    @Test
    void testAdd() {

        t.add("hola");
        assertTrue(t.contains("hola"));
    }

    @Test
    void testRemove() {
        t.add("hola");
        t.remove("hola");
        assertFalse(t.contains("hola"));
    }

    @Test
    void testContains() {
        t.add("hola");
        assertTrue(t.contains("hola"));
        assertFalse(t.contains("mundo"));
    }

    @Test
    void testFind() {
        t.add("hola");
        assertEquals("hola", t.find("hola"));
        assertEquals(null, t.find("mundo"));
    }

    @Test
    void testPreOrder() {

        t.add(0);
        t.add(1);
        t.add(2);
        t.add(-1);
        t.add(-2);

        List<Integer> preOrder = t.preOrder();

        assertEquals(0, preOrder.get(0));
        assertEquals(-1, preOrder.get(1));
        assertEquals(-2, preOrder.get(2));
        assertEquals(1, preOrder.get(3));
        assertEquals(2, preOrder.get(4));

    }

    @Test
    void testPosOrder() {

        t.add(0);
        t.add(1);
        t.add(2);
        t.add(-1);
        t.add(-2);

        List<Integer> posOrder = t.posOrder();

        assertEquals(-2, posOrder.get(0));
        assertEquals(-1, posOrder.get(1));
        assertEquals(2, posOrder.get(2));
        assertEquals(1, posOrder.get(3));
        assertEquals(0, posOrder.get(4));

    }

    @Test
    void testInOrder() {

        t.add(0);
        t.add(1);
        t.add(2);
        t.add(-1);
        t.add(-2);

        List<Integer> inOrder = t.inOrder();

        assertEquals(-2, inOrder.get(0));
        assertEquals(-1, inOrder.get(1));
        assertEquals(0, inOrder.get(2));
        assertEquals(1, inOrder.get(3));
        assertEquals(2, inOrder.get(4));

    }
}