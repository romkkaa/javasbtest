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

    public DetailsEntity mapDtoToEntity(DetailsDto detailsDto) {
        var detailsEntity = mapper.map(detailsDto, DetailsEntity.class);
        detailsEntity.setItemEntity(repository.findById(detailsDto.getItemId()).get());
        return detailsEntity;
    }

    public DetailsDto mapEntityToDto(DetailsEntity detailsEntity) {
        var detailsDto = mapper.map(detailsEntity, DetailsDto.class);
        detailsDto.setItemId(detailsEntity.getItemEntity().getId());
        return detailsDto;
    }

}
