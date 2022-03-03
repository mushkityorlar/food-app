package uz.pdp.pdpfoodapp.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import uz.pdp.pdpfoodapp.resource.HttpStatus;

import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * @author johnl
 * @since 2/24/2022
 */

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppError {
    private Timestamp timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    @Builder
    public AppError(HttpStatus status, String message, WebRequest request) {
        this.timestamp = Timestamp.valueOf(LocalDateTime.now());
        this.status = status.getCode();
        this.error = status.getMessage();
        this.message = message;
        this.path = ((ServletWebRequest) request).getRequest().getRequestURI();
    }
}
