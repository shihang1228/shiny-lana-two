package com.baldurtech.contact;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;

@Controller
@RequestMapping("contact")
public class ContactController {
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String contactList() {
        return "contact/list";
    }
}