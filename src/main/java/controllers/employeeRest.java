package controllers;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import model.empleoyee;
import service.empleoyeeService;



@RestController
@RequestMapping("/listaempleados")
public class employeeRest {

    private final empleoyeeService empleoyeeService;

    public employeeRest(empleoyeeService empleoyeeService) {
        this.empleoyeeService = empleoyeeService;
    }

    @GetMapping
    public ResponseEntity<List<empleoyee>> listadoEmpleados() {
        List<empleoyee> empleados = empleoyeeService.muestraEmpleado();
        return ResponseEntity.ok(empleados);
    }

    @PostMapping
    public ResponseEntity<empleoyee> crearEmpleado(@RequestBody @Validated empleoyee e) {
        empleoyeeService.crearEmpleado(e);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(e.getId())
                .toUri();

        return ResponseEntity.created(location).body(e);
    }

    @PutMapping
    public ResponseEntity<empleoyee> modificarEmpleado(@RequestBody @Validated empleoyee e) {
        empleoyeeService.modificarEmpleado(e);
        return ResponseEntity.ok(e);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarEmpleado(@PathVariable @Validated int id) {
        empleoyeeService.eliminarEmpleado(id);
        return ResponseEntity.noContent().build();
    }
}

