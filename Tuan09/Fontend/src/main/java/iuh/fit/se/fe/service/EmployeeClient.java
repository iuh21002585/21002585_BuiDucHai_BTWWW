package iuh.fit.se.fe.service;

import iuh.fit.se.fe.dto.EmployeeDto;
import iuh.fit.se.fe.dto.PageResponse;
import org.springframework.beans.factory.annotation.*;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.*;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeClient {
    private final RestTemplate rest;
    private final String baseUrl;

    public EmployeeClient(RestTemplate rest, @Value("${be.api.base-url}") String baseUrl) {
        this.rest = rest;
        this.baseUrl = baseUrl;
    }

    public PageResponse<EmployeeDto> list(int page, int size) {
        String url = String.format("%s/employees?page=%d&size=%d", baseUrl, page, size);
        ResponseEntity<PageResponse<EmployeeDto>> res =
                rest.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<>() {});
        return res.getBody();
    }

    public EmployeeDto create(EmployeeDto dto){
        String url = baseUrl + "/employees";
        return rest.postForObject(url, dto, EmployeeDto.class);
    }

    public EmployeeDto get(Long id){
        String url = baseUrl + "/employees/" + id;
        return rest.getForObject(url, EmployeeDto.class);
    }

    public EmployeeDto update(Long id, EmployeeDto dto){
        String url = baseUrl + "/employees/" + id;
        rest.put(url, dto);
        return get(id);
    }

    public void delete(Long id){
        String url = baseUrl + "/employees/" + id;
        rest.delete(url);
    }
}

