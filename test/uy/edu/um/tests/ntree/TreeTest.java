package uy.edu.um.tests.ntree;

import uy.edu.um.prog2.adt.ntree.TreeImpl;
import uy.edu.um.prog2.adt.ntree.Tree;


import org.junit.Before;
import org.junit.jupiter.api.Test;
import uy.edu.um.prog2.exceptions.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class TreeTest {

    Tree t = new TreeImpl(0);

    @Before
    public void setup() {
        Tree t = new TreeImpl(0);
    }

    @Test
    void testAdd() {
        t.add(1, 0);
    }

    @Test
    void testGetValue() {
        assertEquals(0, t.getValue());
        t.setValue(1);
        assertEquals(1, t.getValue());
    }

    @Test
    void testSetValue() {

    }
    @Test
    void testGetChilds() {

    }
    @Test
    void testSearchValue() {

    }
}