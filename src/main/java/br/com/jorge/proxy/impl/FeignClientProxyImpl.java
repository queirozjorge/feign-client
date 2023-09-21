package br.com.jorge.proxy.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jorge.models.AddressDTO;
import br.com.jorge.proxy.FeignClientProxy;

@Service
public class FeignClientProxyImpl {
	
	@Autowired
	FeignClientProxy feignClientProxy;

	public AddressDTO buscaEnderecoPorCep(String cep) {
		return feignClientProxy.buscaEnderecoPorCep(cep).getBody();
	}
}
