package ErpProject.ErpProjectV3.common.response;

import lombok.Builder;
import org.springframework.http.ResponseEntity;

@Builder
public record HomeResponse<T> (ApiResponse apiResponse,ChannelResponse channelResponse, EventResponse eventResponse) {

    public static <T> ResponseEntity<EventResponse<T>> success(){

        return ResponseEntity.ok(
                HomeResponse.builder()
                        .apiResponse()
                        .channelResponse()
                        .eventResponse()
                        .build()
        );
    }

}
