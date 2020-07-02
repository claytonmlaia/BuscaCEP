<%-- 
    Document   : consultaWebSeivice
    Created on : 24/05/2018, 12:34:41
    Author     : CLAYTON
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <%-- start web service invocation --%><hr/>
    <%
    try {
	br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteService service = new br.com.correios.bsb.sigep.master.bean.cliente.AtendeClienteService();
	br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente port = service.getAtendeClientePort();
	 // TODO initialize WS operation arguments here
	String cep = request.getParameter("cep");
	// TODO process result here
	br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP result = port.consultaCEP(cep);
        out.println("O endereço encontrado é: " +"<br/>"+"<br/>");
	out.println("Endereço : "+result.getEnd() +"<br/>");
        out.println("Bairro : "+result.getBairro()+"<br/>");
        out.println("Cidade : "+result.getCidade()+"<br/>");
        out.println("UF : "+result.getUf()+"<br/>");
        
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
