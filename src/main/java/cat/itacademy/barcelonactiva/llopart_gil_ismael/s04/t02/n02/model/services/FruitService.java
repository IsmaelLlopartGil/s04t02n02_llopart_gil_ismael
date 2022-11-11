package cat.itacademy.barcelonactiva.llopart_gil_ismael.s04.t02.n02.model.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cat.itacademy.barcelonactiva.llopart_gil_ismael.s04.t02.n02.model.domain.Fruit;
import cat.itacademy.barcelonactiva.llopart_gil_ismael.s04.t02.n02.model.repository.FruitRepository;

@Service
public class FruitService {

	@Autowired
	FruitRepository fruitRepository;

	public void save(Fruit fruit) {
		fruitRepository.save(fruit);
	}

	public Optional<Fruit> findById(int id) {
		return fruitRepository.findById(id);
	}

	public void deleteById(int id) {
		fruitRepository.deleteById(id);
	}

	public List<Fruit> findAll() {
		return (List<Fruit>) fruitRepository.findAll();
	}

}
