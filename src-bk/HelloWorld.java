public class HelloWorld {
    public String sayHello() {
        return "Hello, World! from src-bk to check the difference";
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.sayHello());
    }
}