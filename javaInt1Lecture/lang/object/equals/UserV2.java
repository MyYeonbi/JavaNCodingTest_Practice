package javaInt1Lecture.lang.object.equals;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj; //캐스팅
        boolean result = id == user.id;
        result;
    }
}
