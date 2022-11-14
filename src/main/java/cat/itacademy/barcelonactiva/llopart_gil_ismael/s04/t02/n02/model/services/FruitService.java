package cat.itacademy.barcelonactiva.llopart_gil_ismael.s04.t02.n02.model.services;

import java.util.List;
import java.util.Optional;
import cat.itacademy.barcelonactiva.llopart_gil_ismael.s04.t02.n02.model.domain.Fruit;

public interface FruitService {

	public void save(Fruit fruit);

	public Optional<Fruit> findById(int id);

	public void deleteById(int id);

	public List<Fruit> findAll();
}
