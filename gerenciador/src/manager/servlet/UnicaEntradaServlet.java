package manager.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import manager.acao.Acao;
import manager.acao.AlteraEmpresa;
import manager.acao.ListaEmpresas;
import manager.acao.MostraEmpresa;
import manager.acao.NovaEmpresa;
import manager.acao.NovaEmpresaForm;
import manager.acao.RemoveEmpresa;


@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAcao = request.getParameter("acao");
		
		
//		HttpSession sessao = request.getSession();
//		boolean usuarioNaoEstaLogado = (sessao.getAttribute("usuarioLogado") == null);
//		boolean ehUmaAcaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm")) ;
//		
//		if (ehUmaAcaoProtegida && usuarioNaoEstaLogado){
//			response.sendRedirect("entrada?acao=LoginForm");
//			return;
//		}
//		
		
		
		
		
//		if(paramAcao.equals("ListaEmpresas")) {
//			
//			ListaEmpresas acao = new ListaEmpresas();
//			nome = acao.executa(request, response);
//			
//		} else if(paramAcao.equals("RemoveEmpresa")) {
//			
//			RemoveEmpresa acao = new RemoveEmpresa();
//			nome = acao.executa(request, response);
//			
//		} else if(paramAcao.equals("MostraEmpresas")) {
//			
//			MostraEmpresa acao = new MostraEmpresa();
//			nome = acao.executa(request, response);
//		}else if(paramAcao.equals("AlteraEmpresa")) {
//			
//			AlteraEmpresa acao = new AlteraEmpresa();
//			nome = acao.executa(request, response);
//		
//		}else if(paramAcao.equals("NovaEmpresa")) {
//	
//			NovaEmpresa acao = new NovaEmpresa();
//			nome = acao.executa(request, response);
//		} else if(paramAcao.equals("NovaEmpresaForm")) {
//	
//			NovaEmpresaForm acao = new NovaEmpresaForm();
//			nome = acao.executa(request, response);
//		}
		
		
		
		
	}

}
