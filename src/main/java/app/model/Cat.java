package app.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {

    @Override
    public String toString() {
        return "Im a Cat";
    }
}
