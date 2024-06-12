package AbstractClassAndAbstractMethod.Example1;

public class DevApp extends ProjectApp {

    public DevApp() {
        System.out.println("DevApp.DevApp()");
    }
    @Override
    public void task1() {
        System.out.println("DevApp.task1()");
        System.out.println("Task 1 is completed");
    }
    @Override
    public void task2() {
        System.out.println("DevApp.task2()");
        System.out.println("Task 2 is completed");
    }

}
