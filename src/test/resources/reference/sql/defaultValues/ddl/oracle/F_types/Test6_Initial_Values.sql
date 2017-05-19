CREATE TABLE T6_CLASS1 (

   _ID INTEGER NOT NULL PRIMARY KEY,
   PROPBOOLEANFALSE INTEGER DEFAULT 0,
   PROPBOOLEANTRUE INTEGER DEFAULT 1,
   PROPINTEGER INTEGER DEFAULT 3,
   PROPNUMBER NUMBER DEFAULT 2.1,
   PROPSTRING CLOB DEFAULT 'mydefault'
);

CREATE TABLE T6_CLASS1_PROPSTRINGS (

   T6_CLASS1_ID INTEGER NOT NULL,
   PROPSTRINGS VARCHAR2(50) NOT NULL DEFAULT 'abc',
   PRIMARY KEY (T6_CLASS1_ID, PROPSTRINGS)
);


ALTER TABLE T6_CLASS1_PROPSTRINGS ADD CONSTRAINT FK_T6_CLASS1_PROPSTRINGS_T6_CL FOREIGN KEY (T6_CLASS1_ID) REFERENCES T6_CLASS1;
