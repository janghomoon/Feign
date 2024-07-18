package com.example.feign.dto.sample;

public class SampleDto {
    private SampleDto() {
        throw new RuntimeException();
    }
    public static class Request {
        String id;
        String cotents;

        private Request(String id, String cotents) {
            this.id = id;
            this.cotents = cotents;
        }
        public static SampleDto.Request of(String id, String cotents) {
            return new SampleDto.Request(id, cotents);

        }
    }

    public static class Response {
        String id;
        String resultMessage;

        private Response(String id, String resultMessage) {
            this.id = id;
            this.resultMessage = resultMessage;
        }
        public static Response of(String id, String resultMessage) {
            return new SampleDto.Response(id, resultMessage);
        }
    }

}
