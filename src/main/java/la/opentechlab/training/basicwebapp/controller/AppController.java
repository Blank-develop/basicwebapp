package la.opentechlab.training.basicwebapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class AppController {

    @GetMapping
     public String main(){
         return "index.html";
     }
}
