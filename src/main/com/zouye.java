package main.com;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/zouye")
public class zouye extends HttpServlet {
    List<entity> list = new ArrayList();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        list.add(new entity("3.jpeg", "张三", 28, "男"));
        list.add(new entity("4.jpeg", "李四", 25, "女"));
        list.add(new entity("5.jpeg", "王五", 23, "男"));
        list.add(new entity("6.jpeg", "赵六", 20, "男"));
        System.out.println("hello");
        System.out.println("hot-fix");
        req.setAttribute("list", list);
        req.getRequestDispatcher("zouye.jsp").forward(req, resp);
    }
}
