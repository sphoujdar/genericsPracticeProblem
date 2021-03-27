import java.util.Optional;

public class GenericsPracticeProblem <T extends Comparable<T>> {

    T first,second,third;

    public GenericsPracticeProblem(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T compareFourWrapperObjects(){
        T maxElement = this.first;
        if (this.second.compareTo(maxElement) > 0)
            maxElement = this.second;
        if (this.third.compareTo(maxElement) > 0)
            maxElement = this.third;
        return maxElement;
    }

    public T compareThreeWrapperObjects(){
        T maxElement = this.first;
        if (this.second.compareTo(maxElement) > 0)
            maxElement = this.second;
        if (this.third.compareTo(maxElement) > 0)
            maxElement = this.third;
        printMax(maxElement);
        return maxElement;
    }

    public void printMax(T maxElement){
        System.out.println("Max Element is: "+ maxElement);
    }
}
