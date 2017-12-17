package demo.fastpassconsole;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface TollSource {
    String FASTPASSTOLLCHANNEL = "fastpasstollchannel";
    String STANDARDTOLLCHANNEL = "standardtollchannel";

    @Output(FASTPASSTOLLCHANNEL)
    MessageChannel fastToll();

    @Output(STANDARDTOLLCHANNEL)
    MessageChannel standardToll();
}
