package demo.fastpassconsole;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.core.MessageSource;
import org.springframework.integration.support.MessageBuilder;

import java.util.Random;

@EnableBinding(TollSource.class)
public class TollPublisher {

    Random random = new Random();

    @Bean
    //@InboundChannelAdapter(channel =  TollSource.FASTPASSTOLLCHANNEL, poller = @Poller(fixedDelay = "2000"))
    public MessageSource<Toll> sendTollCharge(){
        return () -> MessageBuilder
                .withPayload(new Toll("20","100","2017-12-16T14:14:14"))
                .setHeader("speed", random.nextInt(8) * 10)
                .build();
    }
}