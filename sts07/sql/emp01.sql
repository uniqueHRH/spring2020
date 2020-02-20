use class03;
drop table emp01;

CREATE TABLE emp01 (
  sabun int(11) NOT NULL AUTO_INCREMENT,
  name varchar(45) NOT NULL,
  pay int(11) DEFAULT NULL,
  nalja datetime DEFAULT NULL,
  deptno int(11) DEFAULT NULL,
  PRIMARY KEY (sabun),
  KEY deptno_fk_idx (deptno),
  KEY idx_emp01_nalja_pay (pay,nalja),
  CONSTRAINT emp01_fk FOREIGN KEY (deptno) REFERENCES dept01 (deptno) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8

INSERT INTO emp01 (sabun,name,pay,nalja,deptno) VALUES (1,'test1',2800,'2020-02-17 12:40:17',1);
INSERT INTO emp01 (sabun,name,pay,nalja,deptno) VALUES (2,'test2',3200,'2020-02-17 12:40:18',2);
INSERT INTO emp01 (sabun,name,pay,nalja,deptno) VALUES (3,'test3',3300,'2020-02-17 12:40:19',3);
INSERT INTO emp01 (sabun,name,pay,nalja,deptno) VALUES (4,'test4',3000,'2020-02-17 12:40:23',2);
INSERT INTO emp01 (sabun,name,pay,nalja,deptno) VALUES (5,'test5',3200,'2020-02-17 12:40:24',3);
