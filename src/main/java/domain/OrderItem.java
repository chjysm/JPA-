package domain;


import javax.persistence.*;

@Entity
public class OrderItem extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    private int orderPrice;
    private int count;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn(name = "ITEM_ID")
    private Item item;

    @ManyToOne( fetch = FetchType.LAZY )
    @JoinColumn(name = "ORDER_ID")
    private Order order;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
