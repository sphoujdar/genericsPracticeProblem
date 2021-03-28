import org.junit.jupiter.api.Test;
import org.testng.Assert;
import java.util.Optional;

public class GenericsPracticeProblemTest {
    @Test
    public void given3Integers_MaxElementAsFirstElement_ShouldReturnMax() {
        GenericsPracticeProblem testVariable = new GenericsPracticeProblem(6, 5, 4);
        Assert.assertEquals(testVariable.compareThreeWrapperObjects(), 6);
    }

    @Test
    public void given3Integers_MaxElementAsSecondElement_ShouldReturnMax() {
        GenericsPracticeProblem testVariable = new GenericsPracticeProblem(12, 37, 1);
        Assert.assertEquals(testVariable.compareThreeWrapperObjects(), 37);
    }

    @Test
    public void given3Integers_MaxElementAsThirdElement_ShouldReturnMax() {
        GenericsPracticeProblem testVariable = new GenericsPracticeProblem(8, 1000, 10001);
        Assert.assertEquals(testVariable.compareThreeWrapperObjects(), 10001);
    }

    @Test
    public void given3Float_MaxElementAsFirstElement_ShouldReturnMax() {
        GenericsPracticeProblem testVariable = new GenericsPracticeProblem(66.23F, 5.05F, 0.445F);
        Assert.assertEquals(testVariable.compareThreeWrapperObjects(), 66.23F);
    }

    @Test
    public void given3Float_MaxElementAsSecondElement_ShouldReturnMax() {
        GenericsPracticeProblem testVariable = new GenericsPracticeProblem(122.32F, 371.71F, 1.00F);
        Assert.assertEquals(testVariable.compareThreeWrapperObjects(), 371.71F);
    }

    @Test
    public void given3Float_MaxElementAsThirdElement_ShouldReturnMax() {
        GenericsPracticeProblem testVariable = new GenericsPracticeProblem(8.66F, 10.00F, 77.0001F);
        Assert.assertEquals(testVariable.compareThreeWrapperObjects(), 77.0001F);
    }

    @Test
    public void given3String_MaxElementAsFirstElement_ShouldReturnMax() {
        GenericsPracticeProblem<String> testVariable = new GenericsPracticeProblem<String>("Zebra", "Orangutan", "Lemur");
        Assert.assertEquals(testVariable.compareThreeWrapperObjects(), "Zebra");
    }

    @Test
    public void given3String_MaxElementAsSecondElement_ShouldReturnMax() {
        GenericsPracticeProblem<String> testVariable = new GenericsPracticeProblem<String>("Apple", "Peach", "Banana");
        Assert.assertEquals(testVariable.compareThreeWrapperObjects(), "Peach");
    }

    @Test
    public void given3String_MaxElementAsThirdElement_ShouldReturnMax() {
        GenericsPracticeProblem<String> testVariable = new GenericsPracticeProblem<String>("Apple", "Bitcoin", "Capgemini");
        Assert.assertEquals(testVariable.compareThreeWrapperObjects(), "Capgemini");
    }

    @Test
    public void givenStringArray_MaxElementAsLastElement_ShouldReturnMax() {
        GenericsPracticeProblem<String> testVariable = new GenericsPracticeProblem<String>();
        String[] compareElementsArray = {"Aa", "Jo", "Root", "Reema", "Volvo"};
        Assert.assertEquals(testVariable.compareArrayOfWrapperObjects(compareElementsArray), Optional.of("Volvo"));
    }

    @Test
    public void givenIntegerArray_MaxElementAsLastElement_ShouldReturnMax() {
        GenericsPracticeProblem<Integer> testVariable = new GenericsPracticeProblem<Integer>();
        Integer[] compareElementsArray = {88, 0, 661, 55, 3, 4};
        Assert.assertEquals(testVariable.compareArrayOfWrapperObjects(compareElementsArray), Optional.of(661));
    }

    @Test
    public void givenDoubleArray_MaxElementAsLastElement_ShouldReturnMax() {
        GenericsPracticeProblem<Double> testVariable = new GenericsPracticeProblem<Double>();
        Double[] compareElementsArray = {98.22, 6.15, 0.32};
        Assert.assertEquals(testVariable.compareArrayOfWrapperObjects(compareElementsArray), Optional.of(98.22));
    }

    @Test
    public void givenCharacterArray_MaxElementAsLastElement_ShouldReturnMax() {
        GenericsPracticeProblem<Character> testVariable = new GenericsPracticeProblem<Character>();
        Character[] compareElementsArray = {'b', 'h', 'a', 'm', 's', 'h', 'y', 'a'};
        Assert.assertEquals(testVariable.compareArrayOfWrapperObjects(compareElementsArray), Optional.of('y'));
    }
}
