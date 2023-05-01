package ChainOfResponsibility.chain;

import ChainOfResponsibility.MessageDetail;
import ChainOfResponsibility.User;

import static java.util.Objects.nonNull;

/*
*   연쇄적으로 호출이 되어야 하기 때문에 NEXT, 다음에 호출될 객체를 알고있어야 함.
* */
public abstract class MessageSenderChain {
    private MessageSenderChain next;

    public MessageSenderChain next(MessageSenderChain next) {
        this.next = next;
        return next;
    }

    public void send(User user, MessageDetail messageDetail) {
        // 처리 구현
        execute(user, messageDetail);

        // NEXT  책임 연쇄
        // 각각의 핸들러에서는 전달을 중지하는 결정을 내릴 수 있다.
        if (nonNull(next)) {  // null이면 체인 끝
            next.send(user, messageDetail);
        }
    }

    /*
    *   각각 체인의 구체적인 처리는 하위클래스에서 구현
    *   템플릿을 정해놓고 세부 구현만 하위로 넘기는 면에서 템플릿 메서드 패턴과 유사하다
    *   하지만 다른점은 next, 연쇄적인 책임이 추가되는 점이다.
    * */
    protected abstract void execute(User user, MessageDetail messageDetail);
}
