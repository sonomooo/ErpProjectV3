package ErpProject.ErpProjectV3.common.response;

import lombok.Builder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Builder
public record EventResponse<T>(T event) {

    public static <T> ResponseEntity<EventResponse<T>> success(T data){

        return ResponseEntity.ok(
                EventResponse.<T>builder()
                        .event(data)
                        .build()
        );
    }


}
