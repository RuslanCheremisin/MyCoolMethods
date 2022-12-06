public class UserClassForTest {
    String name;
    int age;

    public UserClassForTest(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return name + " " + age;
    }
}
