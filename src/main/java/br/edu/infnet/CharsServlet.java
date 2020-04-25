package br.edu.infnet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet(("/char"))
public class CharsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CharsServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Dados> records = lerArquivoCSV();

		Gson gson = new Gson();
		String jsonString = gson.toJson(records);
/*		request.setAttribute("dados", jsonString);
		request.getRequestDispatcher("/char.jsp").forward(request, response);*/
		
		response.setContentType("application/json");
		response.getWriter().write(jsonString);
	}

	private List<Dados> lerArquivoCSV() throws IOException {

		List<Dados> records = new ArrayList<Dados>();
		BufferedReader br = null;

		try {

			br = new BufferedReader(
					new FileReader("C:\\Users\\tulio\\Documents\\EclipeWork\\corretoraABC\\MGLU3.SA.csv"));
			String line;
			br.readLine();
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				records.add(new Dados(values[0], values[1], values[2], values[3], values[4], values[5], values[6]));
			}
		} catch (Exception e) {

		} finally {
			br.close();
		}
		return records;
	}

}
