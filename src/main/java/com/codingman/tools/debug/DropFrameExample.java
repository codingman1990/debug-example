package com.codingman.tools.debug;

/**
 * 断点回退
 *
 * @author ty
 */
public class DropFrameExample {
    public static void main(String[] args) {
        int i = 99;
        reChangeable(i);
        unChangeable();
    }

    private static void reChangeable(int i) {
        b(i);
        System.out.println(i);
    }

    private static void b(int i) {
        i++;
        System.out.println(i);
    }

    /**
     * 对象，集合，数据库等无法回退
     */
    private static void unChangeable() {
        User user = new User();
        user.setAge(100);
        user.setName("ty");
        change(user);
    }

    private static void change(User user) {
        user.setAge(1000);
    }

    static class User {
        private int age;
        private String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
