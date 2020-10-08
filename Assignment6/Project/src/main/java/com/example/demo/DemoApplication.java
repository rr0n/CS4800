
      package com.example.demo;
      import org.springframework.boot.SpringApplication;
      import org.springframework.web.bind.annotation.RequestMapping;
      import org.springframework.web.bind.annotation.RequestMethod;
      import org.springframework.boot.autoconfigure.SpringBootApplication;
      import org.springframework.web.bind.annotation.RestController;
      
      @SpringBootApplication
      @RestController
      public class DemoApplication {
        
          
          public static void main(String[] args) {
          SpringApplication.run(DemoApplication.class, args);
          }
          
          @RequestMapping(value="/CNRTT/members", method= RequestMethod.GET )
          public String demo1() {
          return "<!DOCTYPE>\n"
          		+ "\n"
          		+ "<html>\n"
          		+ "\n"
          		+ "<head>\n"
          		+ "	<title>\n"
          		+ "		Team CNRTT\n"
          		+ "	</title>\n"
          		+ "</head>\n"
          		+ "\n"
          		+ "<body>\n"
          		+ "	<h1>Welcome to our group, it is just an acronym of our names</h1>\n"
          		+ "	<h2>Toan Nguyen was here</h2>\n"
          		+ "	<h2>Yeonah Cho was here too</h2>\n"
          		+ "	<h2>Tommy Schmidt was here !!</h2>\n"
          		+ "	<h2>Aaron Lim was here</h2>\n"
          		+ "\n"
          		+ "	\n"
          		+ "</body>\n"
          		+ "\n"
          		+ "</html>";
          }
          

      }
    
