package com.projetoe.carrinho.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cart {

    private String buyerEmail;
    private List<Item> itemsList;
    private double cartTotals;
    private boolean closed;

    public void calculateTotals() {
        this.cartTotals = itemsList.stream().mapToDouble(Item::getPrice).sum();
    }

}
