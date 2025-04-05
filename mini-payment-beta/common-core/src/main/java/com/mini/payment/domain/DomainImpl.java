package com.mini.payment.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@MappedSuperclass
public class DomainImpl implements Serializable {
    @Id
    @GeneratedValue(generator = "sequenceGenerator")
    @GenericGenerator(name = "sequenceGenerator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "ID_SEQUENCE"),
                    @Parameter(name = SequenceStyleGenerator.INITIAL_PARAM, value = "2000"),
                    @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1"),
                    @Parameter(name = SequenceStyleGenerator.OPT_PARAM, value = "pooled")
            })
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime = new Date();

    @Version
    private Integer version;
    private String status;
    private String creator;
    private String editor;
    private Date editTime;
    private String comment;
}
