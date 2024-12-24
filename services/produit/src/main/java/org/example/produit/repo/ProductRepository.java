package org.example.produit.repo;


import org.example.produit.entity.Produit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Produit, String> {
    // Méthodes personnalisées si nécessaire
}

