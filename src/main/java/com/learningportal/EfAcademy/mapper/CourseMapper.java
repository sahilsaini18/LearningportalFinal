package com.learningportal.EfAcademy.mapper;

import org.mapstruct.Mapper;

import com.learningportal.EfAcademy.dto.CategoryDto;
import com.learningportal.EfAcademy.dto.CourseDto;
import com.learningportal.EfAcademy.entity.Category;
import com.learningportal.EfAcademy.entity.Courses;

@Mapper(componentModel = "spring")
public interface CourseMapper {

	Category categoryDtoToCategory(CategoryDto categoryDto);

	Courses courseDtoToCourses(CourseDto courseDto);

	Category typeToCategory(String type);

	CategoryDto categoryToCategoryDto(Category category);
}
