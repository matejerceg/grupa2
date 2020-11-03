package hr.fer.ilj.iljgrupa2;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;




@WebMvcTest(LogController.class)
class LogControllerTest {

  @Autowired
  private MockMvc mvc;

  //@MockBean
  //private UserService userService;

  @Test
  void allUsers_noUsers() throws Exception {
   // given(userService.getAll())
   //   .willReturn(List.of());
	//LogEntry primjer = new LogEntry("2017-03-14 15:17:17.054","DEBUG", "poruka1","dfdf",133,1L);
	  
	
    mvc.perform(post("/log")
      .content("{\"time\":\"2017-03-14 15:17:17.054\",\"level\":\"DEBUG\",\"message\":\"poruka1\", \"thread\":\"[banana]\",\"pid\":12345,\"id\":1}")
      .contentType(MediaType.APPLICATION_JSON)
      .accept(MediaType.APPLICATION_JSON))
      .andExpect(status().isCreated()); 
  }

}

