package task.model;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import task.model.dto.DetailsDto;
import task.model.entity.DetailsEntity;
import task.repository.ItemRepository;

@Component
public class DetailsMapper {

    @Autowired
    ItemRepository repository;

    private ModelMapper mapper = new ModelMapper();

    public DetailsEntity mapDtoToEntity(DetailsDto dto) {
        DetailsEntity entity = new DetailsEntity();
        entity = mapper.map(dto, DetailsEntity.class);
        entity.setItemEntity(repository.findById(dto.getItemId()).get());
        return entity;
    }

    public DetailsDto mapEntityToDto(DetailsEntity entity) {
        return mapper.map(entity, DetailsDto.class);
    }

}
