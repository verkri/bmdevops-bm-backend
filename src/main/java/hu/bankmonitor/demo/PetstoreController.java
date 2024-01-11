package hu.bankmonitor.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import hu.bankmonitor.api.pets.Category;
import hu.bankmonitor.api.pets.Pet;
import hu.bankmonitor.api.pets.PetApi;
import hu.bankmonitor.api.pets.Pet.StatusEnum;

@RestController
public class PetstoreController implements PetApi {

  private static Logger logger = LogManager.getLogger(PetstoreController.class);

  @Override
  public ResponseEntity<Pet> getPetById(Long petId) {
    logger.info("getPetById called with {}", petId);

    var pet = Pet.builder()
      .name("Max")
      .id(petId)
      .status(StatusEnum.AVAILABLE)
      .category(Category.builder().id(1L).name("dog").build())
      .build();
      
    return ResponseEntity.ok(pet);
  }
}
