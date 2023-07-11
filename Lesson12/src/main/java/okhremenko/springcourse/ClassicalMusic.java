package okhremenko.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype") //Prototype - разные объекты, Singleton(по-умолчанию) каждый раз один и тот же объект
public class ClassicalMusic implements Music {


    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}