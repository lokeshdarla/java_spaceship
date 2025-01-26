package org.lokeshdarla.blogapp.Models;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "users")
public class UserModel {
    @Id
    private String id;

    @Indexed(unique = true)
    @NotNull(message = "username cannot be null")
    private String username;

    @Indexed(unique = true)
    @NotNull(message = "email cannot be null")
    private String email;

    private String password;

    @CreatedDate
    private LocalDateTime CreatedAt;
}
