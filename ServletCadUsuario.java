/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.model.servlets;

import br.com.functions.FormWriter;
import br.com.model.bean.Usuario;
import br.com.model.dao.UsuarioDAO;
import static java.awt.SystemColor.text;
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
@WebServlet(name = "ServletCadUsuario", urlPatterns = {"/ServletCadUsuario"})
public class ServletCadUsuario extends HttpServlet {

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

            Usuario usuario = new Usuario();
            usuario.setNome(request.getParameter("nome"));
            usuario.setCpf(Long.parseLong(request.getParameter("cpf")));
            usuario.setDtNascimento(request.getParameter("dtNascimento"));
            usuario.setSexo(request.getParameter("sexo"));
            usuario.setStCivil(request.getParameter("stCivil"));
            usuario.setCEP(Integer.parseInt(request.getParameter("cep")));
            usuario.setEndereco(request.getParameter("endereco"+" "+request.getParameter("complemento")));
            usuario.setBairro(request.getParameter("bairro"));
            usuario.setUF(request.getParameter("uf"));
            usuario.setCidade(request.getParameter("cidade"));
            usuario.setHabitacao(request.getParameter("habitacao"));
            usuario.setNomePai(request.getParameter("nomePai")+" ");
            usuario.setNomeMae(request.getParameter("nomeMae"));
            usuario.setRG(Integer.parseInt(request.getParameter("rg")));
            usuario.setOrgEmissor("emissor");
            usuario.setNaturalidade(request.getParameter("naturalidade"));
            usuario.setNacionalidade(request.getParameter("nacionalidade"));
            usuario.setProfissao(request.getParameter("profissao"));
            usuario.setRenda(Integer.parseInt(request.getParameter("renda")));
            usuario.setGrauInstru(request.getParameter("grauInstrucao"));
            usuario.setTelCelular(Integer.parseInt(request.getParameter("celular")));
            usuario.setTelResidencial(Integer.parseInt(request.getParameter("residencial")));
            usuario.setTelComercial(Integer.parseInt(request.getParameter("comercial")));
            usuario.setEmail(request.getParameter("email"));
            FormWriter.writeOnFile(text);
            request.getRequestDispatcher("listaDependentes.jsp").forward(request, response);

            UsuarioDAO userDao = new UsuarioDAO();
            userDao.cadUsuario(usuario);
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletCadUsuario</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Usuario Castrado com Sucesso</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        catch (Exception e) {
			e.printStackTrace();
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
