package pe.edu.Frontend.ProyectoFrontend.client;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pe.edu.Frontend.ProyectoFrontend.config.FeignClientConfig;
import pe.edu.Frontend.ProyectoFrontend.dto.LoginRequestDTO;
import pe.edu.Frontend.ProyectoFrontend.dto.LoginResponseDTO;

import java.util.List;


@FeignClient(name = "autenticar", url = "http://localhost:8091/login",configuration = FeignClientConfig.class)
public interface AutenticacionClient {

    @PostMapping("/autenticar")
    ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO loginRequestDTO);
    @GetMapping("/get-integrantes")
    ResponseEntity<List<String[]>> listarUsuarios();

}
