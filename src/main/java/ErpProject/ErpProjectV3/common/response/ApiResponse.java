package ErpProject.ErpProjectV3.common.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Builder
public record ApiResponse<T> (
        HttpStatus httpStatus,
        T payload,
        String message
){

    public static <T> ResponseEntity<ApiResponse<T>> success(T data, String message){

        return ResponseEntity.ok(
                ApiResponse.<T>builder()
                        .httpStatus(HttpStatus.OK)
                        .payload(data)
                        .message(message)
                        .build()
        );
    }

    public static <T> ResponseEntity<ApiResponse<T>> created(T data, String message){

        return ResponseEntity.ok(
                ApiResponse.<T>builder()
                        .httpStatus(HttpStatus.OK)
                        .payload(data)
                        .message(message)
                        .build()
        );
    }




}
