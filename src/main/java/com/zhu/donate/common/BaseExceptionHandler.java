package com.zhu.donate.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class BaseExceptionHandler {

    @ExceptionHandler
    public Result exception(Exception e){
        log.error("异常信息：{}",e.getMessage());
        return Result.getFailure().setData(e.getMessage());
    }
}
