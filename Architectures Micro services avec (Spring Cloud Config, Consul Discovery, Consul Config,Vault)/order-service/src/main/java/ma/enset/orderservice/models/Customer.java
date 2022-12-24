package ma.enset.orderservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Customer {
    private Long id;
    private String name;
    private String email;
}
