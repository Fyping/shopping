CREATE DATABASE mobiledata
CHARACTER SET utf8
COLLATE utf8_general_ci;

use mobiledata;

DROP TABLE IF EXISTS tb_Member;
DROP TABLE IF EXISTS tb_OrderInfo;
DROP TABLE IF EXISTS tb_GoodsInfo;
DROP TABLE IF EXISTS tb_BuyInfo;
DROP TABLE IF EXISTS tb_ShopCart;
DROP TABLE IF EXISTS tb_Admin;


DROP TABLE IF EXISTS tb_Member;
CREATE TABLE tb_Member
( 
  memberid INT(10) NOT NULL AUTO_INCREMENT
, memberuuid   varchar(255) not null
, username VARCHAR(255) NOT NULL 
, userpwd VARCHAR(255) NOT NULL 
, email VARCHAR(255) NULL 
, phonenum CHAR(11) NOT NULL 
, sex INT(10) NULL 
, realname VARCHAR(255) NOT NULL 
, address VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL 
, postcode VARCHAR(255) NOT NULL 
, CONSTRAINT PRIMARY KEY ( memberid ) 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

 insert into tb_Member(memberuuid,username,userpwd,email,phonenum,sex,realname,address,postcode) values('8fb6d96d-8b7d-45dc-b158-8009d188452f','fyping','helloworld','115159111@192.com','11111100000','1','FYP','jiangxinancan','341200');
 delete tb_Member from tb_Member where memberid = 1;
 CREATE TABLE tb_OrderInfo 
( 
 orderid             INT(10) NOT NULL AUTO_INCREMENT,
 orderuuid           varchar(255) not null , 
 memberid            INT(10) NOT NULL  references tb_Member(memberid),
 orderdate           date  not null ,
 receviername        varchar(255) not null,
 recevierphone       varchar(255) not null,
 receiveraddress     varchar(255)CHARACTER SET utf8 COLLATE utf8_general_ci not null,
 receiverpostcode    varchar(255) not null,
 receiveremails      varchar(255)  not null,
 isconfirm    tinyint ,
 ispayment    tinyint ,
 CONSTRAINT primary key(orderid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS tb_GoodsInfo;
create  table tb_GoodsInfo(
 goodsid         INT(10) NOT NULL AUTO_INCREMENT,
 goodsuuid       varchar(255) not null,
 goodsbrand      varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci not null,
 goodsdescript   text CHARACTER SET utf8 COLLATE utf8_general_ci not null ,
 goodsprice      double  not null,
 goodsurl        varchar(255) NOT NULL,
 CONSTRAINT primary key(goodsid)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
 DROP TABLE IF EXISTS tb_BuyInfo;
create  table tb_BuyInfo(
buyid     INT(10) NOT NULL AUTO_INCREMENT,
buyuuid   varchar(255)  not null,
goodsid   INT(10) NOT NULL   references tb_GoodsInfo(goodsid),
constraint primary key(buyid)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
insert into tb_BuyInfo (goodsid)values(1),(2),(3);
DROP TABLE IF EXISTS tb_ShopCart;
create  table tb_ShopCart(
 cartid    INT(10) NOT NULL AUTO_INCREMENT,
 cartuuid  varchar(255) not null,
 buyid     INT(10) ,
 memberid  INT(10) NOT NULL ,  
 totalprice double ,
 constraint primary key(cartid)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
 DROP TABLE IF EXISTS tb_Admin;
 create table tb_Admin(
 adminid  INT(10) NOT NULL AUTO_INCREMENT,
 adminuuid varchar(255) not null,  
 adminpassword varchar(255) not null,
 constraint primary key(adminid)
 )ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TRIGGER IF EXISTS trigger_after_insert_on_tb_Member;
CREATE TRIGGER trigger_after_insert_on_tb_Member
BEFORE INSERT ON tb_Member
FOR EACH ROW
insert into tb_ShopCart (cartuuid,memberid)values(new.memberuuid,memberid);
//////////////////////////////
DROP TRIGGER IF EXISTS trigger_delete_ShopCart_after_delete_from_tb_Member;
CREATE TRIGGER trigger_delete_ShopCart_after_delete_from_tb_Member
AFTER DELETE ON tb_Member
FOR EACH ROW
delete from tb_Member where tb_ShopCart.memberid=old.memberid;

 
