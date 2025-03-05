package com.xiaowen.personinfo.controller;

import com.xiaowen.personinfo.domain.dto.UserDTO;
import com.xiaowen.personinfo.exception.ResourceNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ExceptionController {

    @GetMapping("/resourceNotFound")
    public void throwException() {
        UserDTO userDTO= new UserDTO( "wenbao", "123456", "123456@qq.com", LocalDate.now(), 1, 1);
        Map<String, Object> data = new HashMap<>();
        data.put("User not found", userDTO);
        throw new ResourceNotFoundException(data);
    }

}