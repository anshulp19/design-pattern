/**
 * Created by anshul on 06/02/19.
 */
public class User {
    // To demonstrate builder pattern
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phone;
    private final String address;

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User: " + this.firstName + ", " +
                this.lastName + ", " + this.age + ", " + this.phone + ", " + this.address;
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            User user = new User(this);
            validateUser();

            return user;
        }

        public void validateUser() {
            // TODO
        }

    }

    public static void main(String[] args) {
        User user1 = new UserBuilder("Clark", "Kent")
                .age(30)
                .phone("12345")
                .address("Metropolis")
                .build();

        System.out.println(user1);

        User user2 = new UserBuilder("Bruce", "Wayne")
                .age(29)
                .address("Gotham")
                .build();

        System.out.println(user2);
    }
}
