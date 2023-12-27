package Home_work_22.Models;

import lombok.*;

@Data
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterLoginActionsModel {
    private String password;
    private String email = "eve.holt@reqres.in";
}