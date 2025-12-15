package com.exampleRelationJPA.Maxime.service;

import com.exampleRelationJPA.Maxime.repository.AuteurRepository;
import com.exampleRelationJPA.Maxime.repository.LivreRepository;
import org.springframework.stereotype.Service;

@Service
public class ExempleService {
    private LivreRepository livreRepository;
    private AuteurRepository auteurRepository;

    public ExempleService(LivreRepository livreRepository ,AuteurRepository auteurRepository){
        this.livreRepository = livreRepository;
        this.auteurRepository = auteurRepository;
    }
}
