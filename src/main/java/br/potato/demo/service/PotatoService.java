package br.potato.demo.service;

import br.potato.demo.model.Potato;
import br.potato.demo.repository.PotatoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PotatoService {

    private final PotatoRepository potatoRepository;

    public PotatoService(PotatoRepository potatoRepository){
        this.potatoRepository = potatoRepository;
    }

    public List<Potato> getAllPotatoes(){
        return  potatoRepository.findAllPotatoes();
    }
}
