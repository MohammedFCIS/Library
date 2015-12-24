create table LSM_LMSBook (
	lMSBookId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	bookTitle VARCHAR(75) null,
	bookAuthor VARCHAR(75) null
);