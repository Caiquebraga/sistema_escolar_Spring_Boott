package com.System.sistema_escolar.aluno_service.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class AlunoProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public AlunoProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void enviarMensagem(String mensagem) {
        kafkaTemplate.send("alunos-criados", mensagem); // Envia para o tópico "alunos-criados"
        System.out.println("Mensagem enviada: " + mensagem);
    }
}