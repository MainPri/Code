--1. �����Ʒ��
/*product
productId int, -- ����Id
productName varchar2(20),
qty number
*/
create table product
(
    producId int primary key,
    productName varchar2(20),
    qty number
)

insert into product values(1,'ƻ��',200);
insert into product values(2,'����',150);
insert into product values(3,'�㽶',225);
insert into product values(4,'����',115);

select * from product

delete from product where producId=4

select * from dept;