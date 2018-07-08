package com.ispirit.digitalsky.repository;

import com.ispirit.digitalsky.domain.LocalDroneAcquisitionApplicationForm;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LocalDroneAcquisitionFormRepository extends MongoRepository<LocalDroneAcquisitionApplicationForm, String> {

    LocalDroneAcquisitionApplicationForm findById(@Param("id") String name);
    List<LocalDroneAcquisitionApplicationForm> findByApplicant(@Param("applicantName") String name);

}