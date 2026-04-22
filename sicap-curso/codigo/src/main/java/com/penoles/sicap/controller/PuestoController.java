package com.penoles.sicap.controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.penoles.framework.base.BaseController;
import com.penoles.framework.constants.METHOD_PATHS;
import com.penoles.framework.exception.PenolesException;
import com.penoles.framework.exception.model.ExceptionDto;
import com.penoles.framework.model.validation.group.ValidationGroup;
import com.penoles.framework.model.view.View;
import com.penoles.sicap.controller.bean.PuestoConsulta;
import com.penoles.sicap.entity.Puesto;
import com.penoles.sicap.service.PuestoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Logger;

@RestController
@RequestMapping("/v1/puesto")
@PreAuthorize("@PenolesMethodSecurity.access")
@Tag(name = "Origen", description = "Catálogo de operaciones a tabla origen")
public class PuestoController extends BaseController<Puesto, Long, PuestoConsulta> {

    private static final Logger logger = Logger.getLogger(PuestoController.class.getName());
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
    @Override
    public ResponseEntity consultar() {
        return ResponseEntity.status(200).body(puestoService.consultar());
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
    @Override
    public ResponseEntity consultarDetalle(@NotNull Long id) {
        try {
            return ResponseEntity.status(200).body(puestoService.consultaDetalle(id));
        } catch (PenolesException ex) {
            throw ex;
        }

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
    @JsonView(View.POST.class)
    @PostMapping(METHOD_PATHS.GUARDAR)
    @Override
    public ResponseEntity guardar(@Validated(ValidationGroup.onPost.class) Puesto puesto) {
        return ResponseEntity.ok(puestoService.guardar(puesto));
    }

    //
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
    @Override
    public ResponseEntity eliminar(@NotNull Long id) {
        boolean resp = puestoService.eliminar(id);
        if (resp)
            return ResponseEntity.status(200).build();
        else
            throw new PenolesException(500, "Ocurrió un error al eliminar la información");
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
    @Override
    public ResponseEntity modificar(@Valid Puesto puesto, @NotNull Long aLong) {
        return super.modificar(puesto, aLong);
    }
}
