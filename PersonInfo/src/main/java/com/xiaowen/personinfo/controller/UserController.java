package com.xiaowen.personinfo.controller;


import com.xiaowen.personinfo.domain.dto.UserDTO;
import com.xiaowen.personinfo.domain.vo.UserVO;
import com.xiaowen.personinfo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xiaowen
 * @since 2025-02-27
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/list")
    public List<UserDTO> pageQueryUsers(@RequestParam ("userIds") List<Long> userIds) {
        System.out.println("############:"+userService.pageQueryUsers(userIds).size()+"############");

        return userService.pageQueryUsers(userIds);
    }

}
