package realWorldExample;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataService implements DataService{
    @Override
    public int[] retrieve() {
        return new int[]{11,22,33,44,55,66,77,88,99,100};
    }
}
