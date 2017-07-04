package com.yuwei;

import com.yuwei.spring.boot.template.service.PayService;
import com.yuwei.spring.boot.template.service.request.PayRequest;
import com.yuwei.spring.boot.template.service.result.PayResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@PropertySource("classpath:application-dev.properties")
@RestController
public class SpringBootTemplateWebApplication {

    @Value("${application.name}")
    private String applicationName;

    @Value("${application.version}")
    private String applicationVersion;

    @Autowired
    private PayService payService;

    @RequestMapping("/index")
    public String index() {
        return "Hello Spring Boot! Application Name is " + applicationName
               + ". Application Version is " + applicationVersion;
    }

    @RequestMapping("/pay")
    public String pay() {

        PayRequest request = new PayRequest();
        request.setAmount(10);

       PayResult result = payService.pay(request);

       return String.valueOf(result.isSuccess());
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTemplateWebApplication.class, args);
    }
}
