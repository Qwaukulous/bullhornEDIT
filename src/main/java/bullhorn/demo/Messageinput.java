package bullhorn.demo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Messageinput {
    @NotNull
    @Min(1)
    private long id;

    @NotNull
    @Size(min=1, max=10)
    private String title;

    @NotNull
    @Size(min=3, max=40)
    private String content;

    @NotNull
    @Size(min=10, max=15)
    private int postedDate;

    @NotNull
    @Size(min=1, max=15);
    private String postedBy

}
