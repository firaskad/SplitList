import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;


public class ListOperationsTest {

    @Test
    public void partitionTest(){
        Assert.assertEquals(Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3)),
                ListOperations.partition(Arrays.asList(1, 2, 3), 2));

    }

    @Test(expected = IllegalArgumentException.class)
    public void partitionTestEmptyList(){
        ListOperations.partition(new ArrayList<>(), 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void partitionTestNegativeSplitValue(){
        ListOperations.partition(Arrays.asList("1", "2"), -1);

    }

}
