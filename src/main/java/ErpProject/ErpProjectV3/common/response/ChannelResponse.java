package ErpProject.ErpProjectV3.common.response;

import lombok.Builder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Builder
public record ChannelResponse<T>(
        HttpStatus httpStatus,
        T channel,
        T plugin,
        T user,
        T sessionJWT,
        T nameSpace,
        T routeInfo,
        T veilld,
        T cookieDomain
) {

    public static <T> ResponseEntity<ChannelResponse<T>> success(T channel,
                                                                 T plugin,
                                                                 T user,
                                                                 T sessionJWT,
                                                                 T nameSpace,
                                                                 T routeInfo,
                                                                 T veilld,
                                                                 T cookieDomain)
    {
        return ResponseEntity.ok(
                ChannelResponse.<T>builder()
                        .channel(channel)
                        .plugin(plugin)
                        .user(user)
                        .sessionJWT(sessionJWT)
                        .nameSpace(nameSpace)
                        .routeInfo(routeInfo)
                        .veilld(veilld)
                        .cookieDomain(cookieDomain)
                        .build()
        );
    }


}
