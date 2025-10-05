package ru.home.tasktracker.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProjectDto {

    @NonNull
    private Long id;

    @NonNull
    private String name;

    @NonNull
    @JsonProperty("created_at")
    private Instant createdAt;
}
