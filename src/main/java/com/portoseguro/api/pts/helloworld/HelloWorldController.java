package com.portoseguro.api.pts.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContext;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class HelloWorldController {
    @Autowired
    private MessageSource messageSource;

    //@RequestMapping(method= RequestMethod.GET, path="/hello-angel")
    @GetMapping(path="/hello-angel")
    public String helloWorld(){
        return "Hello angel";
    }

    @GetMapping(path="hello-angel-bean")
    public HelloWolrdBean helloWorldBean(){
        return new HelloWolrdBean("hello angel bean");
    }

    @GetMapping(path="hello-angel/path-variable/{name}")
    public HelloWolrdBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWolrdBean(String.format("hello angel bean %s", name));
    }

    @GetMapping(path="/hello-world-internationalized")
    public String helloWorldInternationalized(
//            @RequestHeader(name="Accept-Language", required = false) Locale locale
    ){
//        return messageSource
//                .getMessage("good.morning.message", null, "Default Message",locale);
        return messageSource.getMessage("good.morning.message", null, "Default Message",
                LocaleContextHolder.getLocale());
    }
}
