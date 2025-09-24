package hello.advanced.v0;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor // 생성자를 만들어줌
public class OrderServiceV0 {

    // 하나만있으면 자동으로 @Autowired를 적용해줌
    private final OrderRepositoryV0 orderRepository;


    public void orderItem(String itemId) {
        orderRepository.save(itemId);
    }

}
