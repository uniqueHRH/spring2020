use class03;
drop table dept01;

CREATE TABLE dept01 (
  deptno int(11) NOT NULL AUTO_INCREMENT,
  dname varchar(45) DEFAULT NULL,
  loc varchar(45) DEFAULT NULL,
  PRIMARY KEY (deptno)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8

INSERT INTO dept01 (deptno,dname,loc) VALUES (1,'손해사정','대구');
INSERT INTO dept01 (deptno,dname,loc) VALUES (2,'인사팀','서울');
INSERT INTO dept01 (deptno,dname,loc) VALUES (3,'영업팀','광주');
INSERT INTO dept01 (deptno,dname,loc) VALUES (4,'총무팀�','대전');
INSERT INTO dept01 (deptno,dname,loc) VALUES (5,'마케팅팀','광주');
INSERT INTO dept01 (deptno,dname,loc) VALUES (6,'디자인팀','강원');
INSERT INTO dept01 (deptno,dname,loc) VALUES (17,'경영팀�','부산');
