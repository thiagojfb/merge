class teste{
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        teste t = new teste();
        System.out.println(t.greet("João"));

        System.out.println("Sum: " + t.add(5, 7));
        System.out.println("Division: " + t.divide(10, 2));
        System.out.println("Difference: " + t.subtract(10, 3));
        System.out.println("Product: " + t.multiply(4, 6));
        System.out.println("Square Root: " + t.squareRoot(16));
    }

    public String greet(String name) {
        return "Hello, " + name + "!";
    }

    public int add(int a, int b) {
        return a + b;
    }

    //divisão
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        return a / b;
    }

    //raiz quadrada
    public double squareRoot(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot compute square root of negative number.");
        }
        return Math.sqrt(a);
    }

    //subtração
    public int subtract(int a, int b) {
        return a - b;
    }

    //multiplicação
    public int multiply(int a, int b) {
        return a * b;
    }
}