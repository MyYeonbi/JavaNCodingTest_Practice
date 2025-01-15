package javaInt1Lecture.enumeration.http;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;
    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public boolean isSuccess() {
        return code >= 200 && code <= 299;
    }
    public int getCode() {
        return code;
    }


}
