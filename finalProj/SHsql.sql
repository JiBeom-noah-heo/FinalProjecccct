create table customer(
   c_id varchar2(20) primary key,
   c_password varchar2(20),
   c_name varchar(2),
   c_gender char(1),
   c_address varchar2(20),
   c_zip varchar2(20),
   c_grade varchar2(20) default 'family',
   c_email varchar2(20),
   c_tel varchar2(20),
   c_regdate date default sysdate,
   c_del char(1) default 'n'
);

create table product_company(
   pc_name varchar2(20) primary key,
   pc_address varchar2(20),
   pc_tel varchar2(20)
);
drop table product cascade constraints;
create table product(
   p_num number(10) primary key,
   p_pc_name varchar2(20) references product_company(pc_name),
   p_image varchar(50),
   p_name varchar2(20),
   p_category varchar2(20),
   p_brand varchar2(20),
   p_size varchar2(10),
   p_discount char(1) default 'n',
   p_discountrate varchar2(10),
   p_quantity number(10),
   p_like number(10),
   p_regdate date default sysdate
);
create TABLE product_board(
   pb_num number(10) primary key,
   pb_p_num number(10) references product(p_num),
   pb_title varchar2(20),
   pb_content varchar2(500),
   pb_image varchar(50),
   pb_readcount number(10),
   pb_like number(10),
   pb_ref number(10),
   pb_restep number(10),
   pb_relevel number(10),
   pb_ip varchar2(10),
   pb_regdate date default sysdate,
   pb_del char(1) default 'n'
);
drop table basket cascade constraints;   
create table basket(
   ba_num number(10) primary key,
   ba_c_id varchar2(20) references customer(c_id),
   ba_p_num number(10) references product(p_num),
   ba_quantity number(10),
   ba_price number(20),
   ba_size varchar2(20),
   ba_color varchar2(20),
   ba_brand varchar2(20),
   ba_category varchar2(20),
   ba_date date default sysdate
);
select * from basket;
insert into table basket values(
'1','jacket','1','1','230000','L','BLACK','BARBOUR','JACKET',sysdate);
create table PRODUCT_order(
   Po_num number(10) primary key,
   Po_ba_num number(10) references basket(ba_num),
   Po_ba_c_id varchar2(20) references CUSTOMER(c_id),
   Po_ba_p_num number(10) references PRODUCT(p_num),
   Po_qauntity number(10),
   Po_size varchar2(10),
   Po_color varchar2(20),
   Po_receiver varchar2(20),
   Po_address varchar2(20),
   Po_zip varchar2(20),
   Po_tel varchar2(20),
   Po_memo varchar2(50),
   Po_totprice number(10),
   Po_delivno varchar2(20),
   Po_delivtype varchar2(20),
   Po_delivplayer varchar2(20),
   Po_delivstatus varchar2(20),
   Po_purdate date default sysdate,
   Po_comdate date
);
