package com.aston.home_work_3.contriller;

import com.aston.home_work_3.service.RecordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Collection;

@RestController
public class RecordServiceController {

    private final RecordService service;

    public RecordServiceController(RecordService service) {
        this.service = service;
    }

    @GetMapping("/input")
    public void getInput(@RequestParam("line") String line) throws IOException {
        service.getInput(line);
    }

    @GetMapping("/read")
    public Collection<String> getOutput(){
        return service.getOutput();
    }
}
