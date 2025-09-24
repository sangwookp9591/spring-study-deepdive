package hello.advanced.v0;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController // @Controller +  @ResponeBody
@RequiredArgsConstructor
public class OrderControllerV0 {
 
    
    private final OrderServiceV0 orderService;


    @GetMapping("/v0/request")
    public String request(@RequestParam String itemId) {
        orderService.orderItem(itemId);
        return "ok";
    }
    
}
