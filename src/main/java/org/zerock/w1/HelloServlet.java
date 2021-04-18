package org.zerock.w1;

import lombok.extern.log4j.Log4j2;
import org.zerock.w1.dto.SampleDTO;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
@Log4j2
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        SampleDTO sampleDTO = new SampleDTO();
        sampleDTO.setFirst("Hello");
        sampleDTO.setLast("World");

        log.trace("trace...... ");
        log.debug("debug.........");
        log.info("info.............");
        log.warn("warn...............");
        log.error("ERROR................");
        log.fatal("fatal..................");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}