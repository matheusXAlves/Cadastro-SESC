/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.servlets;

import br.com.model.bean.Comerciario;
import br.com.model.dao.ComerciarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ednilson
 */
@WebServlet(name = "ServletCadComerciario", urlPatterns = {"/ServletCadComerciario"})
public class ServletCadComerciario extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            Comerciario comerciario = new Comerciario();

            comerciario.setNome(request.getParameter("nome"));
            comerciario.setCpf(Integer.parseInt(request.getParameter("cpf")));
            comerciario.setDtNascimento(request.getParameter("dtNascimento"));
            comerciario.setSexo(request.getParameter("sexo"));
            comerciario.setStCivil(request.getParameter("stCivil"));
            comerciario.setCEP(Integer.parseInt(request.getParameter("cep")));
            comerciario.setEndereco(request.getParameter("endereco"));
            comerciario.setComplemento(request.getParameter("complemento"));
            comerciario.setBairro(request.getParameter("bairro"));
            comerciario.setUF(request.getParameter("uf"));
            comerciario.setCidade(request.getParameter("cidade"));
            comerciario.setHabitacao(request.getParameter("habitacao"));
            comerciario.setNomePai(request.getParameter("nomePai"));
            comerciario.setNomeMae(request.getParameter("nomeMae"));
            comerciario.setRG(Integer.parseInt(request.getParameter("rg")));
            comerciario.setOrgEmissor("emissor");
            comerciario.setNaturalidade(request.getParameter("naturalidade"));
            comerciario.setNacionalidade(request.getParameter("nacionalidade"));
            comerciario.setProfissao(request.getParameter("profissao"));
            comerciario.setRenda(Integer.parseInt(request.getParameter("renda")));
            comerciario.setGrauInstru(request.getParameter("grauInstrucao"));
            comerciario.setTelCelular(Integer.parseInt(request.getParameter("celular")));
            comerciario.setTelResidencial(Integer.parseInt(request.getParameter("residencial")));
            comerciario.setTelComercial(Integer.parseInt(request.getParameter("comercial")));
            comerciario.setEmail(request.getParameter("email"));

            ComerciarioDAO comDao = new ComerciarioDAO();
            comDao.cadComerciario(comerciario);

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletCadComerciario</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletCadComerciario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
