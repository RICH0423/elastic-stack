package com.delta.drc.fcoe.log.controller;

import com.delta.drc.fcoe.log.model.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/logs")
public class LogController {

    @GetMapping("/info")
    public CommonResponse getInfoLog() {
        String msg = "Get info logs successful";
        log.info(msg);

        return new CommonResponse(HttpStatus.OK.value(), msg);
    }

    @GetMapping("/warn")
    public CommonResponse getWarnningLog() {
        String msg = "Get warn logs successful";
        log.warn(msg);

        return new CommonResponse(HttpStatus.OK.value(), msg);
    }

    @GetMapping("/error")
    public CommonResponse getErrorLog() {
        String msg = "Throw state error for test.";

        try{
            throw new IllegalStateException();
        } catch (IllegalStateException e) {
            log.error(msg, e);
        } finally {
            return new CommonResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), msg);
        }
    }

}
