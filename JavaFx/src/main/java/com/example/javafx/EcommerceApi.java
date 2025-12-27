package com.example.javafx;

import java.io.IOException;

public final class EcommerceApi {

    private static final String BASE_URL = "https://andale-colleague-steal-water.trycloudflare.com";
    private static final ApiClient api = ApiClient.getInstance(BASE_URL);


    private EcommerceApi() {}


    // GET /order/<id>/getorder
    public static String getOrder(int orderId)
            throws IOException, InterruptedException {
        return api.get("/order/" + orderId + "/getorder");
    }

    // POST /order/postorder
    public static String postOrder(String orderJson)
            throws IOException, InterruptedException {
        return api.post("/order/postorder", orderJson);
    }


    // GET /customer/<id>/getcustomer
    public static String getCustomer(int customerId)
            throws IOException, InterruptedException {
        return api.get("/customer/" + customerId + "/getcustomer");
    }


    // POST /payment/postpayment
    public static String postPayment(String paymentJson)
            throws IOException, InterruptedException {
        return api.post("/payment/postpayment", paymentJson);
    }
}
