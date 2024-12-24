package org.example.order.order.controller;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping
    public ResponseEntity<String> createOrder(@RequestBody Order order) {
        // Logic to save order
        kafkaTemplate.send("order-topic", "Order Created: " + order.getId());
        return ResponseEntity.ok("Order placed successfully");
    }
}

