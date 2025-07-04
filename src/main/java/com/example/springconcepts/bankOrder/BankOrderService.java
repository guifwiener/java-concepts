package com.example.springconcepts.bankOrder;

import com.example.springconcepts.connections.Send;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BankOrderService {

    private BankOrderModel bankOrderModel;
    private Send send;

    private final BankOrderRepository bankOrderRepository;

    public BankOrderService(BankOrderRepository bankOrderRepository) {
        this.bankOrderRepository = bankOrderRepository;
    }

    public BankOrderModel registerTransaction(BankOrderDto bankOrderDto) throws Exception {

//        BankOrderModel bankOrder = bankOrderRepository.save(bankOrderModel);
        send.publish("Transação enviada");
        return null;

    }

}
