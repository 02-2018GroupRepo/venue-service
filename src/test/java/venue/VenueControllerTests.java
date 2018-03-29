package venue;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class VenueControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void noParamVenueShouldReturnBadRequestMessage() throws Exception {
        this.mockMvc.perform(get("/venue")).andDo(print()).andExpect(status().isBadRequest());        
    }

    @Test
    public void paramVenueNameShouldReturnCorrectVenue() throws Exception {
        this.mockMvc.perform(get("/venue").param("name", "Terminal West"))
                .andDo(print()).andExpect(status().isOk())
                .andExpect(jsonPath("$.venueName").value("Terminal West"));
    }
}
