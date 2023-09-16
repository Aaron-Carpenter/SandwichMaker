package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.formatLettuceWrap;

@WebServlet("/makeLettuceWrapServlet")
public class makeLettuceWrapServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public makeLettuceWrapServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String lettuceWrapContents = request.getParameter("lettuceWrapContents");
        PrintWriter writer = response.getWriter();
        writer.println("Hair's yo-wr formatted lettuce wrap, enjoy!");
        writer.println();
        formatLettuceWrap.printLettuceWrap(lettuceWrapContents, writer);
        writer.close();
    }

}
