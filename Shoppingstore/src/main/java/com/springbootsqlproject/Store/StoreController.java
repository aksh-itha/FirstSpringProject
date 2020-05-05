package com.springbootsqlproject.Store;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreController {
	@Autowired
	private StoreService storeService;
  @RequestMapping("/store")
  public List<Store> getAllStores(){
	 return storeService.getAllStores();		  
  }
  @RequestMapping("/store/{id}")
  public Optional<Store> getStore(@PathVariable Integer id) {
	  return storeService.getStore(id);
  }
  @RequestMapping(method=RequestMethod.POST,value="/stores")
  public void addStore(@RequestBody Store store) {
	 storeService.addStore(store);
  }
  @RequestMapping(method=RequestMethod.PUT,value="/store/{id}")
  public void updateStore(@RequestBody Store store,@PathVariable Integer id) {
	  storeService.updateStore(id, store);  
  }
  @RequestMapping(method=RequestMethod.DELETE,value="/store/{id}")
  public void deleteStore(@PathVariable Integer id) {
	  storeService.deleteStore(id);
  }

}
