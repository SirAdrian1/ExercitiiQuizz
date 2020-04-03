package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppTest {

    public static void main(String[] args)
    {

        User user = new User();
        user.setUserId(1);
        user.setName("Valentin");
        user.setEmailId("radoiadrian77@gmail.com");

        Item item1 = new Item();
        item1.setName("item1");
        item1.setPrice(1);

        Item item2 = new Item();
        item2.setName("item2");
        item2.setPrice(1);

        List<Item> items = new ArrayList<Item>();
        items.add(item1);
        items.add(item2);

        PaymentDetails paymentDetails = new PaymentDetails();
        paymentDetails.setAmount(1);
        paymentDetails.setPaymentMode(PaymentMode.CREDIT_CARD);
        paymentDetails.setCardNumber("12345678");

        Location destination = new Location();
        destination.setLatitude(73.23);
        destination.setLongitude(132.34);

        Order order = new Order();
        order.setOrderId(1);
        order.setItems(items);
        order.setCurrentStatus(OrderStatus.PROCESSING);
        order.setDestination(destination);
        order.setPaymentDetails(paymentDetails);
        order.setTimeOfOrderDelivery(new Date());

        LogisticsSystem logisticsSystem = new LogisticsSystem();
        logisticsSystem.registerNewUser(user);
        logisticsSystem.takeAnOrder(order);
        logisticsSystem.processOrder(order);


        //Apahida,15,100,2017-09-01
        //
        //Apahida,15,150,2017-09-01
        //
        //Apahida,15,199,2017-09-01
        //
        //Apahida,15,149,2017-09-02
        //
        //Apahida,15,200,2017-09-02
        //
        //Apahida,15,349,2017-09-02
        //
        //Apahida,15,199,2017-09-03
        //
        //Apahida,15,249,2017-09-03
        //
        //Apahida,15,299,2017-09-03
        //
        //Floresti,7,100,2017-09-01
        //
        //Floresti,7,250,2017-09-01
        //
        //Floresti,7,399,2017-09-01
        //
        //Floresti,7,549,2017-09-02
        //
        //Floresti,7,400,2017-09-02
        //
        //Floresti,7,349,2017-09-02
        //
        //Floresti,7,299,2017-09-03
        //
        //Floresti,7,449,2017-09-03
        //
        //Floresti,7,299,2017-09-03
        //
        //Turda,29,120,2017-09-01
        //
        //Turda,29,130,2017-09-01
        //
        //Turda,29,149,2017-09-01
        //
        //Turda,29,199,2017-09-02
        //
        //Turda,29,299,2017-09-02
        //
        //Turda,29,349,2017-09-02
        //
        //Turda,29,399,2017-09-03
        //
        //Turda,29,249,2017-09-03
        //
        //Turda,29,599,2017-09-03
    }
}