package opgave03.modelsObserverPatternWithManyTypes;

public class Main {
    public static void main(String[] args) {
        ObservableBag<String> bag = new ObservableBag<>();
        PrintingObserver<String> observer = new PrintingObserver<>();

        bag.addObserver(observer);

        bag.add("beer");
        bag.add("beer");
        bag.add("peanuts");
        bag.remove("beer");
        bag.remove("beer");
        bag.remove("peanuts");
        bag.remove("something-not-in-bag");  // should do nothing
    }
}