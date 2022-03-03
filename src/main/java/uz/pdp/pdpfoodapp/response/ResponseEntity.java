package uz.pdp.pdpfoodapp.response;

import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * @author johnl
 * @since 2/24/2022
 */

@Getter
public class ResponseEntity<T> {
    private final T data;
    private final Integer status;

    public ResponseEntity(T data) {
        this(data, HttpStatus.OK);
    }

    public ResponseEntity(T data, HttpStatus status) {
        this.data = data;
        this.status = status.value();
    }
}
