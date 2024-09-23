public class HelloWorld {
    public String sayHello() {
        return "Hello, World! from src-bk";
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.sayHello());
    }
}