package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.DonHang;
import model.bo.CheckDonHangBO;

/**
 * Servlet implementation class ShowHomeServlet
 */
public class ShowHomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowHomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String destination = "/home.jsp";
		RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
		CheckDonHangBO checkDonHangBO = new CheckDonHangBO();
		ArrayList<DonHang> allDonHang = checkDonHangBO.getDonHang();
		request.setAttribute("ListDonHang", allDonHang);
		rd.forward(request, response);
		
	}

}
