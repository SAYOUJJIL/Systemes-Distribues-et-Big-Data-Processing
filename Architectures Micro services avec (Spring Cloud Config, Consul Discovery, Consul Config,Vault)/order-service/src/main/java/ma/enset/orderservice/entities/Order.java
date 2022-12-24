package ma.enset.orderservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.enset.orderservice.enums.OrderStatus;
import ma.enset.orderservice.models.Customer;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @Builder
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date createdAt;
    private OrderStatus status;
    private Long customerId;
    //ce n'est pas la peine de prendre en consideration cet attribut
    @Transient
    private Customer customer;
    @OneToMany(mappedBy = "order")
    private List<ProductItem> productItems;
    public double getTotal(){
        double somme=0;
        for (ProductItem pi:productItems) {
            somme+= pi.getAmount();
        }
        return somme;
    }
}
