CREATE TABLE public.observaciones_solicitud_informacion (
    id bigint NOT NULL,
    id_tipo_envio bigint NOT NULL,
    observacion character varying(1000) NOT null,
    fecha_solicitud_informacion TIMESTAMP WITH TIME ZONE DEFAULT NOW()
);

ALTER TABLE public.observaciones_solicitud_informacion ALTER COLUMN id ADD GENERATED BY DEFAULT AS IDENTITY (
    SEQUENCE NAME public.observaciones_solicitud_informacion_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);
alter table public.observaciones_solicitud_informacion  add primary key(id);