class teste{
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        teste t = new teste();
        System.out.println(t.greet("João"));
    }

    public String greet(String name) {
        return "Hello, " + name + "!";
    }

    //subtração
    public int subtract(int a, int b) {
        return a - b;
    }
}