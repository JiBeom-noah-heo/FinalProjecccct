create table member4 (
	id varchar2(20) primary key,
	email varchar2(30),
	password varchar2(20),
	name varchar2(20),
	fileName varchar2(50),
	del char(1) default 'n',
	regdate date
);
drop table member4;

ALTER TABLE customer MODIFY(c_gender varchar(6));

create table customer(
   c_id varchar2(20) primary key,
   c_password varchar2(20),
   c_name varchar(20),
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
drop table bascket cascade constraint;
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

/*   pb_image varchar(50),*/
create sequence board_seq start with 1 increment BY 1 maxvalue 1000000;
create sequence reply_seq start with 1 increment BY 1 maxvalue 1000000;

create TABLE product_board(
   pb_num number(10) primary key,
   pb_p_num number(10) references product(p_num),
   pb_po_num number(10) references product_order(po_num),
   pb_title varchar2(20),
   pb_content varchar2(500),
   pb_readcount number(10),
   pb_like number(10),
   pb_writer varchar2(10),
   pb_ip varchar2(10),
   pb_regdate date default sysdate,
   pb_del char(1) default 'n'
);

drop table product_board cascade constraint;

create table product_board_reply(
   pbr_num number(10) primary key,
   pbr_pb_num number(10) references product_board(pb_num),
   pbr_depth number(10),
   pbr_content varchar2(500),
   pbr_writer varchar2(10),
   pbr_ip varchar2(10),
   pbr_regdate date default sysdate,
   pbr_del char(1) default 'n'
);


drop table basket cascade constraint;
create table basket(
   ba_num number(10) primary key,
   ba_c_id varchar2(20) references customer(c_id),
   ba_p_num number(10) references product(p_num),
   ba_qauntity number(10),
   ba_price number(20),
   ba_size varchar2(20),
   ba_color varchar2(20),
   ba_brand varchar2(20),
   ba_category varchar2(20),
   ba_date date default sysdate
);

create table PRODUCT_order(
   po_num number(10) primary key,
   po_ba_num number(10) references basket(ba_num),
   po_ba_c_id varchar2(20) references CUSTOMER(c_id),
   po_ba_p_num number(10) references PRODUCT(p_num),
   po_qauntity number(10),
   po_size varchar2(10),
   po_color varchar2(20),
   po_receiver varchar2(20),
   po_address varchar2(20),
   po_zip varchar2(20),
   po_tel varchar2(20),
   po_memo varchar2(50),
   po_totprice number(10),
   po_delivno varchar2(20),
   po_delivtype varchar2(20),
   po_delivplayer varchar2(20),
   po_delivstatus varchar2(20),
   po_purdate date default sysdate,
   po_comdate date
);