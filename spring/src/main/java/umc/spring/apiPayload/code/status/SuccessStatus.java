package umc.spring.apiPayload.code.status;

import org.springframework.http.HttpStatus;
import umc.spring.apiPayload.code.BaseCode;
import umc.spring.apiPayload.code.ErrorReasonDTO;
import umc.spring.apiPayload.code.ReasonDTO;

public enum SuccessStatus implements BaseCode {

    // 일반적인 성공 응답
    OK(HttpStatus.OK, "SUCCESS200", "요청이 성공적으로 처리되었습니다."),
    CREATED(HttpStatus.CREATED, "SUCCESS201", "자원이 성공적으로 생성되었습니다."),
    ACCEPTED(HttpStatus.ACCEPTED, "SUCCESS202", "요청이 승인되었습니다."),

    // 사용자 관련 성공 응답
    MEMBER_CREATED(HttpStatus.CREATED, "MEMBER201", "사용자가 성공적으로 생성되었습니다."),
    MEMBER_UPDATED(HttpStatus.OK, "MEMBER2001", "사용자 정보가 성공적으로 업데이트되었습니다.");

    private final HttpStatus httpStatus;
    private final String code;
    private final String message;

    SuccessStatus(HttpStatus httpStatus, String code, String message) {
        this.httpStatus = httpStatus;
        this.code = code;
        this.message = message;
    }


    @Override
    public ReasonDTO getReason() {
        return ReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(true)
                .build();
    }

    @Override
    public ReasonDTO getReasonHttpStatus() {
        return ReasonDTO.builder()
                .message(message)
                .code(code)
                .isSuccess(true)
                .httpStatus(httpStatus)
                .build()
                ;
    }

}
