package br.com.jorge.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.jorge.models.AddressDTO;

@FeignClient(name = "consulta-cep", url = "https://viacep.com.br/ws")
public interface FeignClientProxy {

	@GetMapping(value = "{cep}/json")
	ResponseEntity<AddressDTO> buscaEnderecoPorCep(@PathVariable("cep") String cep);
	
}
