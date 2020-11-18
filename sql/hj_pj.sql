drop table pokemon;

drop table trainer;

drop table po_user;

drop table captpo;

create table captpo (
    u_id varchar2(20) NOT NULL,
    pokemonname varchar2(20) NOT NULL,
    CONSTRAINTS captpo_fk foreign key(u_id) references po_user(id),
    CONSTRAINTS captpo_fk1 foreign key(pokemonname) references pokemon(pokemonname)
);

create table po_user(
    id varchar2(20) primary key not null,
    pw varchar2(20) not null,
    name varchar2(20) not null,
    age varchar2(20) not null,
    sex varchar2(10) not null
);

create table trainer (
   t_id number(4) primary key NOT NULL,
   charimage VARCHAR2(20) NOT NULL,
   nickname VARCHAR2(20)   NOT NULL,
   content VARCHAR2(300)   NOT NULL,
   loc VARCHAR2(20)   NOT NULL,
   pokemon VARCHAR2(20)   NOT NULL,
   u_id varchar2(20),
   CONSTRAINTS trainer_fk foreign key(u_id) references po_user(id)
);

create sequence trainer_sq start with 1 increment by 1;

create table pokemon (
	pokemonname 	 VARCHAR2(20) primary key NOT NULL,
    weight			 VARCHAR2(20) NOT NULL,
    height 			 VARCHAR2(20) NOT NULL,
	Classification 	 VARCHAR2(20) NOT NULL,
    infomation   	 VARCHAR2(200) NOT NULL
);


insert into pokemon values('독침붕','29.5kg','1.0m','독벌포켓몬','양손과 엉덩이에 있는 3개의
독침으로 상대를 찌르고 찌르고 또 찌르며 공격한다.');
insert into pokemon values('루기아', '216.0kg', '5.2m', '잠수포켓몬', '깊은 해구의 밑바닥에서 잠잔다.
루기아가 날개를 치면 40일 동안 폭풍우가 계속된다고 전해진다.');
insert into pokemon values('리자몽', '90.5kg', '1.7m', '화염포켓몬', '입에서 작렬하는 불꽃을
토해낼 때 꼬리의 끝이 더욱 붉고 격렬하게 타오른다.');
insert into pokemon values('치코리타', '6.4kg', '0.9m', '잎사귀포켓몬', '머리의 잎사귀에서 살짝 달콤한
향기가 감돈다. 얌전하며 햇볕을 쬐는 것을 매우 좋아한다.');
insert into pokemon values('토게피', '1.5kg', '0.3m', '바늘알포켓몬', '껍질 안에 행복이 가득
차 있어서 상냥하게 대하면 행운을 나누어 준다고 한다.');
insert into pokemon values('피츄', '2.0kg', '0.3m', '아기쥐포켓몬', '아직 전기를 다루는 것이 서툴다. 
잠시 한눈팔면 자기의 전기에 마비되어 있을 때도 있다.');

commit

select * from po_user;

select * from pokemon;

select * from trainer;

select * from captpo;


