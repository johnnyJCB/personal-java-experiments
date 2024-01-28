public class ConstructorTest {
    public static void main(String[] args) {
        Constructor constructor = new Constructor("John", 1000, "jay@gmail.com");
        System.out.println(constructor.getName() + " " + constructor.getCreditLimit() + " " +
                constructor.getEmailAddress());

        Constructor SecondConstructor = new Constructor("lianne", 10.0, "lili@gmail.com");
        System.out.println(SecondConstructor.getName() + " " + SecondConstructor.getCreditLimit() + " " +
                SecondConstructor.getEmailAddress());

        Constructor constructor1 = new Constructor();
        System.out.println(constructor1.getName() + " " + constructor1.getCreditLimit() + " " +
                constructor1.getEmailAddress());

        Constructor constructor2 = new Constructor("joey", "joey@gamil.com");
        System.out.println(constructor2.getName()+" " + constructor2.getCreditLimit() + " " +
                constructor2.getEmailAddress());


    }


}
