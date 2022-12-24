package ma.enset.billingservice;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
// le préfix dans vault c'est user
@ConfigurationProperties(prefix = "user")
@Data
public class MyVaultConfig {
    private String  username;
    private String password;
    private String otp;
}