package algorithms;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {


    private MyArrayList<Integer> myArrayList;

    @BeforeEach
    public void setup() {
        myArrayList = new MyArrayList<>();
    }

    @AfterEach
    public void tearDown() {
        myArrayList = null;
    }


    @Test
    public void testAddOne() {
        boolean added = myArrayList.add(1);

        assertTrue(added);
        assertEquals(1, myArrayList.size());
    }

    @Test
    public void testResize() {
        assertThat(myArrayList.size(), is(0));

        for (int i = 0; i < 40; i++) {
            myArrayList.add(i);
        }

        assertThat(myArrayList.size(), is(40));
    }

    @Test
    public void remove() {
        assertThat(myArrayList.size(), is(0));

        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);

        assertThat(myArrayList.size(), is(3));

        myArrayList.remove(1);
        assertThat(myArrayList.contains(2), is(false));
        assertThat(myArrayList.size(), is(2));

        myArrayList.remove(0);
        assertThat(myArrayList.contains(1), is(false));
        assertThat(myArrayList.contains(3), is(true));
        assertThat(myArrayList.size(), is(1));
    }
}
