package ChainOfResponsibility.chain;

import ChainOfResponsibility.MessageDetail;
import ChainOfResponsibility.User;

public class EmailSenderChain extends MessageSenderChain {
    @Override
    protected void execute(User user, MessageDetail messageDetail) {
        System.out.println("Email Message send --> "+user.getName()+" : "+messageDetail.getMessage());
    }
}
