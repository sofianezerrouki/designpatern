package creationalpattern.builder;

public class Person {
    private final String name;
    private final  String email;
    private final String phone;
    private final String mobile;
    private final Boolean active;

    private Person(PersonBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.mobile = builder.mobile;
        this.active = builder.active;
    }

    public static class PersonBuilder {
        public String name;
        public String email;
        public String phone;
        public String mobile;
        public Boolean active;

        public PersonBuilder(String name) {
            this.name = name;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public PersonBuilder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public PersonBuilder active(Boolean active) {
            this.active = active;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}


