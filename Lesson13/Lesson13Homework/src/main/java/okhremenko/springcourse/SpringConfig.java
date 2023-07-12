package okhremenko.springcourse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public List<Music> musicList(){
        return new ArrayList<>()
        {{
            add(rapMusic());
            add(rockMusic());
            add(classicalMusic());
        }};
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

    @Bean
    public Computer computer(){
         return new Computer(musicPlayer());
    }

}
