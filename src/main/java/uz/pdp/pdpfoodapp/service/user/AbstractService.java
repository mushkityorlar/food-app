package uz.pdp.pdpfoodapp.service.user;

import lombok.RequiredArgsConstructor;
import uz.pdp.pdpfoodapp.mapper.Mapper;
import uz.pdp.pdpfoodapp.repository.AbstractRepository;
import uz.pdp.pdpfoodapp.utils.Validator;


@RequiredArgsConstructor
public abstract class AbstractService<R extends AbstractRepository, M extends Mapper, V extends Validator> {

    protected final M mapper;
    protected final R repository;
    protected final V validator;
}
