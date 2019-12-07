package task.controller;

import task.model.DetailsMapper;
import task.model.dto.DetailsDto;
import task.model.entity.DetailsEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import task.repository.DetailsRepository;

import static org.springframework.http.MediaType.APPLICATION_XML_VALUE;

@RestController
@RequestMapping(value = "/details", consumes = APPLICATION_XML_VALUE, produces = APPLICATION_XML_VALUE)
public class DetailsRestController {

    @Autowired
    private DetailsRepository repository;

    @Autowired
    DetailsMapper mapper;

    @PostMapping("/add")
    public DetailsDto createPurchaseDetails(@RequestBody DetailsDto detailsDto) {
        DetailsEntity detailsEntity = repository.save(mapper.mapDtoToEntity(detailsDto));
        return mapper.mapEntityToDto(detailsEntity);
    }
}
