package ErpProject.ErpProjectV3.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

    @CreatedDate
    @Column(name = "create_At", updatable = false, nullable = false)
    private LocalDateTime createAt;

    @LastModifiedDate
    @Column(name = "update_At", updatable = true, nullable = false)
    private LocalDateTime updateAt;

}
