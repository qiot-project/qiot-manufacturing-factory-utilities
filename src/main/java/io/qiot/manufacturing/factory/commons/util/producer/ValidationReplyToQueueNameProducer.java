package io.qiot.manufacturing.factory.commons.util.producer;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 * @author andreabattaglia
 *
 */
@ApplicationScoped
public class ValidationReplyToQueueNameProducer {

    @ConfigProperty(name = "qiot.production.chain.validation.replyto-queue-prefix", defaultValue = "none")
    String replyToQueuePrefix;

    public String getReplyToQueueName(String machineryId) {
        return replyToQueuePrefix + "." + machineryId;
    }
}
