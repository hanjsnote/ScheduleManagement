package org.common.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@Getter
@RequiredArgsConstructor
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
}
