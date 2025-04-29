package app.model;

import org.springframework.stereotype.Component;

@Component
public class Timer{

    private Long nanoTime;

    public Timer(){
        nanoTime = System.nanoTime();
    }

    public Long getTime() {
        return nanoTime;
    }
}
