public class GenericsPracticeProblem {

    Integer first,second,third;

    public GenericsPracticeProblem(Integer first, Integer second, Integer third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public Integer compareThreeIntegers(){
        if (this.first > this.second && this.first> this.third){
            return this.first;
        }else if (this.second > this.first && this.second> this.third){
            return this.second;
        }else {
            return this.third;
        }
    }
}
