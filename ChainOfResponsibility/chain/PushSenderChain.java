package ChainOfResponsibility.chain;

import ChainOfResponsibility.MessageDetail;
import ChainOfResponsibility.User;

public class PushSenderChain extends MessageSenderChain {
    @Override
    protected void execute(User user, MessageDetail messageDetail) {
        System.out.println("Push Message send --> "+user.getName()+" : "+messageDetail.getMessage());
    }
}
