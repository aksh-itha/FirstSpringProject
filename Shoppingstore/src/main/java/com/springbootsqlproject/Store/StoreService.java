package com.springbootsqlproject.Store;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {
	@Autowired
	private StoreRepository storeRepository;

	public List<Store> getAllStores(){
		List<Store> stores=new ArrayList<>();
		storeRepository.findAll()
		.forEach(stores::add);
		return stores;
		}
	public Optional<Store> getStore(Integer id) {
		return storeRepository.findById(id);
	}
	public void addStore(Store store) {
		storeRepository.save(store);
	}			
	public void updateStore(Integer id,Store store) {
		storeRepository.save(store);
	}
	public void deleteStore(Integer id) {
		storeRepository.deleteById(id);
	}
}
