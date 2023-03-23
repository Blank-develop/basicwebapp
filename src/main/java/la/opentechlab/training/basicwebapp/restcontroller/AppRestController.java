package la.opentechlab.training.basicwebapp.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AppRestController {
    @GetMapping("/api/v1/name")
    public String getName(){
        return "Bank";
    }

}
