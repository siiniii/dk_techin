package sourceCode.day011;

import java.util.LinkedList;

public class LinkedListLab1_1 {

    public static void main(String[] args) {
        LinkedList<Friend> friends = new LinkedList<>();
        String[] names = {"kim", "lee", "park", "choi", "shin"};
        String[] phoneNums = {"1234", "2345", "3456", "4567", "5678"};
        String[] emails = {"aaa@aaa.com", "bbb@bbb.com", "ccc@ccc.com", "ddd@ddd.com", "eee@eee.com"};

        for (int i = 0; i < names.length; i++) {
            friends.add(new Friend(names[i], phoneNums[i], emails[i]));
        }

        System.out.println("이름   전화번호    이메일");
        System.out.println("---------------------");
        for (Friend friend : friends) {
            System.out.println(friend.getInfo());
        }
    }
}
