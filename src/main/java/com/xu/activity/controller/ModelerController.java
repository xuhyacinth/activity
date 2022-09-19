package com.xu.activity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Tom
 */
@Controller
public class ModelerController {

    @GetMapping("editor")
    public String editor() {
        return "/modeler";
    }

}