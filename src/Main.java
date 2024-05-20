//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        long startTime = System.nanoTime();

        long iteration = fibonacci.iteration(30);
        long iterationTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        long recursion = fibonacci.recursion(30);
        long recursionTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        long dynamicProgramming30 = fibonacci.dynamicProgramming(30);
        long dynamicProgramming30Time = System.nanoTime() - startTime;
        startTime = System.nanoTime();
        long dynamicProgramming = fibonacci.dynamicProgramming(30);
        long dynamicProgrammingTime = System.nanoTime() - startTime;
        System.out.println("For n = 6");
        System.out.println("Fibonacci iteration = " + fibonacci.iteration(6));
        System.out.println("Fibonacci recursion = " + fibonacci.recursion(6));
        System.out.println("Fibonacci dynamic programming = " + fibonacci.dynamicProgramming(6) + "\n");
        System.out.println("For n = 30");
        System.out.println("Fibonacci iteration = " + iteration);
        System.out.println("iterationTime = " + iterationTime + "\n");
        System.out.println("Fibonacci recursion = " + recursion);
        System.out.println("recursionTime = " + recursionTime + "\n");
        System.out.println("Fibonacci dynamic programming = " + dynamicProgramming);
        System.out.println("dynamicProgrammingTime (new index)= " + dynamicProgramming30Time);
        System.out.println("dynamicProgrammingTime (existing index) = " + dynamicProgrammingTime);
    }
}