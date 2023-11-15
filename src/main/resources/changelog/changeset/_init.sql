 create sequence invoice_file_id_seq;
-- create sequence agents_id_seq;
-- create sequence agent_files_id_seq;
-- create sequence bank_details_id_seq;

-- invoice_files
create table if not exists invoice_file
(
    id   bigserial
    primary key,
    invoice_number varchar(20),
    invoice bigserial
    );

-- marking_code
 create table if not exists marking_code
 (
     id   bigserial
     primary key,
     invoice_number varchar(20),
     invoice bigserial,
     code varchar(20)
     );
