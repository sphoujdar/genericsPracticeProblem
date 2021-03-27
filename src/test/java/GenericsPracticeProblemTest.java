import org.junit.jupiter.api.Test;
import org.testng.Assert;

import java.util.Optional;

public class GenericsPracticeProblemTest {
    @Test
    public void given3Integers_MaxElementAsFirstElement_ShouldReturnMax(){
        GenericsPracticeProblem testVariable = new GenericsPracticeProblem(6,5,4);
        Assert.assertEquals(testVariable.compareThreeWrapperObjects(),6);
    }

    @Test
    public void given3Integers_MaxElementAsSecondElement_ShouldReturnMax(){
        GenericsPracticeProblem testVariable = new GenericsPracticeProblem(12,37,1);
        Assert.assertEquals(testVariable.compareThreeWrapperObjects(),37);
    }

    @Test
    public void given3Integers_MaxElementAsThirdElement_ShouldReturnMax(){
        GenericsPracticeProblem testVariable = new GenericsPracticeProblem(8,1000,1000);
        Assert.assertEquals(testVariable.compareThreeWrapperObjects(),10001);
    }

    @Test
    public void given3Float_MaxElementAsFirstElement_ShouldReturnMax(){
        GenericsPracticeProblem testVariable = new GenericsPracticeProblem(66.23,5.05,0.445);
        Assert.assertEquals(testVariable.compareThreeWrapperObjects(),66.23);
    }

    @Test
    public void given3Float_MaxElementAsSecondElement_ShouldReturnMax(){
        GenericsPracticeProblem testVariable = new GenericsPracticeProblem(122.32,371.71,1.00);
        Assert.assertEquals(testVariable.compareThreeWrapperObjects(),371.71);
    }

    @Test
    public void given3Float_MaxElementAsThirdElement_ShouldReturnMax(){
        GenericsPracticeProblem testVariable = new GenericsPracticeProblem(8.66,10.00,77.0001);
        Assert.assertEquals(testVariable.compareThreeWrapperObjects(),77.0001);
    }

    @Test
    public void given3String_MaxElementAsFirstElement_ShouldReturnMax(){
        GenericsPracticeProblem testVariable = new GenericsPracticeProblem("Zebra","Orangutan","Lemur");
        Assert.assertEquals(testVariable.compareThreeWrapperObjects(),"Zebra");
    }

    @Test
    public void given3String_MaxElementAsSecondElement_ShouldReturnMax(){
        GenericsPracticeProblem testVariable = new GenericsPracticeProblem("Apple","Peach","Banana");
        Assert.assertEquals(testVariable.compareThreeWrapperObjects(),"Peach");
    }

    @Test
    public void given3String_MaxElementAsThirdElement_ShouldReturnMax(){
        GenericsPracticeProblem testVariable = new GenericsPracticeProblem("Apple","Bitcoin","Capgemini");
        Assert.assertEquals(testVariable.compareThreeWrapperObjects(),"Capgemini");
    }
}
