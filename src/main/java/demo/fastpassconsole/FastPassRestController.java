package demo.fastpassconsole;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class FastPassRestController {

    @Autowired
    TollSource mySource;

    @PostMapping(path = "/toll")
    public String publishMessage (@RequestBody String payload) {
        System.out.println(payload);
        Random random = new Random();
        mySource.fastToll().send(MessageBuilder.withPayload(payload)
                .setHeader("header", random.nextInt(8) * 10)
                .build());
        return "success";
    }
}
