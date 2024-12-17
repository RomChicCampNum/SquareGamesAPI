import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeartbeatController {
    @Autowired
    private HeartbeatSensor sensor;

    @GetMapping("/heartbeat")
    public int getHeartbeat() {
        return sensor.get();
    }
}
