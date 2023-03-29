package main.java.com.service.comunication;

import lombok.extern.slf4j.Slf4j;
import java.util.Collections;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/account")
@Slf4j
public class AccountMVCController {

    @Autowired
    private AccountController controller;

    @PostMapping("/login")
    public Boolean create(@RequestParam Map<String, String> params) {
        log.info("AccountMVCController.create");
        return controller.login(params);
    }

}