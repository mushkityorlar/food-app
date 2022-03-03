package uz.pdp.pdpfoodapp.service;

import uz.pdp.pdpfoodapp.dto.Dto;
import uz.pdp.pdpfoodapp.dto.GenericDto;

import java.io.Serializable;

public interface GenericCrudService<D extends GenericDto,
        CD extends Dto,
        UD extends GenericDto,
        K extends Serializable> extends GenericService<D, K> {

    K create(CD createDto);

    Void update(UD updateDto);

    Void delete(K id);


}
