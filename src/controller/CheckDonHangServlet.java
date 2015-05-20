package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bo.CheckDonHangBO;

/**
 * Servlet implementation class CheckDonHangServlet
 */
public class CheckDonHangServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CheckDonHangServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String userID = request.getParameter("userID");
		String orderID = request.getParameter("orderID");
		String customerName = request.getParameter("customerName");
		String customerPhone = request.getParameter("customerPhone");
		String customerAddress = request.getParameter("customerAddress");
		String addressGift = request.getParameter("addressGift");
		String timeGift = request.getParameter("timeGift");
		String numberGift = request.getParameter("numberGift");

		CheckDonHangBO checkDonHangBO = new CheckDonHangBO();
		Boolean isValid = checkDonHangBO.isValidDonHang(userID, orderID,
				customerName, customerPhone, customerAddress, addressGift, timeGift,
				numberGift);
	}

}
