package com.example.dockercompose.controler;

import com.example.dockercompose.model.Book;
import com.example.dockercompose.repository.RepositoryL;
import com.example.dockercompose.service.ServiceL;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ControlerL {
   private final ServiceL serviceL;
// port где работает локал хост 8081
   // 8081:8080
   @PostMapping("/save")
   void save(@RequestBody Book book) {
      serviceL.save(book);
   }
   @DeleteMapping("/delete/{id}")
   void delete(@PathVariable int id){
      serviceL.delete(id);
   }
   @GetMapping("/findAll")
   List<Book> findAll(){
    return serviceL.findAll();
   }
   @PutMapping("/update")
   void update(@RequestParam int id, @RequestBody Book book){
      serviceL.update(id,book);
   }
}
