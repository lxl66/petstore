create table Users(
	user_id int primary key auto_increment,
	user_name varchar(50),
	user_first_name varchar(50),
	user_last_name varchar(50),
	user_email varchar(50),
	user_password varchar(50),
	user_phone varchar(20),
	user_status int
)ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;
insert into Users(user_name,user_first_name,user_last_name,user_email,user_password,user_phone,user_status) values
('郭富城','富城','郭','2934293423@qq.com','123456','15093482349',0),
('刘德华','德华','刘','9234213623@qq.com','123456','13393482349',0);
select*from `User`;

create table Category( 	# 类型
	category_id int primary key auto_increment,
	category_name varchar(50)
)ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;
insert into Category(category_name) values
('狗'),('猫'),('鸟'),('鱼')
select*from Category;

create table Pet(
	pet_id int primary key auto_increment,
	category_id int references Category(category_id),
	pet_name varchar(50),
	pet_price decimal(9,2),
	pet_status enum('可用','待定','已售出')
)ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;
insert into Pet(category_id,pet_name,pet_status) values
(1,'哈士奇',1200,'可用'),
(1,'茶杯犬',1000,'可用'),
(1,'藏獒',4000,'待定'),
(2,'波斯猫',2000,'可用'),
(3,'金鱼',10,'已售出')
select*from Pet;

create table Photo(		# 图片
	photo_id int primary key auto_increment,
	photo_name varchar(100),
	pet_id int references Pet(pet_id)
)ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;
insert into values('1.jpg',1);
insert into values('2.jpg',1);
insert into values('3.jpg',2);

create table Tag(			# 标签
	tag_id int primary key auto_increment,
	tag_name varchar(50),
	pet_id int references Pet(pet_id)
)ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;
insert into Tag(tag_name,pet_id) values
('可爱',1),('讨人喜欢',2),('凶猛',3);

create table Orders(
	order_id int primary key auto_increment,
	pet_id int references Pet(pet_id),
	order_quantity int,	# 数量
	order_shipDate varchar(100),
	order_status enum('放置','批准','交付'),
	order_complete tinyint(1) default false
)ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;
insert into Orders(pet_id,order_quantity,order_shipDate,order_status,order_complete) values
(1,1,'2017-10-09','批准',false),
(2,1,'2017-10-10','放置',false),
(3,1,'2017-11-10','放置',false);
select*from Orders;

create table Inventories(
	inventories_id int primary key auto_increment,
	inventories_quantity int,
	
)

create table ApiResponse(
	apiResponse_code int primary key auto_increment,
	apiResponse_type varchar(50),
	apiResponse_message varchar(50)
)ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;
insert into ApiResponse(apiResponse_type,apiResponse_message) values
('001','001');