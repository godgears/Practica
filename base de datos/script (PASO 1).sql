DROP TABLE accidentes CASCADE CONSTRAINTS;
DROP TABLE asesorias CASCADE CONSTRAINTS;
DROP TABLE capacitaciones CASCADE CONSTRAINTS;
DROP TABLE chequeo CASCADE CONSTRAINTS;
DROP TABLE cliente CASCADE CONSTRAINTS;
DROP TABLE empleado CASCADE CONSTRAINTS;
DROP TABLE mejoras CASCADE CONSTRAINTS;
DROP TABLE pagos CASCADE CONSTRAINTS;
DROP TABLE visitas CASCADE CONSTRAINTS;

DROP SEQUENCE ACCIDENTES_SEQ;
DROP SEQUENCE ASESORIAS_SEQ;
DROP SEQUENCE CAPACITACIONES_SEQ;
DROP SEQUENCE CHEQUEO_SEQ;
DROP SEQUENCE CLIENTE_SEQ;
DROP SEQUENCE EMPLEADO_SEQ;
DROP SEQUENCE MEJORAS_SEQ;
DROP SEQUENCE PAGOS_SEQ;
DROP SEQUENCE VISITAS_SEQ;


CREATE TABLE accidentes (
    id_accidente        NUMBER NOT NULL,
    fecha               VARCHAR2(10) NOT NULL,
    hora                VARCHAR2(10) NOT NULL,
    suceso              VARCHAR2(500) NOT NULL,
    lugar               VARCHAR2(100) NOT NULL,
    cliente_id_cliente  NUMBER NOT NULL
);

ALTER TABLE accidentes ADD CONSTRAINT accidentes_pk PRIMARY KEY ( id_accidente );

CREATE TABLE asesorias (
    id_asesoria        NUMBER NOT NULL,
    detalle            VARCHAR2(500),
    gestion            VARCHAR2(500) NOT NULL,
    propuestas         VARCHAR2(500),
    fecha              VARCHAR2(10),
    especial           VARCHAR2(5),
    visitas_id_visita  NUMBER NOT NULL
);

ALTER TABLE asesorias ADD CONSTRAINT asesorias_pk PRIMARY KEY ( id_asesoria );

CREATE TABLE capacitaciones (
    id_capacitacion    NUMBER NOT NULL,
    fecha              VARCHAR2(10) NOT NULL,
    hora               VARCHAR2(10) NOT NULL,
    numasistentes      NUMBER,
    visitas_id_visita  NUMBER NOT NULL
);

ALTER TABLE capacitaciones ADD CONSTRAINT capacitaciones_pk PRIMARY KEY ( id_capacitacion );

CREATE TABLE chequeo (
    id_chequeo         NUMBER NOT NULL,
    detalle            VARCHAR2(10) NOT NULL,
    estado             VARCHAR2(5) NOT NULL,
    visitas_id_visita  NUMBER NOT NULL
);

ALTER TABLE chequeo ADD CONSTRAINT chequeo_pk PRIMARY KEY ( id_chequeo );

CREATE TABLE cliente (
    id_cliente            NUMBER NOT NULL,
    nombre                VARCHAR2(50) NOT NULL,
    telefono              NUMBER,
    correoelectronico     VARCHAR2(50),
    rubro                 VARCHAR2(30),
    direccion             VARCHAR2(100) NOT NULL,
    cantidadtrabajadores  NUMBER
);

ALTER TABLE cliente ADD CONSTRAINT cliente_pk PRIMARY KEY ( id_cliente );

CREATE TABLE empleado (
    id_empleado   NUMBER NOT NULL,
    nombre        VARCHAR2(100) NOT NULL,
    especialidad  VARCHAR2(50)
);

ALTER TABLE empleado ADD CONSTRAINT empleado_pk PRIMARY KEY ( id_empleado );

CREATE TABLE mejoras (
    id_mejora           NUMBER NOT NULL,
    fecha               VARCHAR2(10),
    motivo              VARCHAR2(500),
    actividades         VARCHAR2(500),
    estado              VARCHAR2(5),
    cliente_id_cliente  NUMBER NOT NULL
);

ALTER TABLE mejoras ADD CONSTRAINT mejoras_pk PRIMARY KEY ( id_mejora );

CREATE TABLE pagos (
    id_pago             NUMBER NOT NULL,
    mesanio             VARCHAR2(10) NOT NULL,
    montoregular        NUMBER,
    montoadicionales    NUMBER,
    cliente_id_cliente  NUMBER NOT NULL
);

ALTER TABLE pagos ADD CONSTRAINT pagos_pk PRIMARY KEY ( id_pago );

CREATE TABLE visitas (
    id_visita             NUMBER NOT NULL,
    direccion             VARCHAR2(100),
    ciudad                VARCHAR2(50),
    fecha                 VARCHAR2(10),
    resumen               VARCHAR2(500),
    observaciones         VARCHAR2(500),
    cliente_id_cliente    NUMBER NOT NULL,
    empleado_id_empleado  NUMBER NOT NULL
);

ALTER TABLE visitas ADD CONSTRAINT visitas_pk PRIMARY KEY ( id_visita );

ALTER TABLE accidentes
    ADD CONSTRAINT accidentes_cliente_fk FOREIGN KEY ( cliente_id_cliente )
        REFERENCES cliente ( id_cliente );

ALTER TABLE asesorias
    ADD CONSTRAINT asesorias_visitas_fk FOREIGN KEY ( visitas_id_visita )
        REFERENCES visitas ( id_visita );

ALTER TABLE capacitaciones
    ADD CONSTRAINT capacitaciones_visitas_fk FOREIGN KEY ( visitas_id_visita )
        REFERENCES visitas ( id_visita );

ALTER TABLE chequeo
    ADD CONSTRAINT chequeo_visitas_fk FOREIGN KEY ( visitas_id_visita )
        REFERENCES visitas ( id_visita );

ALTER TABLE mejoras
    ADD CONSTRAINT mejoras_cliente_fk FOREIGN KEY ( cliente_id_cliente )
        REFERENCES cliente ( id_cliente );

ALTER TABLE pagos
    ADD CONSTRAINT pagos_cliente_fk FOREIGN KEY ( cliente_id_cliente )
        REFERENCES cliente ( id_cliente );

ALTER TABLE visitas
    ADD CONSTRAINT visitas_cliente_fk FOREIGN KEY ( cliente_id_cliente )
        REFERENCES cliente ( id_cliente );

ALTER TABLE visitas
    ADD CONSTRAINT visitas_empleado_fk FOREIGN KEY ( empleado_id_empleado )
        REFERENCES empleado ( id_empleado );

--secuencias
CREATE SEQUENCE ACCIDENTES_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE ;
CREATE SEQUENCE ASESORIAS_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE;
CREATE SEQUENCE CAPACITACIONES_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE;
CREATE SEQUENCE CHEQUEO_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE;
CREATE SEQUENCE CLIENTE_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE;
CREATE SEQUENCE EMPLEADO_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE;
CREATE SEQUENCE MEJORAS_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE;
CREATE SEQUENCE PAGOS_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE;
CREATE SEQUENCE VISITAS_SEQ MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE;

