package io.schultz.dustin.todoapp.endpoint;


import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "readiness")
public class ReadinessEndpoint {
    private String reeady = "Not_Ready";

    @ReadOperation
    public String getReadiness() {
        return reeady;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void setReeady(){
        reeady = "READY";

    }
}
