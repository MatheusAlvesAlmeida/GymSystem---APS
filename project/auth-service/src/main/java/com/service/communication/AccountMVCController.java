package com.service.communication;

import com.service.model.account.AccountController;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/account")
@Slf4j
public class AccountMVCController {

    @Autowired
    private AccountController controller;

    @PostMapping("/login")
    public Boolean create(@RequestParam Map<String, String> params) {
        log.info("AccountMVCController.create");
        return controller.get(params.get("cpf"));
    }

}
