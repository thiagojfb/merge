class teste{
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        teste t = new teste();
        System.out.println(t.greet("Alice"));

        System.out.println("Sum: " + t.add(5, 7));
    }

    public String greet(String name) {
        return "Hello, " + name + "!";
    }

    public int add(int a, int b) {
        return a + b;
    }
}