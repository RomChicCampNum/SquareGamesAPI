package SquareGameAPI.demo;

import org.springframework.stereotype.Service;

@Service
public class RandomHeartbeat implements HeartbeatSensor {
    @Override
    public int get() {
        return (int) (Math.random() * 100); // Par exemple, entre 0 et 99
    }
}

