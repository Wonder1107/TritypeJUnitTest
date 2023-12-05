package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeConditionTest {
    //    选择的 decision 为
    //    Side1+Side2 <= Side3 || Side2+Side3 <= Side1 || Side1+Side3 <= Side2
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        //        Side1+Side2 <= Side3
        assertEquals(4, tri.Triang(1, 3, 4));
        assertEquals(4, tri.Triang(4, 1, 5));
        //        Side2+Side3 <= Side1
        assertEquals(4, tri.Triang(5, 1, 4));
        assertEquals(4, tri.Triang(4, 1, 3));

        //        Side1+Side3 <= Side2
        assertEquals(4, tri.Triang(1, 4, 3));
        assertEquals(4, tri.Triang(1, 5, 4));
    }


}