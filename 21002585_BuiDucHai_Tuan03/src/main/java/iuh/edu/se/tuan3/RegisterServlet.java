package iuh.edu.se.tuan3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import iuh.edu.se.tuan3.Student;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8"); // tránh lỗi font tiếng Việt

        // Lấy dữ liệu từ form
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String dobDay = request.getParameter("dobDay");
        String dobMonth = request.getParameter("dobMonth");
        String dobYear = request.getParameter("dobYear");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String pincode = request.getParameter("pincode");
        String state = request.getParameter("state");
        String country = "India"; // readonly trên form

        // Checkbox hobbies
        String[] hobbiesArr = request.getParameterValues("hobby");
        List<String> hobbies = hobbiesArr != null ? Arrays.asList(hobbiesArr) : null;

        // Bảng điểm
        String board10 = request.getParameter("board10");
        String percent10 = request.getParameter("percent10");
        String year10 = request.getParameter("year10");

        String board12 = request.getParameter("board12");
        String percent12 = request.getParameter("percent12");
        String year12 = request.getParameter("year12");

        String boardGrad = request.getParameter("boardGrad");
        String percentGrad = request.getParameter("percentGrad");
        String yearGrad = request.getParameter("yearGrad");

        String boardMasters = request.getParameter("boardMasters");
        String percentMasters = request.getParameter("percentMasters");
        String yearMasters = request.getParameter("yearMasters");

        // Khóa học
        String course = request.getParameter("course");

        // Tạo Student object
        Student student = new Student(firstName, lastName, dobDay, dobMonth, dobYear,
                email, mobile, gender, address, city, pincode, state, country, hobbies,
                board10, percent10, year10,
                board12, percent12, year12,
                boardGrad, percentGrad, yearGrad,
                boardMasters, percentMasters, yearMasters,
                course);

        // Gửi sang JSP hiển thị
        request.setAttribute("student", student);
        request.getRequestDispatcher("result-form.jsp").forward(request, response);
    }
}

