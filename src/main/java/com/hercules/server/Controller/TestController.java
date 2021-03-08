package com.hercules.server.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class TestController {
    @GetMapping("/test")
    public String test() {
        return "Hercules server test success";
    }
}
