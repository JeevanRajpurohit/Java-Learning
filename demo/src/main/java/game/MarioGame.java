package game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {

    public void up() {
        System.out.println("Jump Up Please");
    }

    public void down() {
        System.out.println("Go into a hole/ down");
    }

    public void left() {
        System.out.println("Go back.");
    }

    public void right() {
        System.out.println("Accelerate.");
    }
}
