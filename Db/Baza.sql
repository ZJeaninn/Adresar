drop table "Oseba";
drop table POSTA;


CREATE TABLE OSEBA

(    
   IDOSEBA INT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),   
   PRIIMEK VARCHAR(50),     
   STEVILKA VARCHAR(50),
 
   POSTA INTEGER

);

CREATE TABLE POSTA

(    
  IDPOSTA INT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),  
   KRAJ VARCHAR(50)

);

alter table OSEBA
add foreign key (POSTA) references POSTA(IDPOSTA);