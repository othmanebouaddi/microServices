package com.Retail.Proxy;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Retail.Beans.ProductBean;


@FeignClient(name = "microservice-produits")
//, url = "localhost:9001")
@RibbonClient(name = "microservice-produits")
public interface ProductProxy {
	
	@GetMapping(value = "/Produits")
    List<ProductBean> listeDesProduits();
	
	@GetMapping( value = "/Produits/{id}")
    ProductBean recupererUnProduit(@PathVariable("id") int id);

}
