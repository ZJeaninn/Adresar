
drop table POSTA;

CREATE TABLE POSTA

(    
   IDPOSTA INT not null primary key,  
   KRAJ VARCHAR(50)

);

drop table "Oseba" ;

CREATE TABLE "Oseba"

(    
   "IdOSeba" INT not null primary key
        GENERATED ALWAYS AS IDENTITY
        (START WITH 1, INCREMENT BY 1),   
   "Priimek" VARCHAR(50),     
   "Stevilka" VARCHAR(50),
 
   "Posta" INTEGER

);

alter table "Oseba"
add foreign key ("Posta") references POSTA(IdPosta);

