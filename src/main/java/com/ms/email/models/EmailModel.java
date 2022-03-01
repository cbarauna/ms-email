package com.ms.email.models;

import com.ms.email.enums.StatusEmail;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.domain.Persistable;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = " TB_EMAIL")
@Data
public class EmailModel implements Persistable<UUID> {

    @Id
    @GenericGenerator(name = "UUIDGenerator", strategy = "uuid2")
    @GeneratedValue(generator = "UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    //@GeneratedValue(strategy = GenerationType.AUTO )
    private UUID emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String message;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;

    @Override
    public UUID getId() {
        return emailId;
    }

    @Override
    public boolean isNew() {
        return emailId == null;
    }
}
