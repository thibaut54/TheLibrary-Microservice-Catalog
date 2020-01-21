package org.thibaut.thelibrary.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.thibaut.thelibrary.dto.CategoryDTO;
import org.thibaut.thelibrary.dto.CategoryDTO.CategoryDTOBuilder;
import org.thibaut.thelibrary.entity.CategoryEntity;
import org.thibaut.thelibrary.entity.CategoryEntity.CategoryEntityBuilder;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-21T11:26:27+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_211 (Oracle Corporation)"
)
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDTO categoryToDTO(CategoryEntity categoryEntity) {
        if ( categoryEntity == null ) {
            return null;
        }

        CategoryDTOBuilder categoryDTO = CategoryDTO.builder();

        categoryDTO.id( categoryEntity.getId() );
        categoryDTO.category( categoryEntity.getCategory() );

        return categoryDTO.build();
    }

    @Override
    public List<CategoryDTO> categoryToDTOList(List<CategoryEntity> categoryEntityList) {
        if ( categoryEntityList == null ) {
            return null;
        }

        List<CategoryDTO> list = new ArrayList<CategoryDTO>( categoryEntityList.size() );
        for ( CategoryEntity categoryEntity : categoryEntityList ) {
            list.add( categoryToDTO( categoryEntity ) );
        }

        return list;
    }

    @Override
    public CategoryEntity categoryToEntity(CategoryDTO categoryDTO) {
        if ( categoryDTO == null ) {
            return null;
        }

        CategoryEntityBuilder categoryEntity = CategoryEntity.builder();

        categoryEntity.id( categoryDTO.getId() );
        categoryEntity.category( categoryDTO.getCategory() );

        return categoryEntity.build();
    }

    @Override
    public List<CategoryEntity> categoryToEntityList(List<CategoryDTO> categoryDTOList) {
        if ( categoryDTOList == null ) {
            return null;
        }

        List<CategoryEntity> list = new ArrayList<CategoryEntity>( categoryDTOList.size() );
        for ( CategoryDTO categoryDTO : categoryDTOList ) {
            list.add( categoryToEntity( categoryDTO ) );
        }

        return list;
    }
}
