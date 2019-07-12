import java.lang.annotation.Annotation;

public class AnnotationConfigApplicationContext implements ApplicationContext {

    public AnnotationConfigApplicationContext() {
        Class<Car> carClass = Car.class;
        if(carClass.isAnnotationPresent(Configuration.class)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    @Override
    public <T> T getBean(Class<T> var1) {
        return null;
    }
}
