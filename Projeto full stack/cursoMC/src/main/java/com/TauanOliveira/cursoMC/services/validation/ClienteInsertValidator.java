package com.TauanOliveira.cursoMC.services.validation;

import com.TauanOliveira.cursoMC.domain.enums.TipoCliente;
import com.TauanOliveira.cursoMC.dto.ClienteNewDTO;
import com.TauanOliveira.cursoMC.resources.exception.FieldMessage;
import com.TauanOliveira.cursoMC.services.validation.utils.BR;

import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ClienteInsertValidator implements ConstraintValidator<ClienteInsert, ClienteNewDTO> {
    @Override
    public void initialize(ClienteInsert ann) {
    }
    @Override
    public boolean isValid(ClienteNewDTO objDTO, ConstraintValidatorContext context) {

        List<FieldMessage> list = new ArrayList<>();
        // inclua os testes aqui, inserindo erros na lista
        if(objDTO.getTipoCliente().equals(TipoCliente.PESSOAFISICA.getCod()) && !BR.isValidCPF(objDTO.getCpfOuCnpj())){
            list.add(new FieldMessage("cpfOuCnpj", "CPF inválido"));
        }

        if(objDTO.getTipoCliente().equals(TipoCliente.PESSOAJURIDICA.getCod()) && !BR.isValidCNPJ(objDTO.getCpfOuCnpj())){
            list.add(new FieldMessage("cpfOuCnpj", "CNPJ inválido"));
        }
        //

        for (FieldMessage e : list) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate(e.getMessage()).addPropertyNode(e.getFildName()).addConstraintViolation();
        }
        return list.isEmpty();
    }
}
