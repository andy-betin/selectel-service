package ru.students.selectelservice.ui.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.students.selectelservice.ui.dto.TestInputRequest;
import ru.students.selectelservice.ui.dto.TestInputResponse;

@Slf4j
@Controller
public class TestInputController {

    @PostMapping("/test_request")
    @ResponseBody
    public TestInputResponse testInputMethod(@RequestBody TestInputRequest request) {
        log.info("Got test request {}", request.toString());

        TestInputResponse response = new TestInputResponse();
        response.setMessage("Your message:" + request.getMessage());
        return response;
    }
}
