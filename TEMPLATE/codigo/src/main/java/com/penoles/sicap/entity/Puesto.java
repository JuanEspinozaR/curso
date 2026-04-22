package com.penoles.sicap.entity;

import com.fasterxml.jackson.annotation.JsonView;
import com.penoles.framework.model.view.View;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "puesto")
@Getter
@Setter
public class Puesto {

    @JsonView(value = {View.GET.class, View.DETAIL.class})
    @Id
    @Column(name = "pue_id")
    @Schema(description = "Id consecutivo generado en backend")
    private Long id;

    @JsonView(value = {View.GET.class, View.POST.class, View.PUT.class, View.DETAIL.class})
    @Schema(description = "Clave del puesto única")
    @NotBlank(message = "Clave es un campo obligatorio")
    @Size(min = 3, max = 20, message = "Clave no puede ser mayor que 20 caracteres")
    @Column(name = "pue_clave")
    private String clave;

    @JsonView(value = {View.GET.class, View.POST.class, View.PUT.class, View.DETAIL.class})
    @Schema(description = "Tipo de puesto")
    @NotNull(message = "Tipo de puesto es un campo obligatorio")
    @Column(name = "pue_tipo")
    private String tipo;

    @JsonView(value = {View.GET.class, View.POST.class, View.PUT.class, View.DETAIL.class})
    @Schema(description = "Nombre del puesto")
    @NotBlank(message = "Nombre del puesto es un campo obligatorio")
    @Size(min = 3, max = 50, message = "Nombre del puesto longitud debe ser mayor que 3 y menor que 50 caracteres")
    @Column(name = "pue_nombre")
    private String nombre;

    @JsonView(value = {View.GET.class, View.POST.class, View.PUT.class, View.DETAIL.class})
    @Schema(description = "Estatus del puesto")
    @NotBlank(message = "Estatus del puesto es un campo obligatorio")
    @Column(name = "pue_estatus")
    private String estatus;

    @JsonView(value = {View.GET.class, View.POST.class, View.PUT.class, View.DETAIL.class})
    @Schema(description = "Descripción del puesto")
    @Size(max = 400, message = "Descripción de puesto debe de tener menos de 4000 caracteres")
    @Column(name = "pue_descripcion")
    private String descripcion;

    @JsonView(value = {View.GET.class, View.POST.class, View.DETAIL.class})
    @Schema(description = "Usuario de registro")
    @Column(name = "pue_usu_reg")
    private String usuReg;

    @JsonView(value = {View.GET.class, View.POST.class, View.DETAIL.class})
    @Schema(description = "Fecha de registro")
    @Column(name = "pue_fec_reg")
    private Date fecReg;


    @JsonView(value = {View.GET.class, View.PUT.class, View.DETAIL.class})
    @Schema(description = "Usuario de actualización")
    @Column(name = "pue_usu_act")
    private String usuAct;

    @JsonView(value = {View.GET.class, View.PUT.class, View.DETAIL.class})
    @Schema(description = "Fecha de actualización")
    @Column(name = "pue_fec_act")
    private Date fecAct;

}
