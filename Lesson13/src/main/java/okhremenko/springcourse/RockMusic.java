package okhremenko.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RockMusic implements Music{

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
