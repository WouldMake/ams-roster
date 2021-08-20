package br.com.mesttra.roster.amqp;

import br.com.mesttra.roster.service.PlayerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/*@Component*/
public class MedicalAdmissionConsumer {

/*    PlayerService playerService;

    public MedicalAdmissionConsumer(PlayerService playerService) {
        this.playerService = playerService;
    }

    @RabbitListener(queues = AMQPConfig.QUEUE)
    public void consumer(PlayerMessage message) {
        Logger logger = LoggerFactory.getLogger(MedicalAdmissionConsumer.class);
        playerService.makePlayerUnavailable(message.getId());
    }*/

}
