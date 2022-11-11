package cat.itacademy.barcelonactiva.llopart_gil_ismael.s04.t02.n02.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.llopart_gil_ismael.s04.t02.n02.model.domain.Fruit;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Integer> {

}
