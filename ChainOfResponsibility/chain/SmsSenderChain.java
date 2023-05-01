package ChainOfResponsibility.chain;

import ChainOfResponsibility.MessageDetail;
import ChainOfResponsibility.User;

public class SmsSenderChain extends MessageSenderChain {
    @Override
    protected void execute(User user, MessageDetail messageDetail) {
        System.out.println("SMS Message send --> "+user.getName()+" : "+messageDetail.getMessage());
    }
}
