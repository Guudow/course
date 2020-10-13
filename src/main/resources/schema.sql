CREATE TABLE course (
    courseID integer identity NOT NULL,
    title varchar(80) NOT NULL,
    description varchar(500) not null,
    link varchar(255) NOT NULL,
    CONSTRAINT pk_course_courseID PRIMARY KEY (courseID)
);