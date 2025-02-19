package realWorldExample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBDataService implements DataService{
    @Override
    public int[] retrieve() {
        return new int[]{1,2,3,4,5,6,7,8,9,10};
    }
}
