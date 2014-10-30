CREATE TABLE user_patient_card
(
    id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    user_patient_id BIGINT NOT NULL,
    hospital_uuid VARCHAR(40) NOT NULL,
    card_no VARCHAR(40),
    gmt_created DATETIME,
    gmt_modified DATETIME,
    card_status TINYINT DEFAULT 0 NOT NULL,
    last_used_time DATETIME,
    card_type TINYINT
);
CREATE INDEX idx_patientId_hospitaluuid ON user_patient_card (user_patient_id, hospital_uuid);
CREATE INDEX patient_cardid ON user_patient_card (user_patient_id);
