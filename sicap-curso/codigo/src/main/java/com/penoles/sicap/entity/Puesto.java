package com.penoles.sicap.entity;

import com.fasterxml.jackson.annotation.JsonView;
import com.penoles.framework.model.view.View;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "puesto")
@EntityListeners(AuditingEntityListener.class)
public class Puesto {
    @JsonView(value = {View.GET.class, View.DETAIL.class})
    @Id
    @Schema(description = "Id consecutivo generado en backend")
    @Column(name = "pue_id")
    private Long id;

    @JsonView(value = {View.GET.class, View.POST.class, View.PUT.class, View.DETAIL.class})
    @Schema(description = "Clave del puesto única")
    @Column(name = "pue_clave")
    @NotBlank(message = "Clave es un campo obligatorio")
    @Size(min = 3, max = 20, message = "Clave no puede ser mayor que 20 caracteres")
    private String clave;

    @JsonView(value = {View.GET.class, View.POST.class, View.PUT.class, View.DETAIL.class})
    @NotNull(message = "Tipo de puesto es un campo obligatorio")
    @Schema(description = "Tipo de puesto")
    @Column(name = "pue_tipo")
    private String tipo;

    @JsonView(value = {View.GET.class, View.POST.class, View.PUT.class, View.DETAIL.class})
    @NotBlank(message = "Nombre del puesto es un campo obligatorio")
    @Size(min = 3, max = 50, message = "Nombre del puesto longitud debe ser mayor que 3 y menor que 50 caracteres")
    @Schema(description = "Nombre del puesto")
    @Column(name = "pue_nombre")
    private String nombre;

    @JsonView(value = {View.GET.class, View.POST.class, View.PUT.class, View.DETAIL.class})
    @Schema(description = "Estatus del puesto")
    @NotBlank(message = "Estatus del puesto es un campo obligatorio")
    @Column(name = "pue_estatus")
    private String estatus;

    @JsonView(value = {View.GET.class, View.POST.class, View.PUT.class, View.DETAIL.class})
    @Size(max = 400, message = "Descripción de puesto debe de tener menos de 4000 caracteres")
    @Schema(description = "Descripción del puesto")
    @Column(name = "pue_descripcion")
    private String descripcion;

    @CreatedBy
    @JsonView(value = {View.GET.class, View.DETAIL.class})
    @Schema(description = "Usuario de registro")
    @Column(name = "pue_usu_reg", updatable = false, nullable = false)
    private String usuReg;

    @CreatedDate
    @JsonView(value = {View.GET.class, View.DETAIL.class})
    @Schema(description = "Fecha de registro")
    @Column(name = "pue_fec_reg", updatable = false, nullable = false)
    private Date fecReg;

    @LastModifiedBy
    @JsonView(value = {View.GET.class, View.DETAIL.class})
    @Schema(description = "Usuario de actualización")
    @Column(name = "pue_usu_act")
    private String usuAct;

    @LastModifiedDate
    @JsonView(value = {View.GET.class, View.DETAIL.class})
    @Schema(description = "Fecha de actualización")
    @Column(name = "pue_fec_act")
    private Date fecAct;

}
