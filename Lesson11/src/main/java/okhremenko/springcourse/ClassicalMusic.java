package okhremenko.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    List<String> classicalPlaylist = new ArrayList<>(){{
        add("Hungarian Rhapsody");
        add("Fur Elise");
        add("Gymnopedie");
    }};



    @Override
    public String getSong() {
        Random random = new Random();
        int randomSong = random.nextInt(3);
        return "Playing: " + classicalPlaylist.get(randomSong);
    }
}