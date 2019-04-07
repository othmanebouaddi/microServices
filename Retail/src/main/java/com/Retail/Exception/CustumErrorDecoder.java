package com.Retail.Exception;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CustumErrorDecoder implements ErrorDecoder{

	private final ErrorDecoder defaultErrorDecoder = new Default();
	 
	@Override
	public Exception decode(String methodKey, Response response) {
		if(response.status() == 404) {
			return new ProductNotFoundException("Produits non trouvés");
		}
		return defaultErrorDecoder.decode(methodKey, response);
	}
	
	
	
	

}
