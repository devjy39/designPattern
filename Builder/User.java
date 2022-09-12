package Builder;

public class User {
    private Long id;
    private String name;
    private int age;
    private String address;
    private String phone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private User(SimpleBuilder simpleBuilder) {
        this.id = simpleBuilder.id;
        this.name = simpleBuilder.name;
        this.age = simpleBuilder.age;
        this.address = simpleBuilder.address;
        this.phone = simpleBuilder.phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public static SimpleBuilder builder() {
        return new SimpleBuilder();
    }

    public static class SimpleBuilder {
        private Long id;
        private String name;
        private int age;
        private String address;
        private String phone;

        public SimpleBuilder id(long id) {
            this.id = id;
            return this;
        }

        public SimpleBuilder name(String name) {
            this.name = name;
            return this;
        }
        public SimpleBuilder age(int age) {
            this.age = age;
            return this;
        }
        public SimpleBuilder address(String address) {
            this.address = address;
            return this;
        }
        public SimpleBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }


}
