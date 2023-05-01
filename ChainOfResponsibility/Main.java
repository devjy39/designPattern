package ChainOfResponsibility;

import ChainOfResponsibility.chain.EmailSenderChain;
import ChainOfResponsibility.chain.MessageSenderChain;
import ChainOfResponsibility.chain.PushSenderChain;
import ChainOfResponsibility.chain.SmsSenderChain;

/*
*   각각의 로직들을 링크드리스트의 체인 형식으로 이어서 구현하게 되는 방식
*
*   MessageSenderChain라는 추상클래스 (인터페이스 역할) 를 만들고
*   구현체 ConcreteHandler인 SenderChain들은 처리를 하고 책임을 다음 핸들러에게 넘긴다.
* */
public class Main {
    public static void main(String[] args) {
        User user = new User("재열");

        MessageSenderChain smsSender = new SmsSenderChain();
        MessageSenderChain pushSender = new PushSenderChain();
        MessageSenderChain emailSender = new EmailSenderChain();

        // config
        smsSender.next(pushSender)
                .next(emailSender);

        smsSender.send(user, new MessageDetail("Hello world!"));
    }
}
