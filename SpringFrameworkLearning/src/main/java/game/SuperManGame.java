package game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperManGameQualifier")
public class SuperManGame implements GamingConsole{
    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Sit down ");
    }

    public void left() {
        System.out.println("Go Left");
    }

    public void right() {
        System.out.println("Shoot a bullet");

    }
}
