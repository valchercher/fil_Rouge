package sarrpc.tech.sprint_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "test")
public class TestController {
    @GetMapping(path = "string")
    public String getString(){
        return "hello word is sarrpc";
    }  @GetMapping()
    public List<String> getList(){
        return List.of("hello word"," is sarrpc");
    }
}
