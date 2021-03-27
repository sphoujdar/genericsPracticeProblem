import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class GenericsPracticeProblemTest {
    @Test
    public void givenMax_AsFirstElement_ShouldReturnMax(){
        GenericsPracticeProblem testVariable = new GenericsPracticeProblem(6,5,4);
        Assert.assertEquals(testVariable.compareThreeIntegers(),(Integer)6);
    }

    @Test
    public void givenMax_AsSecondElement_ShouldReturnMax(){
        GenericsPracticeProblem testVariable = new GenericsPracticeProblem(12,37,1);
        Assert.assertEquals(testVariable.compareThreeIntegers(),(Integer)37);
    }

    @Test
    public void givenMax_AsThirdElement_ShouldReturnMax(){
        GenericsPracticeProblem testVariable = new GenericsPracticeProblem(8,1000,10001);
        Assert.assertEquals(testVariable.compareThreeIntegers(),(Integer)10001);
    }
}
