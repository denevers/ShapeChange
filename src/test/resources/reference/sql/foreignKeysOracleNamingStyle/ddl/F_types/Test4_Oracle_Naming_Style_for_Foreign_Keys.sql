CREATE TABLE FEATURETYPEA (

	_id INTEGER NOT NULL PRIMARY KEY,
	PROPERTYOFFEATURETYPEA_FK INTEGER NOT NULL   -- 
);

CREATE TABLE FEATURETYPEB (

	_id INTEGER NOT NULL PRIMARY KEY,
	PROPFEATURETYPEB_1_FK INTEGER,   -- 
	PROPFEATURETYPEB_2_FK INTEGER,   -- 
	PROPFEATURETYPEB_3_FK INTEGER,   -- 
	PROPERTYOFFEATURETYPEB_FK INTEGER NOT NULL   -- 
);

CREATE TABLE FEATURETYPEC (

	_id INTEGER NOT NULL PRIMARY KEY,
	PROPFEATURETYPEC_1_FK INTEGER,   -- 
	PROPFEATURETYPEC_2_FK INTEGER,   -- 
	PROPFEATURETYPEC_3_FK INTEGER   -- 
);




ALTER TABLE FEATURETYPEA ADD CONSTRAINT FK_FEATURET_FEATURET_PROPERTY FOREIGN KEY (PROPERTYOFFEATURETYPEA_FK) REFERENCES FEATURETYPEB;
ALTER TABLE FEATURETYPEB ADD CONSTRAINT FK_FEATURET_FEATURET_PROPFEAT FOREIGN KEY (PROPFEATURETYPEB_1_FK) REFERENCES FEATURETYPEC;
ALTER TABLE FEATURETYPEB ADD CONSTRAINT FK_FEATURET_FEATURET_PROPFEAT0 FOREIGN KEY (PROPFEATURETYPEB_2_FK) REFERENCES FEATURETYPEC;
ALTER TABLE FEATURETYPEB ADD CONSTRAINT FK_FEATURET_FEATURET_PROPFEAT1 FOREIGN KEY (PROPFEATURETYPEB_3_FK) REFERENCES FEATURETYPEC;
ALTER TABLE FEATURETYPEB ADD CONSTRAINT FK_FEATURET_FEATURET_PROPERTY0 FOREIGN KEY (PROPERTYOFFEATURETYPEB_FK) REFERENCES FEATURETYPEA;
ALTER TABLE FEATURETYPEC ADD CONSTRAINT FK_FEATURET_FEATURET_PROPFEAT2 FOREIGN KEY (PROPFEATURETYPEC_1_FK) REFERENCES FEATURETYPEB;
ALTER TABLE FEATURETYPEC ADD CONSTRAINT FK_FEATURET_FEATURET_PROPFEAT3 FOREIGN KEY (PROPFEATURETYPEC_2_FK) REFERENCES FEATURETYPEB;
ALTER TABLE FEATURETYPEC ADD CONSTRAINT FK_FEATURET_FEATURET_PROPFEAT4 FOREIGN KEY (PROPFEATURETYPEC_3_FK) REFERENCES FEATURETYPEB;


