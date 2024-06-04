package com.exe01.backend.converter;

import com.exe01.backend.dto.MenteeDTO;
import com.exe01.backend.entity.Mentee;

public class MenteeConverter {
    public static MenteeDTO toDto(Mentee mentee) {
        MenteeDTO menteeDTO = new MenteeDTO();
        menteeDTO.setId(mentee.getId());
        menteeDTO.setStudent(StudentConverter.toDto(mentee.getStudent()));
        menteeDTO.setCreatedDate(mentee.getCreatedDate());
        menteeDTO.setModifiedDate(mentee.getModifiedDate());
        menteeDTO.setCreatedBy(mentee.getCreatedBy());
        menteeDTO.setModifiedBy(mentee.getModifiedBy());

        return menteeDTO;
    }

    public static Mentee toEntity(MenteeDTO menteeDTO) {
        Mentee mentee = new Mentee();
        mentee.setId(menteeDTO.getId());
        mentee.setStudent(StudentConverter.toEntity(menteeDTO.getStudent()));
        mentee.setStatus(menteeDTO.getStatus());
        mentee.setCreatedDate(menteeDTO.getCreatedDate());
        mentee.setModifiedDate(menteeDTO.getModifiedDate());
        mentee.setCreatedBy(menteeDTO.getCreatedBy());
        mentee.setModifiedBy(menteeDTO.getModifiedBy());

        return mentee;
    }

}
