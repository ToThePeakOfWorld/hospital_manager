package com.txm.hospital.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.txm.hospital.pojo.Doctor;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DoctorMapper extends BaseMapper<Doctor> {

    List<Doctor> findDoctorBySection(String dSection);
    /**
     * 用户评价
     */
    Boolean updateStar(@Param("dId")int dId, @Param("dStar")Double dStar);
}
