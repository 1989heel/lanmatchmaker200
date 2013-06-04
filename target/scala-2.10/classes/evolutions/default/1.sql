# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table event (
  host                      bigint not null,
  owner                     varchar(255),
  location                  varchar(255),
  name                      varchar(255),
  description               varchar(255),
  fee                       varchar(255),
  stream_username           varchar(255),
  picture                   varchar(255),
  start                     timestamp,
  end                       timestamp,
  info                      varchar(255),
  constraint pk_event primary key (host))
;

create table follow (
  id                        bigint not null,
  follower_username         varchar(255),
  followed_username         varchar(255),
  constraint pk_follow primary key (id))
;

create table friend_request (
  id                        bigint not null,
  sender_username           varchar(255),
  receiver_username         varchar(255),
  constraint pk_friend_request primary key (id))
;

create table friend_ship (
  id                        bigint not null,
  user_username             varchar(255),
  friend_username           varchar(255),
  constraint pk_friend_ship primary key (id))
;

create table game (
  title                     varchar(255) not null,
  publisher                 varchar(255),
  constraint pk_game primary key (title))
;

create table matchmaker (
  id                        bigint not null,
  type                      varchar(255),
  value                     varchar(255),
  parent_id                 bigint,
  constraint pk_matchmaker primary key (id))
;

create table user_profile (
  username                  varchar(255) not null,
  residence                 varchar(255),
  equipment                 varchar(255),
  picture                   varchar(255),
  sex                       varchar(255),
  games                     varchar(255),
  age                       integer,
  signature                 varchar(255),
  about                     varchar(255),
  matchmake_game            varchar(255),
  queue                     boolean,
  size                      integer,
  matchmaker_id             bigint,
  constraint pk_user_profile primary key (username))
;

create table account (
  username                  varchar(255) not null,
  email                     varchar(255),
  password                  varchar(255),
  user_profile_username     varchar(255),
  constraint pk_account primary key (username))
;


create table matchmaker_user_profile (
  matchmaker_id                  bigint not null,
  user_profile_username          varchar(255) not null,
  constraint pk_matchmaker_user_profile primary key (matchmaker_id, user_profile_username))
;

create table user_profile_game (
  user_profile_username          varchar(255) not null,
  game_title                     varchar(255) not null,
  constraint pk_user_profile_game primary key (user_profile_username, game_title))
;

create table account_event (
  account_username               varchar(255) not null,
  event_host                     bigint not null,
  constraint pk_account_event primary key (account_username, event_host))
;
create sequence event_seq;

create sequence follow_seq;

create sequence friend_request_seq;

create sequence friend_ship_seq;

create sequence game_seq;

create sequence matchmaker_seq;

create sequence user_profile_seq;

create sequence account_seq;

alter table follow add constraint fk_follow_follower_1 foreign key (follower_username) references user_profile (username) on delete restrict on update restrict;
create index ix_follow_follower_1 on follow (follower_username);
alter table follow add constraint fk_follow_followed_2 foreign key (followed_username) references user_profile (username) on delete restrict on update restrict;
create index ix_follow_followed_2 on follow (followed_username);
alter table friend_request add constraint fk_friend_request_sender_3 foreign key (sender_username) references user_profile (username) on delete restrict on update restrict;
create index ix_friend_request_sender_3 on friend_request (sender_username);
alter table friend_request add constraint fk_friend_request_receiver_4 foreign key (receiver_username) references user_profile (username) on delete restrict on update restrict;
create index ix_friend_request_receiver_4 on friend_request (receiver_username);
alter table friend_ship add constraint fk_friend_ship_user_5 foreign key (user_username) references user_profile (username) on delete restrict on update restrict;
create index ix_friend_ship_user_5 on friend_ship (user_username);
alter table friend_ship add constraint fk_friend_ship_friend_6 foreign key (friend_username) references user_profile (username) on delete restrict on update restrict;
create index ix_friend_ship_friend_6 on friend_ship (friend_username);
alter table matchmaker add constraint fk_matchmaker_parent_7 foreign key (parent_id) references matchmaker (id) on delete restrict on update restrict;
create index ix_matchmaker_parent_7 on matchmaker (parent_id);
alter table user_profile add constraint fk_user_profile_matchmaker_8 foreign key (matchmaker_id) references matchmaker (id) on delete restrict on update restrict;
create index ix_user_profile_matchmaker_8 on user_profile (matchmaker_id);
alter table account add constraint fk_account_userProfile_9 foreign key (user_profile_username) references user_profile (username) on delete restrict on update restrict;
create index ix_account_userProfile_9 on account (user_profile_username);



alter table matchmaker_user_profile add constraint fk_matchmaker_user_profile_ma_01 foreign key (matchmaker_id) references matchmaker (id) on delete restrict on update restrict;

alter table matchmaker_user_profile add constraint fk_matchmaker_user_profile_us_02 foreign key (user_profile_username) references user_profile (username) on delete restrict on update restrict;

alter table user_profile_game add constraint fk_user_profile_game_user_pro_01 foreign key (user_profile_username) references user_profile (username) on delete restrict on update restrict;

alter table user_profile_game add constraint fk_user_profile_game_game_02 foreign key (game_title) references game (title) on delete restrict on update restrict;

alter table account_event add constraint fk_account_event_account_01 foreign key (account_username) references account (username) on delete restrict on update restrict;

alter table account_event add constraint fk_account_event_event_02 foreign key (event_host) references event (host) on delete restrict on update restrict;

# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists event;

drop table if exists account_event;

drop table if exists follow;

drop table if exists friend_request;

drop table if exists friend_ship;

drop table if exists game;

drop table if exists user_profile_game;

drop table if exists matchmaker;

drop table if exists matchmaker_user_profile;

drop table if exists user_profile;

drop table if exists account;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists event_seq;

drop sequence if exists follow_seq;

drop sequence if exists friend_request_seq;

drop sequence if exists friend_ship_seq;

drop sequence if exists game_seq;

drop sequence if exists matchmaker_seq;

drop sequence if exists user_profile_seq;

drop sequence if exists account_seq;

