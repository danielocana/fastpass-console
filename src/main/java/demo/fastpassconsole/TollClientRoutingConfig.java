package demo.fastpassconsole;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

public class TollClientRoutingConfig {

    @Autowired
    IClientConfig ribbonClientConfig;

    public IRule ribbonRule (IClientConfig IClientConfig) {
        System.out.println("Daniel");
        return new WeightedResponseTimeRule();
    }
}
