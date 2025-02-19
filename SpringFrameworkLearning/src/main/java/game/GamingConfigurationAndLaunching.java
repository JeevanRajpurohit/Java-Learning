package game;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("game")            //game runner + gamingConsole both will work
public class GamingConfigurationAndLaunching {
//
//    @Bean
//    public GamingConsole game() {
//        var game = new PacmanManGame();
//        return game;
//    }
//
//    @Bean
//    public GameRunner gameRunner(GamingConsole game) {
//        var gameRunner = new GameRunner(game);
//        return gameRunner;
//    }

    @Bean
    @Primary
    public GamingConsole game2(){
        var game2= new MarioGame();
        return game2;
    }

    @Bean
    @Primary
    public GameRunner gameRunner1(GamingConsole game2){
        System.out.println("Paramter :" + game2);   // also auto wired + component and componentScan uses.
        var gameRunner2 = new GameRunner(game2);
        return gameRunner2;
    }
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingConfigurationAndLaunching.class)) {
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();

        }
    }

}
