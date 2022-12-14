package domain;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ORDERS")
public class Order extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ORDER_ID")
    private Long id;

    private LocalDateTime orderDate;

    @Enumerated( EnumType.STRING )
    private OrderStatus status;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn( name = "MEMBER_ID" )
    private Member member;

    @OneToMany( mappedBy = "order", cascade = CascadeType.ALL )
    private List<OrderItem> orderItems = new ArrayList<>();

    @OneToOne( fetch = FetchType.LAZY, cascade = CascadeType.ALL )
    @JoinColumn(name = "DELIVARY_ID")
    private Delivery delivary;



}
