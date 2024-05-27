package umc.spring.apiPayload.code;

import org.springframework.http.HttpStatus;

public class ErrorReasonDTO {
    private String message;
    private String code;
    private boolean isSuccess;
    private HttpStatus httpStatus;

    private ErrorReasonDTO(Builder builder) {
        this.message = builder.message;
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.httpStatus = builder.httpStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String message;
        private String code;
        private boolean isSuccess;
        private HttpStatus httpStatus;

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder code(String code) {
            this.code = code;
            return this;
        }

        public Builder isSuccess(boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        public Builder httpStatus(HttpStatus httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }

        public ErrorReasonDTO build() {
            return new ErrorReasonDTO(this);
        }
    }
}
