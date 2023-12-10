package Home_work_18.Models;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MaterialStatusPart {
    @SerializedName("1")
    private String one;
    @SerializedName("2")
    private String two;
    @SerializedName("3")
    private String three;
    @SerializedName("4")
    private String four;
    @SerializedName("5")
    private String five;
}
