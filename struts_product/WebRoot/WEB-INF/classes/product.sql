--1. 完成商品表
/*product
productId int, -- 主键Id
productName varchar2(20),
qty number
*/
create table product
(
    producId int primary key,
    productName varchar2(20),
    qty number
)

insert into product values(1,'苹果',200);
insert into product values(2,'梨子',150);
insert into product values(3,'香蕉',225);
insert into product values(4,'橘子',115);

select * from product

delete from product where producId=4

select * from dept;