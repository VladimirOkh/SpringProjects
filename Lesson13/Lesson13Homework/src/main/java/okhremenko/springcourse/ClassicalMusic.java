package okhremenko.springcourse;


//Prototype - разные объекты, Singleton(по-умолчанию) каждый раз один и тот же объект
public class ClassicalMusic implements Music {


    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}