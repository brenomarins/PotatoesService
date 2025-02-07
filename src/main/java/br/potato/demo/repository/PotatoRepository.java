package br.potato.demo.repository;

import br.potato.demo.entity.PotatoEntity;
import br.potato.demo.model.Potato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PotatoRepository extends JpaRepository<PotatoEntity,Long> {

    @Query("select new br.potato.demo.model.Potato(name) from potato")
    List<Potato> findAllPotatoes();
}
