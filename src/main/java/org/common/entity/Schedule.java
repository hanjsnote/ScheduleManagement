package org.common.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Getter
@RequiredArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Schedule extends BaseEntity{ //createdAt, updatedAt을 상속 받았다.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String password;
    private String title;
    private String content;

    public Schedule(String name, String password, String title, String content){
        this.name = name;
        this.password = password;
        this.title = title;
        this.content = content;
    }

    public void updateSchedule(String name, String title){
        this.name = name;
        this.title = title;
    }
}
