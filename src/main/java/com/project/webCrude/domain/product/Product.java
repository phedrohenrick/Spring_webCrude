package com.project.webCrude.domain.product;

import jakarta.persistence.*;
import lombok.*; // a notação dessa biblioteca fará a geração dops getter e setter e dos construtores de forma automática.

@Table(name ="product")
@Entity(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class Product {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private Integer price_in_cents;

    private Boolean active = true;

    public Product(RequestProduct requestProduct){
        this.name = requestProduct.name();
        this.price_in_cents = requestProduct.price_in_cents();
        this.active = true;
    }


}
