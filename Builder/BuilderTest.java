package Builder;

public class BuilderTest {
    public static void main(String[] args) {
        User user = User.builder()
                .id(1L)
                .name("name")
                .age(28)
                .address("seoul")
                .phone("010-1234-5678")
                .build();

        System.out.println(user);
    }
}
