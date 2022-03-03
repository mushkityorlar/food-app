package uz.pdp.pdpfoodapp.response;

import lombok.Getter;

/**
 * @author johnl
 * @since 2/24/2022
 */

@Getter
public class Data<T> {

    private final T body;
    private Integer totalCount;

    public Data(T body) {
        this.body = body;
    }

    public Data(Integer totalCount, T body) {
        this.totalCount = totalCount;
        this.body = body;
    }

}
