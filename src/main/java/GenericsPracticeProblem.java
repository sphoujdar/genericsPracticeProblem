import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class GenericsPracticeProblem <T extends Comparable<T>> {

    T first,second,third;

    public GenericsPracticeProblem() {
    }

    public GenericsPracticeProblem(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T compareThreeWrapperObjects(){
        T maxElement = this.first;
        if (this.second.compareTo(maxElement) > 0)
            maxElement = this.second;
        if (this.third.compareTo(maxElement) > 0)
            maxElement = this.third;
        printMax(Optional.of((maxElement)));
        return maxElement;
    }

    public Optional<T> compareArrayOfWrapperObjects(T ... parameter){
        Optional<T> maxElement;
        maxElement = Arrays.stream(parameter).sorted(Comparator.reverseOrder()).findFirst();
        printMax(maxElement);
        return maxElement;
    }

    public void printMax(Optional<T> maxElement){
        System.out.println("Max Element is: "+ maxElement.get());
    }
}
