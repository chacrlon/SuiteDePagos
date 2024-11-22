INSERT INTO `account_from` (`bankid`) VALUES ('0134');
INSERT INTO `account_to` ( `bankid`, `customerid`, `phonenum`) VALUES ('0134', 'J298182920', '584246641171');
INSERT INTO `device` (`description`, `ipaddress`, `type`) VALUES ('Xiaomi Note 5', '10.150.15.64', 'Celular');
INSERT INTO `profile` (`createdat`, `modifiedat`, `name`, `description`) VALUES (sysdate(), NULL, 'Admin', 'Perfil de Administrador Suite');
INSERT INTO `profile` (`createdat`, `modifiedat`, `name`, `description`) VALUES (sysdate(), NULL, 'Empleado', 'Perfil de Empleado Suite');
INSERT INTO `module_config` (`moduleid`, `name`) VALUES (NULL, 'CardPayment'), (NULL, 'P2P');
INSERT INTO `company` (`customerid`, `email`, `name`, `phonenum`) VALUES ('J264747178', 'epachecog@banesco.com', 'TD Digital', '582126641171');
INSERT INTO `company` (`customerid`, `email`, `name`, `phonenum`) VALUES ('J242864189', 'chacrlon@banesco.com', 'Backend', '584123705210');
INSERT INTO `credential_card_payment` (`keyid`, `publickey`, `createdat`, `modifiedat`, `companyid`) VALUES ('A297F3AF-B265-4682-A8F7-F40EAC534D54', 'e0552635ee8d21d1043f07dc830da709', sysdate(), null, 1);
INSERT INTO `credential_p2p` (`clientid`, `clientsecret`, `createdat`, `modifiedat`, `companyid`) VALUES ('78597845', '058da690e78e52b71b83fa4c86c5fb57', sysdate(), NULL, '1');
INSERT INTO `company_module` (`companyid`, `moduleid`) VALUES ('1', '1');
INSERT INTO `company_module` (`companyid`, `moduleid`) VALUES ('1', '2');
INSERT INTO `user` (`createdat`, `surname`, `email`, `enabled`, `customerid`, `name`, `password`, `username`, `companyid`, `profileid`) VALUES (sysdate(), 'pacheco', 'epachecog@banesco.com', 1, 'V26474717', 'Erikson', '$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq', 'epachecog', 1, 1);
INSERT INTO `user` (`createdat`, `surname`, `email`, `enabled`, `customerid`,`name`, `password`, `username`, `companyid`, `profileid`) VALUES (sysdate(), 'roman', 'caroman@banesco.com', 1, 'V24286418','Chacrlon', '$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq', 'caroman', 2, 2);
INSERT INTO `p2p` (`amount`, `concept`, `paymentid`, `srvtype`, `trndate`, `trntime`, `accountfromid`, `accounttoid`, `deviceid`, `userid`) VALUES ('60', 'Pago movil', '12345678901235', 'P2P', '25-10-2022', '11:26:39', '1', '1', '1', '1');
INSERT INTO `role` (`name`,`description`) VALUES ('P2P','Otorgar vuelto');
INSERT INTO `role` (`name`,`description`) VALUES ('AUV','Autoriza vuelto');
INSERT INTO `role` (`name`,`description`) VALUES ('CEC','Debito electronico');
INSERT INTO `role` (`name`,`description`) VALUES ('CPT','Pago con tarjeta');
INSERT INTO `role` (`name`,`description`) VALUES ('ZEL','Validación zelle');
INSERT INTO `role` (`name`,`description`) VALUES ('DSH','Tus transacciones');
INSERT INTO `role` (`name`,`description`) VALUES ('VPI','Validación pagos interbancarios');
INSERT INTO `profile_role` (`profileid`, `roleid`) VALUES (1, 1);
INSERT INTO `profile_role` (`profileid`, `roleid`) VALUES (1, 2);
INSERT INTO `profile_role` (`profileid`, `roleid`) VALUES (1, 3);
INSERT INTO `profile_role` (`profileid`, `roleid`) VALUES (1, 4);
INSERT INTO `profile_role` (`profileid`, `roleid`) VALUES (1, 5);
INSERT INTO `profile_role` (`profileid`, `roleid`) VALUES (1, 6);
INSERT INTO `profile_role` (`profileid`, `roleid`) VALUES (1, 7);
INSERT INTO `profile_role` (`profileid`, `roleid`) VALUES (2, 1);
INSERT INTO `profile_role` (`profileid`, `roleid`) VALUES (2, 2);
INSERT INTO `profile_role` (`profileid`, `roleid`) VALUES (2, 4);
INSERT INTO `p2p_response` (`referencenumber`, `statuscode`, `statusdesc`, `p2pid`) VALUES ('99976672107', '200', 'Operación exitosa', 1);
INSERT INTO `international_card` (`publickeyid`, `address`, `amount`, `cardholder`, `cardholderid`, `cardnumber`, `city`, `cookie`, `country`, `cvc`, `description`, `email`, `expirationdate`, `keyid`, `state`, `useragent`, `zipcode`, `userid`) VALUES ('07c46e54b563ef1ec1c88c6f4226ca9a', 'Las minas de baruta', '7.10', 'Joiner Ochoa', '22545387', '5588917474572538', 'Caracas', 'sjagrsmiteznwriy4bjk03eo', 'OT', '374', 'Pago de pruebas', 'jochoa3710@outlook.com', '07/2023', '4030AF20-1C04-4ED6-8B9D-DBB1581092C9', 'Miranda', 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 \r\n(KHTML, like Gecko) Chrome/55.0.2883.87 Safari/537.36', '10812', '1');





