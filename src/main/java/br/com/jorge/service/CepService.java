package br.com.jorge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jorge.models.AddressDTO;
import br.com.jorge.proxy.impl.FeignClientProxyImpl;

@Service
public class CepService {

	@Autowired
	FeignClientProxyImpl feignClientProxyImpl;
	
	public AddressDTO getAddressByCep(String cep) {
		return feignClientProxyImpl.buscaEnderecoPorCep(cep);
	}
	
}
