package uk.ac.leedsbeckett.albertarkaa.libraryportal.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String studentId;
}
