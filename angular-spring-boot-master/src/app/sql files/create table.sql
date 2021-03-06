CREATE TABLE IF NOT EXISTS `persondb`.`person` (
  `ID` INT(11) NOT NULL AUTO_INCREMENT,
  `FIRSTNAME` VARCHAR(50) NOT NULL,
  `LASTNAME` VARCHAR(100) NULL DEFAULT NULL,
  `EMAIL` VARCHAR(45) NOT NULL,
  `ADDRESS` VARCHAR(45) NULL DEFAULT NULL,
  `CITY` VARCHAR(45) NULL DEFAULT NULL,
  `PASSWORD` VARCHAR(100) NULL DEFAULT NULL,
  `ENABLED` TINYINT(1) NULL DEFAULT NULL,
  `SECRET` VARCHAR(45) NULL DEFAULT NULL,
  `EXPIRYDATE` DATE NULL DEFAULT NULL,
  `TOKEN` VARCHAR(200) NULL DEFAULT NULL,
  `EMAIL_VERIFICATION_ATTEMPTS` INT(2) NULL DEFAULT NULL,
  `EMAIL_VERIFICATION_HASH` VARCHAR(45) NULL DEFAULT NULL,
  `STATUS` VARCHAR(15) NOT NULL,
  `DTYPE` VARCHAR(31) NULL DEFAULT NULL,
  `DATE_REGISTERED` TIMESTAMP NOT NULL DEFAULT '2000-01-01 00:00:00',
  `AVATAR` BLOB NULL DEFAULT NULL,
  `IMAGE` VARCHAR(45) NULL DEFAULT NULL,
  `expiry_date` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`ID`, `EMAIL`))
ENGINE = InnoDB
AUTO_INCREMENT = 66
DEFAULT CHARACTER SET = utf8;