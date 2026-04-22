package com.penoles.sicap.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.penoles.framework.constants.METHOD_PATHS;
import com.penoles.framework.exception.PenolesException;
import com.penoles.framework.exception.model.ExceptionDto;
import com.penoles.framework.model.view.View;
import com.penoles.sicap.entity.Puesto;
import com.penoles.sicap.service.PuestoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("/v1/public/puesto")
@Tag(name = "Puesto", description = "Catálogo de información de puestos")
public class PuestoController {

//    @GetMapping(METHOD_PATHS.CONSULTAR)
//    public String consultar(){
//        return "mensaje del curso";
//    }

    @Autowired
    PuestoService puestoService;

    @Operation(summary = "Consultar puestos",
            description = "Método para obtener todos los puestos registrados en el sistema")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Puesto.class, type = "array"))),
            @ApiResponse(responseCode = "400", description = "Bad Request",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class, type = "array"))),
            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class)))
    })
    @JsonView(View.GET.class)
    @GetMapping(METHOD_PATHS.CONSULTAR)
    public ResponseEntity consultar() {
        return ResponseEntity.status(200).body(puestoService.consultar());
    }

    @Operation(summary = "Eliminar puesto",
            description = "Elimina información del puesto indicado, si no tiene registros secundarios.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "Bad Request",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class, type = "array"))),
            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class)))
    })
    @DeleteMapping(METHOD_PATHS.ELIMINAR + "/{id}")
    public ResponseEntity eliminar(@PathVariable Long id) {
        boolean resp = puestoService.eliminar(id);
        if (resp)
            return ResponseEntity.status(200).build();
        else
            throw new PenolesException(500, "Ocurrió un error al eliminar la información");
    }

    @Operation(summary = "Guardar puesto",
            description = "Registra información de un puesto en base de datos")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Puesto.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class, type = "array"))),
            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class)))
    })
    @PostMapping(METHOD_PATHS.GUARDAR)
    @JsonView(View.POST.class)
    public ResponseEntity guardar(@Valid @RequestBody Puesto puesto) {
        return ResponseEntity.ok(puestoService.guardar(puesto));
    }

    @Operation(summary = "Modificar puesto",
            description = "Actualiza la información de un puesto previamente registrado en base de datos.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Puesto.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class, type = "array"))),
            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class)))
    })
    @JsonView(View.PUT.class)
    @PutMapping(METHOD_PATHS.MODIFICAR + "/{id}")
    public ResponseEntity modifcar(@PathVariable Long id, @Valid @RequestBody Puesto puesto) {
        puesto.setId(id);
        return ResponseEntity.ok(puestoService.modificar(puesto));
    }

    @Operation(summary = "Consultar Detalle de un puesto",
            description = "En este método se obtiene el detalle de un puesto (relaciones)")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = Puesto.class))),
            @ApiResponse(responseCode = "400", description = "Bad Request",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class, type = "array"))),
            @ApiResponse(responseCode = "500", description = "Internal server error",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = ExceptionDto.class)))
    })
    @JsonView(View.DETAIL.class)
    @GetMapping(METHOD_PATHS.CONSULTAR_DETALLE + "/{id}")
    public ResponseEntity consultarDetalle(@PathVariable Long id) {
        return ResponseEntity.status(200).body(puestoService.consultaDetalle(id));
    }
}
