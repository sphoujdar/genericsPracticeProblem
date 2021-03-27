import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class GenericsPracticeProblemTest {
    @Test
    public void givenIntegers_MaxElementAsFirstElement_ShouldReturnMax(){
        GenericsPracticeProblem testVariable = new GenericsPracticeProblem(6,5,4);
        Assert.assertEquals(testVariable.compareThreeWrapperObjects(),6);
    }

    @Test
    public void givenIntegers_MaxElementAsSecondElement_ShouldReturnMax(){
        GenericsPracticeProblem testVariable = new GenericsPracticeProblem(12,37,1);
        Assert.assertEquals(testVariable.compareThreeWrapperObjects(),37);
    }

    @Test
    public void givenIntegers_MaxElementAsThirdElement_ShouldReturnMax(){
        GenericsPracticeProblem testVariable = new GenericsPracticeProblem(8,1000,10001);
        Assert.assertEquals(testVariable.compareThreeWrapperObjects(),10001);
    }

    @Test
    public void givenFloat_MaxElementAsFirstElement_ShouldReturnMax(){
        GenericsPracticeProblem testVariable = new GenericsPracticeProblem(66.23,5.05,0.445);
        Assert.assertEquals(testVariable.compareThreeWrapperObjects(),66.23);
    }

    @Test
    public void givenFloat_MaxElementAsSecondElement_ShouldReturnMax(){
        GenericsPracticeProblem testVariable = new GenericsPracticeProblem(122.32,371.71,1.00);
        Assert.assertEquals(testVariable.compareThreeWrapperObjects(),371.71);
    }

    @Test
    public void givenFloat_MaxElementAsThirdElement_ShouldReturnMax(){
        GenericsPracticeProblem testVariable = new GenericsPracticeProblem(8.66,10.00,77.0001);
        Assert.assertEquals(testVariable.compareThreeWrapperObjects(),77.0001);
    }
}
