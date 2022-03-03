package uz.pdp.pdpfoodapp.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import uz.pdp.pdpfoodapp.resource.HttpStatus;
import uz.pdp.pdpfoodapp.response.AppError;

/**
 * @author johnl
 * @since 2/24/2022
 */


@ControllerAdvice("uz.elmurodov")
public class GlobalExceptionHandler {

    @ResponseStatus(org.springframework.http.HttpStatus.FORBIDDEN)
    public AppError invalidTokenExceptionHandler(InvalidTokenException e, WebRequest request) {
        return AppError.builder()
                .message(e.getMessage())
                .request(request)
                .status(HttpStatus.INVALID_TOKEN)
                .build();
    }
}
