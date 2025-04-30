package ch18_static.builders;

import lombok.Builder;

public class Person {
    private String name;
    private int age;
    private String address;
    // 이게 alt + ins 해서 편했는데 이나마도 보는게 불편하다고 느끼신다면 여러분이 개발자가 돼가고 있다는 겁니다.

    // 빌더패턴 작성합니다.
    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static class Builder {
        private String name;
        private int age;
        private String address;

        // 이하의 코드는 주목하셔야 합니다 -> method들을 정의할 예정.
        // method는 대부분 행위를 나타내기 때문에 동사로 작성하지만
        // Builder 패턴에서는 대입될 필드의 이름과 동일한 메서드 명을 씁니다.
        // 예를 들어 builder.name("안근수"); / builder.age(38);과 같은 방식이 됩니다.
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        // 이상까지의 코드는 Person 클래스의 필드와 관련있는 메서드였습니다.
        // 이제 객체 생성을 완료하는 메서드를 정의해야합니다 -> 기본적으로 build() 라고 짓습니다.
        public Person build() {
            return new Person(this);
        }
    }
}
