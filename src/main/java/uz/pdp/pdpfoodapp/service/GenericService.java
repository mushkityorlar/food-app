package uz.pdp.pdpfoodapp.service;

import uz.pdp.pdpfoodapp.dto.GenericDto;

import java.io.Serializable;
import java.util.List;

public interface GenericService<D extends GenericDto, K extends Serializable> {

    List<D> getAll();

    D get(K id);

    default void block() {
    }

    default void unBlock() {
    }

    default void active() {
    }


}
