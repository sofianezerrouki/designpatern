package creationalpattern.builder;

class Main {
    public static void main(String[] args) {
        new Person.PersonBuilder("me")
                .email("myemail@gmail.com")
                .active(true)
                .build();
    }
}