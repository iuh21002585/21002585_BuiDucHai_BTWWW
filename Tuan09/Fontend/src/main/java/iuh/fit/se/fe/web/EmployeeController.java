package iuh.fit.se.fe.web;

import ch.qos.logback.core.model.Model;
import iuh.fit.se.fe.dto.EmployeeDto;
import iuh.fit.se.fe.dto.PageResponse;
import iuh.fit.se.fe.service.EmployeeClient;
import jakarta.validation.Valid;
import org.springframework.stereotype.*;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private final EmployeeClient client;

    public EmployeeController(EmployeeClient client) {
        this.client = client;
    }

    @GetMapping
    public String list(@RequestParam(defaultValue = "0") int page,
                       @RequestParam(defaultValue = "10") int size,
                       Model model){
        PageResponse<EmployeeDto> pr = client.list(page, size);
        model.addAttribute("page", pr);
        return "employee/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("employee", new EmployeeDto());
        return "employee/create";
    }

    @PostMapping("/create")
    public String doCreate(@Valid @ModelAttribute("employee") EmployeeDto form,
                           BindingResult br,
                           RedirectAttributes ra){
        if(br.hasErrors()){
            return "employee/create";
        }
        try{
            client.create(form);
            ra.addFlashAttribute("message","Created successfully");
            return "redirect:/employee-ui/employees";
        }catch(RestClientResponseException ex){
            br.reject("api.error", ex.getResponseBodyAsString());
            return "employee/create";
        }
    }
}
