package Home_work_18.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FinalModel {
    private OccupationPart occupation;
    private MaterialStatusPart maritalStatus;
    private EducationPart education;
}
