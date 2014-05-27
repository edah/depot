CREATE DATABASE AnnuaireBD;

CREATE TABLE `company` (
  `company_id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL default '',
  PRIMARY KEY  (`company_id`),
  UNIQUE KEY `UNIQUE_NAME` USING HASH (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `agency` (
  `agency_id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL default '',
  PRIMARY KEY  (`agency_id`),
  UNIQUE KEY `UNIQUE_NAME` USING HASH (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `user` (
  `user_id` int(10) unsigned NOT NULL auto_increment,
  `login` varchar(25) NOT NULL default '',
  `password` varchar(25) NOT NULL default '',
  `fullname` varchar(45) NOT NULL default '',
  PRIMARY KEY  (`user_id`),
  UNIQUE KEY `UNIQUE_LOGIN` USING BTREE (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



CREATE TABLE `agency_users` (
  `user_id` int(10) unsigned NOT NULL default '0',
  `agency_id` int(10) unsigned NOT NULL default '0',
  PRIMARY KEY  (`user_id`,`agency_id`),
  KEY `FK_agency_users_2` (`user_id`),
  CONSTRAINT `FK_agency_users_1` FOREIGN KEY (`agency_id`) REFERENCES `agency` (`agency_id`) ON DELETE CASCADE,
  CONSTRAINT `FK_agency_users_2` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


CREATE TABLE `company_agencys` (
  `agency_id` int(10) unsigned NOT NULL default '0',
  `company_id` int(10) unsigned NOT NULL default '0',
  PRIMARY KEY  (`agency_id`,`company_id`),
  KEY `FK_company_agencys_2` (`agency_id`),
  CONSTRAINT `FK_company_agencys_1` FOREIGN KEY (`company_id`) REFERENCES `company` (`company_id`) ON DELETE CASCADE,
  CONSTRAINT `FK_company_agencys_2` FOREIGN KEY (`agency_id`) REFERENCES `agency` (`agency_id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
