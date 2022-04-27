package com.wipro.smjeight.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.wipro.smjeight.model.Data;

@Service
public interface DataService {
public Data createData(Data data);
public Optional<Data> getByUUID(UUID id);
}
