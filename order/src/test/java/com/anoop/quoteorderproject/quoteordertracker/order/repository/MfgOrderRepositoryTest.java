package com.anoop.quoteorderproject.quoteordertracker.order.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import com.anoop.quoteorderproject.quoteordertracker.order.OrderServiceApplication;
import com.anoop.quoteorderproject.quoteordertracker.order.entity.MfgOrder;
import com.anoop.quoteorderproject.quoteordertracker.order.repository.MfgOrderRepository;
import java.util.List;

import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = OrderServiceApplication.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)


public class MfgOrderRepositoryTest {
    @Autowired
    private MfgOrderRepository mfgOrderRepository;

    @Test
    public void testFetchOrders() {
        List<MfgOrder> orders = mfgOrderRepository.findAll();
        assertThat(orders).isNotNull();  // Don't assume notEmpty, just test connection first
        System.out.println("✅ Connected to SQL Server. Orders count: " + orders.size());
    }
}
