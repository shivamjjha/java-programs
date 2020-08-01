/**
 * Program to show the use of ‘final’ keyword.
 */
public class finalKeyword {
    static final int weight = 120;

    void modifyFinal() {
        // Following line if uncommented, will give compile time error
        // weight = 30;
        System.out.println("Soory, cannot re-initialize final variable.");
    }

    // final method, therefore cannot be overriden in derived class
    static final int getWeight() {
        return weight;
    }

    void mangoFunction() {
        System.out.println("Hey, I am a good old normal function.");
    }

    public static void main(String[] args) {
        System.out.println(getWeight());

        foo obj = new foo();
        obj.mangoFunction();
    }
}

class foo extends finalKeyword {
    @Override
    void mangoFunction() {
        super.mangoFunction();
        System.out.println("I am an overriden function now");
    }

    // Following piece of coe will give error if uncommented
    /*
     * @Override int getWeight () { return weight * 1.2; }
     */
}