package com.weishuqi.like.web;

import com.weishuqi.like.domain.LoveConfession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoveDeclarationController {

//    @PostMapping("/declare")
//    public String declareLove(@RequestParam String name, Model model) {
//        model.addAttribute("name", name);
//        return "loveDeclared";
//    }

    @GetMapping("/")
    public String index(Model model) {
        return "index";
    }

    @GetMapping("/aixin")
    public String aixin(Model model) {
        return "aixin_02";
    }

    @GetMapping("/confession")
    public String showConfessionForm(Model model) {
        model.addAttribute("loveConfession", new LoveConfession());
        return "confession";
    }

    @GetMapping("/romantic")
    public String romantic(Model model) {
        // model.addAttribute("loveConfession", new LoveConfession());
        return "romantic_01";
    }

    @GetMapping("/love")
    public String love(Model model) {
        model.addAttribute("loveConfession", new LoveConfession());
        return "love";
    }


    @GetMapping("/loveLetter")
    public String loveLetter(Model model) {
        return "loveLetter03";
    }


    @GetMapping("/girl")
    public String girl(Model model) {
        return "girl_04";
    }

    @GetMapping("/a004")
    public String a004(Model model) {
        return "004";
    }

    @GetMapping("/yanhua")
    public String yanhua (Model model){
        return "yanhua_05";
    }

    @GetMapping("/like")
    public String like (Model model){
        return "like_06";
    }
    @GetMapping("/yaobailovexin")
    public String yaobailovexin(Model model){
        return "yaobailovexin_07";

    }


    @GetMapping("/betogether")
    public String betogether(Model model){
        return "betogether_08";
    }


    @GetMapping("/staymarriedforever")
    public String staymarriedforever(Model model){
        return "staymarriedforever_19";
    }


    @GetMapping("/heartbeat")
    public String heartbeat(Model model){
        return "heartbeat_18";
    }
    @GetMapping("/wei")
    public String wei(Model model){
        return "wei_17";
    }

    @GetMapping("/loveWei")
    public String loveWei(Model model){
        return "wei_16";
    }

    @GetMapping("/loveWei_")
    public String loveWei_(Model model){
        return "wei_15";
    }





}