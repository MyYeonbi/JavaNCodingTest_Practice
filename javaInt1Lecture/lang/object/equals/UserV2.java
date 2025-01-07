package javaInt1Lecture.lang.object.equals;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj = UserV2 user2) {
        UserV2 user = (UserV2) obj; //다운캐스팅
        return id.equals(user.id);
    }
}
