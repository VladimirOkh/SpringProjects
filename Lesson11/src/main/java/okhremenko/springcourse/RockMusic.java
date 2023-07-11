package okhremenko.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music{

    List<String> rockPlaylist = new ArrayList<>(){{
        add("Smells Like Teen Spirit");
        add("Purple Haze");
        add("Under Pressure");
    }};
    @Override
    public String getSong() {
        Random random = new Random();
        int randomSong = random.nextInt(3);
        return "Playing: " + rockPlaylist.get(randomSong);
    }
}
