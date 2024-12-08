package javaBasicLecture.array.quiz1;

public class MovieReviewMain {

    public static void main(String[] args) {
        // MovieReview 객체 생성 및 초기화
        MovieReview moviereview1 = new MovieReview();
        moviereview1.title = "인셉션";
        moviereview1.review = "인생은 무한루프";

        MovieReview moviereview2 = new MovieReview();
        moviereview2.title = "어바웃타임";
        moviereview2.review = "인생 시간 영화";

        // MovieReview 배열 초기화
        MovieReview[] moviereviews = {moviereview1, moviereview2};

        // 배열 출력
        for (MovieReview s : moviereviews) {
            System.out.println("영화 제목: " + s.title + ", 리뷰: " + s.review);
        }
    }
    }

