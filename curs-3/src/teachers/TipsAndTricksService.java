package teachers;

import org.springframework.stereotype.Component;

@Component
public class TipsAndTricksService implements ITeachingService {

    @Override
    public String teachSomething() {
        return "Be consequent!";
    }
}
