package br.fatecrl.mvcdemo.controllers;
import br.fatecrl.mvcdemo.models.Aluno;
import org.springframework.boot.autoconfigure.quartz.QuartzTransactionManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/alunos")
public class AlunoController {

    private static final List<Aluno> alunos = new ArrayList<Aluno>();

    public AlunoController() {
        alunos.add(new Aluno("123456","Claudio",10,8));
        alunos.add(new Aluno("222222","Mariana",6,8));
        alunos.add(new Aluno("333333","Guilherme",6,4));
    }

    @GetMapping
    public String getAlunos(Model model)
    {
        model.addAttribute("alunos", alunos);
        return "alunos";

    }
}