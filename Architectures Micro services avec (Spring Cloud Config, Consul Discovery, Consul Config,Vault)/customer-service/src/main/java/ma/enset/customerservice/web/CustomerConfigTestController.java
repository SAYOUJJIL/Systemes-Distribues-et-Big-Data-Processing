package ma.enset.customerservice.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
//annotation de actuator , quand j'appel a chaque fait un refresh , et demander ma configuration ou mes properties à nouveau
@RefreshScope
public class CustomerConfigTestController {

    //Injecter dans p1 la valeur de la configuration
    @Value("${global.params.p1}")
    private String p1;
    @Value("${global.params.p2}")
    private String p2;
    @Value("${customer.params.x}")
    private String x;
    @Value("${customer.params.y}")
    private String y;

    @GetMapping("/params")
    public Map<String,String> params(){
        return Map.of("p1",p1,"p2",p2,"x",x,"y",y);
    }
}