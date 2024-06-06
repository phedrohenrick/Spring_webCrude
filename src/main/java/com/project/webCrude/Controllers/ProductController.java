package com.project.webCrude.Controllers;


import com.project.webCrude.domain.product.Product;
import com.project.webCrude.domain.product.ProductRepository;
import com.project.webCrude.domain.product.RequestProduct;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
// aqui avisamos para o spring que aqui ficará o rest controller
@RequestMapping("/product")
//esse controller ouvirá esse endpoint

public class ProductController {

    @Autowired // aqui o spring criará uma instâncias da classe em questão e injetará
    private ProductRepository repository;

    @GetMapping
    public ResponseEntity getAllProducts(){

        var allProducts = repository.findAllByActiveTrue();
        return ResponseEntity.ok(allProducts);
    }

    @PostMapping
    public ResponseEntity registerProducts(@RequestBody @Valid RequestProduct data){
        System.out.println(data);
        Product newProduct = new Product(data);
        repository.save(newProduct);
        return ResponseEntity.ok().build();

    }

    @PutMapping
    @Transactional // isso sinaliza que mais de uma tranazação será realizada no banco de dados
    public ResponseEntity updateProducts(@RequestBody @Valid RequestProduct data){

        Optional<Product> OptionalProduct = repository.findById(data.id());
        if(OptionalProduct.isPresent()){
            Product product = OptionalProduct.get();
            product.setName(data.name());
            product.setPrice_in_cents(data.price_in_cents());
            return ResponseEntity.ok(product);

        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    @Transactional // faz a tranzação de delete e concretiza no BD
    public ResponseEntity deleteProduct(@PathVariable String id){

        Optional<Product> OptionalProduct = repository.findById(id);

        if(OptionalProduct.isPresent()){ // dessa forma não deletaremos o dado da tabela mas sim desativá-lo
            Product product = OptionalProduct.get();
            product.setActive(false);
            return ResponseEntity.ok(product);
        }else {
                return ResponseEntity.notFound().build();

        }
    }

}
